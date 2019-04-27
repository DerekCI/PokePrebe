/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author DELL-PC
 */
public class Pociones{
	//Variables
	private String tipoPocion;

	//Constructor
	Pociones(String tipoPocion){
		this.tipoPocion = tipoPocion;
	}

	//getters
	public String gettipoPocion(){
		return tipoPocion;
	}
	
	//Metodo pocion
	public void usarPocion(Pokemon pokemon){
		if (tipoPocion.equals("Vida")){
                    pokemon.setHp(pokemon.getAtaque()*1.2);
		}
		else if(tipoPocion.equals("Ataque")){
                    pokemon.setAtaque(pokemon.getAtaque()*1.1);
		}
		else if(tipoPocion.equals("Defensa")){
                    pokemon.setAtaque(pokemon.getDefensa()*1.1);	
		}
	}
}