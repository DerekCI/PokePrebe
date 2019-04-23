public class Pocion{
	//Variables
	private String tipoPocion;

	//Constructor
	Pocion(String tipoPocion){
		this.tipoPocion = tipoPocion;
	}

	//getters
	public String gettipoPocion(){
		return tipoPocion;
	}
	
	//Metodo pocion
	public void usarPocion(Pokemon pokemon){
		if (tipoPocion=="Vida"){
			pokemon.vida=vida*1.2;	
		}
		else if(tipoPocion=="Ataque"){
			pokemon.ataque=ataque*1.1;
		}
		else if(tipoPocion=="Defensa"){
			pokemon.defensa=defensa*1.1;	
		}
	}
}