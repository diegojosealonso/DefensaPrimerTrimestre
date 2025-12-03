package personas;

import pokemon.Pokemon;

//creamos la clase Entrenador, que extiende de la clase Persona
public class Entrenador extends Persona {
    //creamos sus atributos
    private int medallas;
    //antes de crear el atributo clase, creamos el enum Clase
    public enum Clase{DOMINGUERO, CAZABICHOS, MONTANYERO, PESCADOR, ORNITOLOGO}
    //ahora sí, creamos el atributo clase
    private Clase clase;

    //creamos un constructor completo, seleccionando todos los atributos tanto de Persona como de Entrenador
    public Entrenador(String nombre, int edad, Pokemon pokemonFavorito, int numPokemon, int medallas, Clase clase) {
        super(nombre, edad, pokemonFavorito, numPokemon);
        this.medallas = medallas;
        this.clase = clase;
    }

    public Entrenador(int medallas, Clase clase) {
        this.medallas = medallas;
        this.clase = clase;
    }

    //creamos un constructor vacío

    public Entrenador() {
    }

    //creamos un constructor que ponga medallas a 0

    public Entrenador(String nombre, int edad, Pokemon pokemonFavorito, int numPokemon, Clase clase) {
        super(nombre, edad, pokemonFavorito, numPokemon);
        this.medallas = 0;
        this.clase = clase;
    }

    //creamos los getters y los setters

    public int getMedallas() {
        return medallas;
    }

    public void setMedallas(int medallas) {
        this.medallas = medallas;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    //creamos el metodo ganarMedallas, con el parámetro numMedallas
    public int ganarMedallas(int numMedallas){
        return this.medallas + numMedallas;
    }

    //creamos el metodo ligaDisponible, de tipo boolean, porque devolvéra true si el número de medallas es mayor o igual que 8
    public boolean ligaDisponible(){
        return this.medallas>=8;
    }

    //finalmente, creamos el toString con el texto indicado
    @Override
    public String toString() {
        return this.clase + " " + this.getNombre() + " (" + this.getEdad() + " años)";
    }
}
