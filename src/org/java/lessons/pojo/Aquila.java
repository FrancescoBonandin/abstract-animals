package org.java.lessons.pojo;

import org.java.lessons.pojo.abs.Animale;
import org.java.lessons.pojo.inter.INuotante;
import org.java.lessons.pojo.inter.IVolante;

public class Aquila extends Animale implements IVolante,INuotante {
	
	protected String feathering;

	public Aquila(String name,String size, String feathering) {
		super(name, size);
		setFeathering(feathering);
		
	}
	
	public String getFeathering() {
		return feathering;
	}

	public void setFeathering(String feathering) {
		this.feathering = feathering;
	}
	
	@Override
	public void verso() {
		
		System.out.println(getName()+" fa *il verso dell'aquila* "); 
		
	}

	@Override
	public void mangia() {
		
		System.out.println(getName() + " mangia piccoli roditori e piccoli volatili"); 
		
	}
	
	@Override
	public void vola() {
		System.out.println("sto volando!!!");
	}
	
	@Override
	public void nuota() {
		
		System.out.println("sto nuotando!!!!");
		
	}
	
//	@Override
//	public void volaONuota() {
//			vola();
//			nuota();
//	}

	
}