public class Pokemon{
	//Atributos
		//Se inicializan las estadisticas de los pokemon
	private String apodo;
	private int hp; // (vida)
	private int ataque;
	private int defensa;
	private int velocidad;
	private String estado;
	private String tipo;

	//Constructor
	Pokemon(String apodo, int hp, int ataque, int defensa, int velocidad, String estado, String tipo){
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
	public int getHp(){
		return hp;
	}
	public int getAtaque(){
		return ataque;
	}
	public int getDefensa(){
		return defensa;
	}
	public int getVelocidad(){
		return velocidad;
	}
	public String getEstado(){
		return estado;
	}
	public String getTipo(){
		return tipo;
	}

	//metodos pokemon
	public int recibeDaño(){

	}
	public int calcularDaño(Pokemon agresor, Pokemon defensor){
		if (agresor.tipo == "Fuego"){
			if(defensor.tipo == "Hierba"){
				daño = daño * 2;
			}
			else if (defensor.tipo == ("Agua" || "Fuego"))
			{
				daño = daño * .5;
			}
			else{
				daño = daño * 1;
			}

		}
		else if (agresor.tipo == "Agua"){
			if(defensor.tipo == "Fuego"){
				daño = daño * 2;
			}
			else if (defensor.tipo == ("Agua" || "Hierba"))
			{
				daño = daño * .5;
			}
			else{
				daño = daño * 1;
			}


		}
		else if(agresor.tipo == "Hierba"){
			if(defensor.tipo == "Agua"){
				daño = daño * 2;
			}
			else if (defensor.tipo == ("Hierba" || "Fuego"))
			{
				daño = daño * .5;
			}
			else{
				daño = daño * 1;
			}

		}
		else if(agresor.tipo == "Electrico"){
			if(defensor.tipo == "Agua"){
				daño = daño * 2;
			}
			else if (defensor.tipo == ("Hierba" || "Electrico"))
			{
				daño = daño * .5;
			}
			else{
				daño = daño * 1;
			}

		}
		return daño;
	}
}