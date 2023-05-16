package main.java.fr.univavignon.pokedex.api;

import java.util.ArrayList;
import java.util.List;

public class PokemonMetadataProvider implements IPokemonMetadataProvider {
    List<PokemonMetadata> pokemonMetadataList;

    public PokemonMetadataProvider() {
        pokemonMetadataList = new ArrayList<>();
        pokemonMetadataList.add(new PokemonMetadata(0, "Zizou", 0, 5, 10));
    }

    @Override
    public PokemonMetadata getPokemonMetadata(int index) throws PokedexException {
        if (index > pokemonMetadataList.size() - 1) {
            throw new PokedexException("Pokémon à l'index " + index + "introuvable");
        }

       return pokemonMetadataList.get(index);
    }
}
