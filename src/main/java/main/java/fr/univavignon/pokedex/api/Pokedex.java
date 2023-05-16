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

    /**
     * Returns the requested Pokemon, throws a PokedexException otherwise
     *
     * @param id Unique pokedex relative identifier.
     * @return the requested Pokemon
     * @throws PokedexException if the Pokemon cannot be found
     */
    @Override
    public Pokemon getPokemon(int id) throws PokedexException {
        if (id > pokedex.size() - 1) {
            throw new PokedexException("The Pokemon with id " + id + "does not exist.");
        }

        return pokedex.get(id);
    }

    /**
     * Returns the pokedex
     *
     * @return the pokedex
     */
    @Override
    public List<Pokemon> getPokemons() {
        return pokedex;
    }

    /**
     * Orders pokemon by name and returns the sorted list
     *
     * @param order Comparator instance used for sorting the created view.
     * @return the name sorted list
     */
    @Override
    public List<Pokemon> getPokemons(Comparator<Pokemon> order) {
        pokedex.sort(order);
        return pokedex;
    }

    @Override
    public Pokemon createPokemon(int index, int cp, int hp, int dust, int candy) {
        return new Pokemon(index, "Dummy", 0, 0, 0, cp, hp, dust, candy, 0);
    }

    @Override
    public PokemonMetadata getPokemonMetadata(int index) throws PokedexException {
        Pokemon pokemon = getPokemon(index);

        return null;
    }
}
