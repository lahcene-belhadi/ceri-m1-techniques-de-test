package fr.univavignon.pokedex.api;

import main.java.fr.univavignon.pokedex.api.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Comparator;

public class PokedexTests {
    private IPokedex pokedex;

    private Pokemon createDummyPokemon() {
        return new Pokemon(1, "Dummy", 0, 0, 0, 0, 0, 0, 0, 0);
    }

    @Before
    public void init() throws Exception {
        PokemonMetadataProvider pokemonMetadataProvider = new PokemonMetadataProvider();
        PokemonFactory pokemonFactory = new PokemonFactory();
        pokedex = new Pokedex(pokemonMetadataProvider, pokemonFactory);
    }

    @Test
    public void okIfSizeZeroIfNoPokemon() {
        Assert.assertEquals(pokedex.size(), 0);
    }

    @Test
    public void okIfSizeNotZeroAfterPokemonAdded() {
        // creates a dummy pokemon
        Pokemon pokemon = createDummyPokemon();
        pokedex.addPokemon(pokemon);

        Assert.assertEquals(pokedex.size(), 1);
    }

    @Test
    public void okIfPokemonReturnedIsNotNull() {
        Pokemon pokemon = createDummyPokemon();
        pokedex.addPokemon(pokemon);

        try {
            Pokemon returned = pokedex.getPokemon(0);
            Assert.assertNotNull(returned);
        } catch (PokedexException exception) {
            exception.printStackTrace();
        }
    }

    @Test
    public void okIfGetPokemonThrowsExceptionIfPokemonDoesntExist() throws PokedexException {
        Pokemon pokemon = createDummyPokemon();
        pokedex.addPokemon(pokemon);

        Assert.assertThrows(PokedexException.class, () -> pokedex.getPokemon(1));
    }

    @Test
    public void okIfGetPokemonsIsNotNull() {
        Assert.assertNotNull(pokedex.getPokemons());
    }

    @Test
    public void okIfGetPokemonsWithComparatorIsNotNull() {
        Comparator<Pokemon> comparator = PokemonComparators.NAME;
        Assert.assertNotNull(comparator);
    }

    @Test
    public void okIfCreatePokemonDoesntReturnNull() {
        Assert.assertNotNull(pokedex.createPokemon(2, 0, 1, 0, 1));
    }

    @Test
    public void okIfGetPokemonMetadataThrowsWhenBadId() {
        Pokemon pokemon = createDummyPokemon();
        pokedex.addPokemon(pokemon);

        Assert.assertThrows(PokedexException.class, () -> pokedex.getPokemonMetadata(1));
    }

    @Test
    public void okIfPokemonMetadataNotNull() {
        PokemonMetadata pokemonMetadata = null;
        try {
            pokemonMetadata = pokedex.getPokemonMetadata(0);
        } catch (PokedexException pokedexException) {
            pokedexException.printStackTrace();
        }

        Assert.assertNotNull(pokemonMetadata);
    }

    @Test
    public void okIfSizeZero() {
        Assert.assertTrue(pokedex.size() == 0);
    }
}
