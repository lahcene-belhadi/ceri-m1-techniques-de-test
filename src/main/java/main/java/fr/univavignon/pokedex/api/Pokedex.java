package main.java.fr.univavignon.pokedex.api;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Pokedex implements IPokedex {
    List<Pokemon> pokedex;

    /**
     * Creates an instance of Pokedex
     */
    public Pokedex() {
        pokedex = new ArrayList<>();
    }

    /**
     * Returns the number of Pokemons inside the Pokedex
     *
     * @return the number of Pokemons inside the Pokedex
     */
    @Override
    public int size() {
        return pokedex.size();
    }

    /**
     * Adds a Pokemon to the Pokedex
     *
     * @param pokemon Pokemon to add to this pokedex.
     * @return the size of the Pokedex
     */
    @Override
    public int addPokemon(Pokemon pokemon) {
        pokedex.add(pokemon);
        return pokedex.size();
    }

    @Override
    public Pokemon getPokemon(int id) throws PokedexException {
        return null;
    }

    @Override
    public List<Pokemon> getPokemons() {
        return null;
    }

    @Override
    public List<Pokemon> getPokemons(Comparator<Pokemon> order) {
        return null;
    }

    @Override
    public Pokemon createPokemon(int index, int cp, int hp, int dust, int candy) {
        return null;
    }

    @Override
    public PokemonMetadata getPokemonMetadata(int index) throws PokedexException {
        return null;
    }
}
