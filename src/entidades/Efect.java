package entidades;

public class Efect {
	private int ataque, defensa, vida, mana, id;
	
	public Efect(int ataque, int defensa, int vida, int mana, int id){
		this.ataque = ataque;
		this.defensa = defensa;
		this.mana = mana;
		this.vida = vida;
		this.id = id;
	}

	public int getAtaque() {
		return ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	public int getVida() {
		return vida;
	}

	public int getMana() {
		return mana;
	}

	public int getId() {
		return id;
	}
}
