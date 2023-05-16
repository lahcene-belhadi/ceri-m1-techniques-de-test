package fr.univavignon.pokedex.api;

import main.java.fr.univavignon.pokedex.api.PokedexFactory;
import main.java.fr.univavignon.pokedex.api.PokemonTrainerFactory;
import main.java.fr.univavignon.pokedex.api.Team;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PokemonTrainerFactoryTests {
    private PokemonTrainerFactory pokemonTrainerFactory;

    @Before
    public void init() throws Exception {
        pokemonTrainerFactory = new PokemonTrainerFactory();
    }

    @Test
    public void okIfPokemonTrainerIsNotNull() {
        PokedexFactory pokedexFactory = new PokedexFactory();
        Assert.assertNotNull(pokemonTrainerFactory.createTrainer("Zizou", Team.MYSTIC, pokedexFactory));
        ;
    }
}
