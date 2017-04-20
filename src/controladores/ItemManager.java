package controladores;

import java.util.ArrayList;
import entidades.Item;

public class ItemManager {
	
	ArrayList<Item> itemList = new ArrayList<Item>();
	
	public ItemManager(){
		itemList.add(new Item("Pocion de vida", "Te cura 10 puntos de vida", 1));
		itemList.add(new Item("Pocion de mana", "Te cura 10 puntos de mana", 2));
	}
	
	public ArrayList<Item> getItemList(){
		return itemList;
	}
	
	public Item searchItemGame(int id){
		return searchItem(id, itemList);
	}
	
	public Item searchItem(int id, ArrayList<Item> list){
		for(Item item:list)
			if(item.getId() == id)
				return item;
		return null;
	}
	
	public boolean hasItem(int id, ArrayList<Item> list){
		for(Item item:list)
			if(item.getId() == id)
				return true;
		return false;
	}
	
	
}
