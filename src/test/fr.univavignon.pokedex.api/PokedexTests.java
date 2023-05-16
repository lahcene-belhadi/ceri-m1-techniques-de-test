import main.java.fr.univavignon.pokedex.api.IPokedex;
import main.java.fr.univavignon.pokedex.api.Pokedex;
import main.java.fr.univavignon.pokedex.api.Pokemon;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PokedexTests {
    private IPokedex pokedex;

    private Pokemon createDummyPokemon(Integer id) {
        int id_ = 1;
        if (id != null) {
            id_ = id;
        }

        return new Pokemon(id_, "Dummy", 0, 0, 0, 0, 0, 0, 0, 0);
    }

    @Before
    public void init() throws Exception {
        pokedex = new Pokedex();
    }

    @Test
    public void okIfSizeZeroIfNoPokemon() {
        Assert.assertEquals(pokedex.size(), 0);
    }

    @Test
    public void okIfSizeNotZeroAfterPokemonAdded() {
        // creates a dummy pokemon
        Pokemon pokemon = createDummyPokemon(null);
        pokedex.addPokemon(pokemon);

        Assert.assertEquals(pokedex.size(), 1);
    }

    @Test
    public void okIfIdIsCorrect() {
        Pokemon pokemon1 = createDummyPokemon(null);
        Pokemon pokemon2 = createDummyPokemon(2);

        pokedex.addPokemon(pokemon1);
        pokedex.addPokemon(pokemon2);


    }

    @Test
    public void okIfSizeZero() {
        Assert.assertTrue(pokedex.size() == 0);
    }
}
