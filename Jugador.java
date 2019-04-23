public class Jugador{
	//Variables
	private String nombre;
	//private Pokemon[] pokemones;
	//private Pocion[] pociones;

	//constructor
	public Jugador(String nombre, Pokemon[] pokemones, Pocion[] pociones){
		this.nombre = nombre;
		this.pokemones = pokemones;
		this.pociones = pociones;
	}
	//getters
	public String getNombre(){
		return nombre;
	}
	public String getPokemones(){
		return pokemones;
	}
	public String getPociones(){
		return pociones;
	}
	//Metodos del jugador
	public void guardarPokemon(){

	}
	public void elegirPokemon(){

	} 
	public void usarPocion(){

	}
	public void listarPokemon(){

	}
}