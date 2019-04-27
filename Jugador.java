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
public class Jugador{
	//Atributos de un jugador
	private String nombre;
	private LinkedList<Pokemon> listaPoke= new LinkedList<>();
        private LinkedList<Pociones> listaPociones= new LinkedList<>();
	
        //constructor
	public Jugador(String nombre, LinkedList<Pokemon> listaPoke, LinkedList<Pociones> listaPociones){
            this.nombre = nombre;
            this.listaPociones=listaPociones;
            this.listaPoke=listaPoke;
	}
        public Jugador() {
            
        }
        
	//getters
	public String getNombre(){
		return nombre;
	}
	public LinkedList getPokemones(){
		return listaPoke;
	}
	public LinkedList getPociones(){
		return listaPociones;
	}
	
        //Métodos del jugador
	public void guardarPokemon(){

	}
	public void elegirPokemon(){

	} 
	public void usarPocion(){

	}
	public void listarPokemon(){

	}
}
