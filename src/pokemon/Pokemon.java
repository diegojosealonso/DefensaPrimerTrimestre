// debido a la creación del package pokemon
package pokemon;

//creamos la clase Pokemon
public class Pokemon {
    //definimos los atributos de la clase Pokemon
    private String nombre;
    private int nivel;
    //creo puntosSalud de tipo protected para poder acceder a este atributo desde la clase Poción
    protected int puntosSalud;
    private int ataque;
    //antes de definir el atributo tipo, tenemos que crear el enum
    public enum Tipo{NORMAL,FUEGO,AGUA,PLANTA,SINIESTRO,PSIQUICO}
    //ahora creamos el atributo tipo
    private Tipo tipo;

    //creamos el constructor completo
    public Pokemon(String nombre, int nivel, int puntosSalud, int ataque, Tipo tipo) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosSalud = puntosSalud;
        this.ataque = ataque;
        this.tipo = tipo;
    }

    //creamos el constructor vacío

    public Pokemon() {
    }

    //creamos el constructor con todos los atributos excepto tipo, que pone tipo a NORMAL

    public Pokemon(String nombre, int nivel, int puntosSalud, int ataque) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosSalud = puntosSalud;
        this.ataque = ataque;
        this.tipo = Tipo.NORMAL;
    }

    //creamos los getters y los setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPuntosSalud() {
        return puntosSalud;
    }

    public void setPuntosSalud(int puntosSalud) {
        this.puntosSalud = puntosSalud;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    //creamos el metodo debilitado, de tipo boolean, ya que devuelve true or false
    public boolean debilitado(){
        return this.puntosSalud <= 0;
    }

    //creamos el metodo atacar, de tipo voidm porque no devuelve nada y añadimos a un pokemon (de tipo Pokemon) como parámetro
    //este metodo le resta a los puntos de salud del pokemon atacado, los puntos de ataque del pokemon que ataca
    public void atacar(Pokemon pokemonAtacado){
        pokemonAtacado.puntosSalud-=this.ataque;
    }

    //finalmente, creamos un toString con el texto indicado
    @Override
    public String toString() {
        return this.nombre + " (nivel " + this.nivel + ")";
    }
}
