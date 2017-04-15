package entitiades;

import interfaces.IPersonaje;

public class Jugador implements IPersonaje {
	private int vida, mana;
	private String nombre;
	//private Inventario inv;
	
	
	public Jugador(){
		this.vida = 100;
		this.mana = 100;
		this.nombre = "UsuarioGenerico";
		//this.inv = new Inventario();
	}
	
	public Jugador(String nombre){
		this.vida = 100;
		this.mana = 100;
		this.nombre = nombre;
		//this.inv = new Inventario();
	}
	
	public String getNombre() {
		return nombre;
	}

	@Override
	public void morir() {
		
	}

	@Override
	public int atacar(int mod, IPersonaje obje) {	
		return 0;
	}

	@Override
	public void recuperarVida(int vida) {
		if(this.vida + vida >= 100) {this.vida = 100;}
		else {this.vida += vida;}
	}

	@Override
	public void perderVida(int vida) {
		if(this.vida - vida <= 0) {morir();}
		else {this.vida -= vida;}
	}

	public void recuperarMana(int mana) {
		if(this.mana + mana >= 100) {this.mana = 100;}
		else {this.mana += mana;}
	}

	public void perderMana(int mana) {
		if(this.mana - mana <= 0) {this.mana = 0;}
		else {this.mana -= mana;}
	}
	
//	public void cogerObjecto(Item e){
//		this.inv.add(e);
//	}
//
//	public void eliminarObjecto(item e){
//		this.inv.remove(e);
//	}

}
	