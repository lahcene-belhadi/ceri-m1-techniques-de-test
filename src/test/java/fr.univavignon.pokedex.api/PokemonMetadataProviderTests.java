package fr.univavignon.pokedex.api;

import main.java.fr.univavignon.pokedex.api.IPokemonMetadataProvider;
import main.java.fr.univavignon.pokedex.api.PokemonMetadata;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;


public class PokemonMetadataProviderTests {
    private PokemonMetadata bulbizarre;

    @Before
    public void init() throws Exception {
        IPokemonMetadataProvider pokemonMetadataProvider = Mockito.mock(IPokemonMetadataProvider.class);
        Mockito.when(pokemonMetadataProvider.getPokemonMetadata(0)).thenReturn(new PokemonMetadata(0, "Bulbizarre", 126, 126, 90));
        bulbizarre = pokemonMetadataProvider.getPokemonMetadata(0);
    }

    @Test
    public void okIfBulbizarreIsNotNull() {
        Assert.assertTrue(bulbizarre != null);
    }
}
