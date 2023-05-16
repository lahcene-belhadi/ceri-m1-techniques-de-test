package fr.univavignon.pokedex.api;

import main.java.fr.univavignon.pokedex.api.PokedexFactory;
import main.java.fr.univavignon.pokedex.api.PokemonMetadataProvider;
import main.java.fr.univavignon.pokedex.api.RocketPokemonFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RocketPokemonFactoryTests {
    private RocketPokemonFactory pokemonFactory;

    @Before
    public void init() throws Exception {
        pokemonFactory = new RocketPokemonFactory();
    }

    @Test
    public void okIfPokemonIsNotNull() {
        Assert.assertNotNull(pokemonFactory.createPokemon(0, 0, 0, 0, 0));
    }
}
