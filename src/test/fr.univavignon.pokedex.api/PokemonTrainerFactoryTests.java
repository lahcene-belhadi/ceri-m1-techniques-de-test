import main.java.fr.univavignon.pokedex.api.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class PokemonTrainerFactoryTests {
    private PokemonTrainer pokemonTrainer;

    @Before
    public void init() throws Exception {
        IPokedexFactory pokedexFactory = Mockito.mock(IPokedexFactory.class);
        IPokedex pokedex = Mockito.mock(IPokedex.class);
        IPokemonTrainerFactory pokemonTrainerFactory = Mockito.mock(IPokemonTrainerFactory.class);

        Mockito.when(pokemonTrainerFactory.createTrainer("Trainer", Team.VALOR, pokedexFactory)).thenReturn(new PokemonTrainer("Trainer", Team.VALOR, pokedex));

        pokemonTrainer = pokemonTrainerFactory.createTrainer("Trainer", Team.VALOR, pokedexFactory);
    }

    @Test
    public void okIfTrainerNameIsTrainer() {
        Assert.assertTrue(pokemonTrainer.getName() == "Trainer");
    }
}
