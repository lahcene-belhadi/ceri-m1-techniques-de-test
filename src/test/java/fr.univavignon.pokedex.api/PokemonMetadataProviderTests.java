package fr.univavignon.pokedex.api;

import main.java.fr.univavignon.pokedex.api.PokedexException;
import main.java.fr.univavignon.pokedex.api.PokemonMetadata;
import main.java.fr.univavignon.pokedex.api.PokemonMetadataProvider;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PokemonMetadataProviderTests {
    PokemonMetadataProvider pokemonMetadataProvider;

    @Before
    public void init() {
        pokemonMetadataProvider = new PokemonMetadataProvider();
    }

    @Test
    public void okIfPokemonMetadataIsNotNull() {
        PokemonMetadata pokemonMetadata = null;
        try {
            pokemonMetadata = pokemonMetadataProvider.getPokemonMetadata(0);
        } catch (PokedexException pokedexException) {
            pokedexException.printStackTrace();
        }

        Assert.assertNotNull(pokemonMetadata);
    }

    @Test
    public void okIfThrowsWhenBadId() throws PokedexException {
        Assert.assertThrows(PokedexException.class, () -> pokemonMetadataProvider.getPokemonMetadata(1));
    }
}
