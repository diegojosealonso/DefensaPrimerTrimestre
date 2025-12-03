package personas;
//ya que hemos creado el package "personas"

import pokemon.Pokemon;

//creamos la clase Persona
public class Persona {
    //añadimos sus atributos
    private String nombre;
    private int edad;
    private Pokemon pokemonFavorito;
    private int numPokemon;

    //creamos un constructor completo

    public Persona(String nombre, int edad, Pokemon pokemonFavorito, int numPokemon) {
        this.nombre = nombre;
        this.edad = edad;
        this.pokemonFavorito = pokemonFavorito;
        this.numPokemon = numPokemon;
    }

    //creamos un constructor vacío

    public Persona() {
    }

    //creamos los getters y los setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Pokemon getPokemonFavorito() {
        return pokemonFavorito;
    }

    public void setPokemonFavorito(Pokemon pokemonFavorito) {
        this.pokemonFavorito = pokemonFavorito;
    }

    public int getNumPokemon() {
        return numPokemon;
    }

    public void setNumPokemon(int numPokemon) {
        this.numPokemon = numPokemon;
    }

    //creamos el metodo saludo, de tipo void, ya que imprime por consola un texto
    public void saludo(){
        System.out.println("Hola, soy " + this.nombre + " y mi Pokémon fsavorito es " + this.pokemonFavorito.getNombre());
    }

    //finalmente, creamos un toString

    @Override
    public String toString() {
        return this.nombre + " (" + this.edad + " años)";
    }


}
