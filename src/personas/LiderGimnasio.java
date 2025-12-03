package personas;

import pokemon.Pokemon;

//creamos la clase LiderGimnasio, que hereda de la clase Persona
public class LiderGimnasio extends Persona{
    //creamos sus atributos
    private String region;
    private String ciudad;
    private boolean sinDerrotar;

    //creamos un constructor completo, con todos los atributos tanto de Persona como de LiderGimnasio
    public LiderGimnasio(String nombre, int edad, Pokemon pokemonFavorito, int numPokemon, String region, String ciudad, boolean sinDerrotar) {
        super(nombre, edad, pokemonFavorito, numPokemon);
        this.region = region;
        this.ciudad = ciudad;
        this.sinDerrotar = sinDerrotar;
    }

    //creamos un constructor vacío
    public LiderGimnasio() {
    }

    //creamos los getters y setters

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public boolean isSinDerrotar() {
        return sinDerrotar;
    }

    public void setSinDerrotar(boolean sinDerrotar) {
        this.sinDerrotar = sinDerrotar;
    }

    //finalmente, creamos un toString con el texto indicado

    @Override
    public String toString() {
        return "LIDER " + this.getNombre() + ", de ciudad " + this.ciudad + " (" + this.getEdad() + " años)";
    }
}
