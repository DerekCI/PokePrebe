/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author DELL-PC
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre1, nombre2,apodo;
        Control control=new Control();
        
        System.out.println("BIENVENIDO\n**** JUEGO CHIDO DE POKEMON ****");
        
        //Necesitamos crear al jugador uno y dos para poder trabajar con sus métodos y atributos
        System.out.println("Vamos a inicializar al jugador 1...");
        System.out.print("¿Cuál es el nombre del jugador 1? R:");
        nombre1=sc.nextLine();
        System.out.println("Lista de pokemones disponibles...");
        control.inicializarPokemones();
        control.mostrarPokemon();
        System.out.print("Dame el nombre del pokemon que quieres elegir: ");
        apodo=sc.nextLine();
        
        Jugador jugador1=new Jugador();
        
    }
    
}
