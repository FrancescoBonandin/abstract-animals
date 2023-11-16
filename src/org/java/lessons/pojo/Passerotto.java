package org.java.lessons.pojo;

import org.java.lessons.pojo.abs.Animale;
import org.java.lessons.pojo.inter.IVolante;
public class Passerotto  extends Animale implements IVolante {
		
		protected String feathering;
		
		public Passerotto(String name,String size, String feathering) {
			
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
			
			System.out.println(getName()+" fa Cip cip"); 
			
		}

		@Override
		public void mangia() {
			
			System.out.println(getName() + " mangia semi e piccoli insetti" ); 
			
		}
		@Override
		public void vola() {
			
			System.out.println("sto volando!!!");
		}

		
		
	}


