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
public class Pokemon{
	//Atributos
		//Se inicializan las estadisticas de los pokemon
	private String apodo;
	private double hp; // (vida)
	private double ataque;
	private double defensa;
	private double velocidad;
	private String estado; //Disponible, Paralizado, Quemado, Envenenado, etc..
	private String tipo;

	//Constructor
	Pokemon(String apodo, double hp, double ataque, double defensa, double velocidad, String estado, String tipo){
            this.apodo = apodo;
            this.hp = hp;
            this.ataque = ataque;
            this.defensa = defensa;
            this.velocidad = velocidad;
            this.estado = estado;
            this.tipo = tipo;
	}

	//getters
	public String getApodo(){
            return apodo;
	}
	public double getHp(){
            return hp;
	}
	public double getAtaque(){
            return ataque;
	}
	public double getDefensa(){
            return defensa;
	}
	public double getVelocidad(){
            return velocidad;
	}
	public String getEstado(){
            return estado;
	}
	public String getTipo(){
		return tipo;
	}
        
        //setters   
        public void setHp(double hp) {
            this.hp=hp;
        }
        public void setAtaque(double ataque){
            this.ataque=ataque;
        }
        public void setDefensa(double defensa) {
            this.defensa=defensa;
        }
        
        
	//metodos pokemon
	public int recibeDaño(){
            return 0;
	}
	public double calcularDaño(Pokemon agresor, Pokemon defensor){
		if (agresor.tipo.equals("Fuego")){
                    if(defensor.tipo.equals("Hierba")){
                        defensor.ataque=defensor.ataque*2;
                       // daño = daño * 2;
                    }
                    else if (defensor.tipo.equals("Agua") || defensor.tipo.equals("Fuego")) {
			//daño = daño * 0.5;
                    }
                    else{
                       // daño = daño * 1;
                    }

		}
		else if (agresor.tipo.equals("Agua")){
			if(defensor.tipo.equals("Fuego")){
                            //daño = daño * 2;
			}
			else if (defensor.tipo.equals("Agua") || defensor.tipo.equals("Hierba")) {
                            //daño = daño * .5;
			}
			else{
                            //daño = daño * 1;
			}


		}
		else if(agresor.tipo.equals("Hierba")){
			if(defensor.tipo.equals("Agua")){
                            //daño = daño * 2;
			}
			else if (defensor.tipo.equals("Hierba") || defensor.tipo.equals("Fuego")) {
                           // daño = daño * .5;
			}
			else{
                           // daño = daño * 1;
			}

		}
		else if(agresor.tipo.equals("Electrico")){
			if(defensor.tipo.equals("Agua")){
                            //daño = daño * 2;
			}
			else if (defensor.tipo.equals("Hierba") || defensor.tipo.equals("Electrico"))
			{
                            //daño = daño * .5;
			}
			else{
                            //daño = daño * 1;
			}

		}
		return 0.0;
	}
        
        
    
}
