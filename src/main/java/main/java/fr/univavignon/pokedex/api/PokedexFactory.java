package main.java.fr.univavignon.pokedex.api;

public class PokedexFactory implements IPokedexFactory {
    /**
     * Creates a new pokedex instance using the given
     * metadataProvider and pokemonFactory.
     *
     * @param metadataProvider Metadata provider the created pokedex will use.
     * @param pokemonFactory   Pokemon factory the created pokedex will use.
     * @return Created pokedex instance.
     */
    @Override
    public IPokedex createPokedex(IPokemonMetadataProvider metadataProvider, IPokemonFactory pokemonFactory) {
        return new Pokedex((PokemonMetadataProvider) metadataProvider, (PokemonFactory) pokemonFactory);
    }
}
