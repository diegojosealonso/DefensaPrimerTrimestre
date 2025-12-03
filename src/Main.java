import personas.Entrenador;
import personas.LiderGimnasio;
import pokemon.Pocion;
import pokemon.Pokemon;
import static personas.Entrenador.Clase.CAZABICHOS;
import static personas.Entrenador.Clase.DOMINGUERO;
import static pokemon.Pokemon.Tipo.NORMAL;
import static pokemon.Pokemon.Tipo.FUEGO;
import static pokemon.Pokemon.Tipo.AGUA;
import static pokemon.Pokemon.Tipo.PSIQUICO;

public class Main {
    public static void main(String[] args) {
        //creamos 4 pokemons
        Pokemon pokemon1 = new Pokemon("Hattrem", 1, 1000, 153, PSIQUICO);
        Pokemon pokemon2 = new Pokemon("Buizel", 15, 1000, 132, AGUA);
        Pokemon pokemon3 = new Pokemon("Buneary", 10, 1000, 130, NORMAL);
        Pokemon pokemon4 = new Pokemon("Fennekin", 20, 1000, 116, FUEGO);
        //imprimimos sus toStrings
        System.out.println(pokemon1.toString());
        System.out.println(pokemon2.toString());
        System.out.println(pokemon3.toString());
        System.out.println(pokemon4.toString());

        //ejecutamos los ataques
        pokemon1.atacar(pokemon3);
        //las siguientes líneas de código son simplemente para entender mejor la salida por terminal al imprimir la salud de los pokemons atacados
        System.out.println(pokemon1.getNombre() + " ha atacado a " + pokemon3.getNombre());
        System.out.println("Los puntos de salud de " + pokemon3.getNombre() + " son: " + pokemon3.getPuntosSalud());
        pokemon2.atacar(pokemon4);
        System.out.println(pokemon2.getNombre() + " ha atacado a " + pokemon4.getNombre());
        System.out.println("Los puntos de salud de " + pokemon4.getNombre() + " son: " + pokemon4.getPuntosSalud());

        //creamos una poción
        Pocion pocion1 = new Pocion(100, 50);
        //la siguiente línea de código también es para visualizar mejor la salida por terminal al imprimir los puntos de salud del pokemon cuyos puntos de salud han sido restaurados
        pocion1.curar(pokemon3);
        System.out.println("Gracias a la poción la salud de " + pokemon3.getNombre() + " ha subido a: " + pokemon3.getPuntosSalud());

        //creamos los entrenadores
        Entrenador entrenador1 = new Entrenador("Nerea", 24, pokemon1, 6, 8, DOMINGUERO);
        Entrenador entrenador2 = new Entrenador("Terry", 19, pokemon2, 5, 8, CAZABICHOS);
        //imprimimos sus toStrings
        System.out.println(entrenador1.toString());
        System.out.println(entrenador2.toString());

        //creamos un líder de gimnasio
        LiderGimnasio liderGimnasio1 = new LiderGimnasio("Julián", 24, pokemon3, 6, "Colombia", "Medellín", false);
        //imprimimos su toString
        System.out.println(liderGimnasio1.toString());
    }
}