package fr.univavignon.pokedex.api;

import main.java.fr.univavignon.pokedex.api.PokemonFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PokemonFactoryTests {
    private PokemonFactory pokemonFactory;

    @Before
    public void init() throws Exception {
        pokemonFactory = new PokemonFactory();
    }

    @Test
    public void okIfPokemonIsNotNull() {
        Assert.assertNotNull(pokemonFactory.createPokemon(0, 0, 0, 0, 0));
    }
}
