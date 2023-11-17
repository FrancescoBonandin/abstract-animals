package org.java.lessons.pojo;

import org.java.lessons.pojo.abs.Animale;
import org.java.lessons.pojo.inter.INuotante;

public class Delfino extends Animale implements INuotante{
	
	protected int fins;
	
	public Delfino(String name, String size, int fins) {
		super(name,size);
		setFins(fins);
	}
	
	public int getFins() {
		return fins;
	}

	public void setFins(int fins) {
		this.fins = fins;
	}

	
	@Override
	public void verso() {
		
		System.out.println(getName()+" fa *il verso del delfino*"); 
		
	}

	@Override
	public void mangia() {
		
		System.out.println(getName() + " mangia pesci, crostacei e molluschi" ); 
		
	}
	
	@Override
	public void nuota() {
		
		System.out.println("sto nuotando!!!!");
		
	}
	
//	@Override
//	public void volaONuota() {
//			nuota();
//	}

}
