package pokemon;

//creamos la clase Pocion
public class Pocion {
    //creamos sus atributos
    private int puntosRestaurados;
    private double precio;

    //creamos un constructor completo
    public Pocion(int puntosRestaurados, double precio) {
        this.puntosRestaurados = puntosRestaurados;
        this.precio = precio;
    }

    //creamos un constructor vacío

    public Pocion() {
    }

    //creamos los getters y setters

    public int getPuntosRestaurados() {
        return puntosRestaurados;
    }

    public void setPuntosRestaurados(int puntosRestaurados) {
        this.puntosRestaurados = puntosRestaurados;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //creamos el metodo curar, de tipo void, porque no devuelve nada y con un pokemon de tipo Pokemon como parámetro
    public void curar(Pokemon pokemonCurado){
        //este metodo le suma a los puntos de salud del pokemon, tantos puntos de restauración como tenga la poción
        pokemonCurado.puntosSalud+=this.puntosRestaurados;
    }

    //creamos el metodo getPrecioConImpuesto, con el parámetro impuesto
    public double getPrecioConImpuesto(double impuesto) {
        //este metodo le aplica al precio de la pocion el impuesto; para ello, le suma al mismo precio, el impuesto dividido entre 100
        return this.precio + (this.precio * (impuesto / 100));
    }

    //finalmente, creamos un toString con el texto indicado
    @Override
    public String toString() {
        return "Pocion: " + this.precio + " Pokédólares";
    }
}