import main.java.fr.univavignon.pokedex.api.IPokedex;

import main.java.fr.univavignon.pokedex.api.IPokedexFactory;
import main.java.fr.univavignon.pokedex.api.IPokemonFactory;
import main.java.fr.univavignon.pokedex.api.IPokemonMetadataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

import org.mockito.Mockito;

public class PokedexTests {
    private IPokedex pokedex;

    @Before
    public void init() throws Exception {
        IPokemonFactory pokemonFactory = Mockito.mock(IPokemonFactory.class);
        IPokemonMetadataProvider pokemonMetadataProvider = Mockito.mock(IPokemonMetadataProvider.class);
        IPokedexFactory pokedexFactory = Mockito.mock(IPokedexFactory.class);

        Mockito.when(pokedexFactory.createPokedex(pokemonMetadataProvider, pokemonFactory)).thenReturn(Mockito.mock(IPokedex.class));
        pokedex = pokedexFactory.createPokedex(pokemonMetadataProvider, pokemonFactory);
    }

    @Test
    public void okIfSizeZero() {
        Assert.assertTrue(pokedex.size() == 0);
    }
}
