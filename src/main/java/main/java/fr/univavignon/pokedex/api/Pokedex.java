package main.java.fr.univavignon.pokedex.api;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Pokedex implements IPokedex {
    List<Pokemon> pokedex;
    PokemonMetadataProvider pokemonMetadataProvider;
    PokemonFactory pokemonFactory;

    /**
     * Creates an instance of Pokedex
     */
    public Pokedex(PokemonMetadataProvider pokemonMetadataProvider, PokemonFactory pokemonFactory) {
        this.pokemonMetadataProvider = pokemonMetadataProvider;
        this.pokemonFactory = pokemonFactory;
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

    /**
     * Creates a Pokemon
     *
     * @param index Pokemon index.
     * @param cp    Pokemon CP.
     * @param hp    Pokemon HP.
     * @param dust  Required dust for upgrading pokemon.
     * @param candy Required candy for upgrading pokemon.
     * @return the newly created Pokemon
     */
    @Override
    public Pokemon createPokemon(int index, int cp, int hp, int dust, int candy) {
        return pokemonFactory.createPokemon(index, cp, hp, dust, candy);
    }

    /**
     * Returns the Pokemon's metadata
     *
     * @param index Index of the pokemon to retrieve metadata for.
     * @return the Pokemon's metadata
     * @throws PokedexException when the Pokemon is not found
     */
    @Override
    public PokemonMetadata getPokemonMetadata(int index) throws PokedexException {
        return pokemonMetadataProvider.getPokemonMetadata(index);
    }
}
