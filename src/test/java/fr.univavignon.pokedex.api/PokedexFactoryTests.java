package fr.univavignon.pokedex.api;

import main.java.fr.univavignon.pokedex.api.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PokedexFactoryTests {
    private PokemonFactory pokemonFactory;
    private PokemonMetadataProvider pokemonMetadataProvider;
    private PokedexFactory pokedexFactory;

    @Before
    public void init() {
        pokemonFactory = new PokemonFactory();
        pokemonMetadataProvider = new PokemonMetadataProvider();
        pokedexFactory = new PokedexFactory();
    }

    @Test
    public void okIfPokedexNotNull() {
        Assert.assertNotNull(pokedexFactory.createPokedex(pokemonMetadataProvider, pokemonFactory));
    }
}
