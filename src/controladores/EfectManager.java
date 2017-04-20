package controladores;

import java.util.ArrayList;

import entidades.Efect;

public class EfectManager {
	
	ArrayList<Efect> efectList = new ArrayList<Efect>();
	
	public EfectManager(){
		efectList.add(new Efect(0,0,10,0,1));
		efectList.add(new Efect(0,0,0,10,2));
	}
}
