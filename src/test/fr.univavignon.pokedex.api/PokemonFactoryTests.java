import main.java.fr.univavignon.pokedex.api.IPokemonFactory;
import main.java.fr.univavignon.pokedex.api.Pokemon;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class PokemonFactoryTests {
    private Pokemon bulbizarre;
    private Pokemon pokemon;

    @Before
    public void init() throws Exception {
        bulbizarre = new Pokemon(0, "Bulbizarre", 126, 126, 90, 613, 64, 4000, 4, 56);

        IPokemonFactory pokemonFactory = Mockito.mock(IPokemonFactory.class);
        Mockito.when(pokemonFactory.createPokemon(0, 613, 64, 4000, 4)).thenReturn(bulbizarre);

        pokemon = pokemonFactory.createPokemon(0, 613, 64, 4000, 4);
    }

    @Test
    public void okIfBulbizarresStatsReturnBulbizarre() {
        Assert.assertTrue(pokemon.getName() == bulbizarre.getName());
    }
}
