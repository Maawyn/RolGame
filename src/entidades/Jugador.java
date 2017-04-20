package entidades;

import java.util.ArrayList;

import interfaces.IPersonaje;

import controladores.ItemManager;

public class Jugador implements IPersonaje {
	private int vida, mana, ataque, defensa;
	private String nombre;
	private ArrayList<Item> inventario;
	private ItemManager itemManager = new ItemManager();
	
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
	
	public void removeItem(int id) { //From the inventory
		Item item = itemManager.searchItem(id,inventario);
		if (item == null)
			return;
		if(item.getCantidad() <= 1){
			inventario.remove(item);
		}else{
			item.setCantidad(item.getCantidad()-1);
		}
	}
	
	public void addItem(int id) { //From the inventory
		if(!itemManager.hasItem(id, inventario)){
			Item item = itemManager.searchItemGame(id);
			inventario.add(item);
		}else{
			Item item = itemManager.searchItem(id, inventario);
			item.setCantidad(item.getCantidad()+1);
		}
	}

}
	