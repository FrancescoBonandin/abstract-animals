package org.java.lessons.pojo;

import org.java.lessons.pojo.abs.Animale;
import org.java.lessons.pojo.inter.INuotante;

public class Cane extends Animale implements INuotante {
	
	protected String fur;

	public Cane(String name,String size, String fur) {
		super(name, size);
		setFur(fur);
	}
	
	public String getFur() {
		return fur;
	}

	protected void setFur(String fur) {
		this.fur = fur;
	}

	@Override
	public void verso() {
		
		System.out.println(getName()+" fa Bau Bau"); 
		
	}

	@Override
	public void mangia() {
		
		System.out.println(getName() + " mangia cibo per cani"); 
		
	}
	
	@Override
	public void nuota() {

		System.out.println("sto nuotando!!!!");
		
	}
	
}


