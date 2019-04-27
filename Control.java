/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.LinkedList;

/**
 *
 * @author DELL-PC
 */
public class Control {
    private LinkedList<Pokemon> pokeDisponibles=new LinkedList<>();
    
    public void pokePelea(Jugador juga) { //Este método es para elegir los poquemones de pelea
        
    }
    
    public void inicializarPokemones() {
        Pokemon nuevoPokemon = new Pokemon("Bulbasaur",2000.0,1000.0,800.0,700.0,"Disponible","Hierba");
        pokeDisponibles.add(nuevoPokemon);
  
    }
    
    public void mostrarPokemon() {
            for(Pokemon var: pokeDisponibles) {
                System.out.println("Apodo: "+var.getApodo());
            }
        }
}
