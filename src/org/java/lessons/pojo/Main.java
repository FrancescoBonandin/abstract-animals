package org.java.lessons.pojo;

import org.java.lessons.pojo.abs.Animale;
import org.java.lessons.pojo.inter.INuotante;
import org.java.lessons.pojo.inter.IVolante;


public class Main {

	public static void main(String[] args) {
		
		Cane dog= new Cane("Fuffi","M","cioccolato");
		
		Passerotto bird= new Passerotto("Cip","S","brown");
		
		Aquila eagle= new Aquila("Gustavo","L","brown and white");
		
		Delfino dolphin= new Delfino("Flipper","M",5);

		Animale[] animals = {dog,bird,eagle,dolphin};
		
		for(int x = 0; x < animals.length; x++) {
			
			
			
			System.out.println("----------");
			if(animals[x] instanceof Cane) System.out.println(animals[x].getName()+" è un Cane");
			else if(animals[x] instanceof Passerotto) System.out.println(animals[x].getName()+" è un Passerotto");
			else if(animals[x] instanceof Aquila) System.out.println(animals[x].getName()+" è un Aquila");
			else if(animals[x] instanceof Delfino) System.out.println(animals[x].getName()+" è un Delfino");
			
			animals[x].dormi();
			animals[x].verso();
			animals[x].mangia();
			
//			animals[x].volaONuota();
			
			
			if(animals[x] instanceof IVolante) {
				
				faiVolare((IVolante)animals[x]);
			}
			
			if(animals[x] instanceof INuotante) {
				
				faiNuotare((INuotante)animals[x]);
			}
			
			System.out.println("----------");
			
		}
		
		

	
	}
	
	public static void faiVolare(IVolante animal) {
		animal.vola();
		
	}
	
	public static void faiNuotare(INuotante animal ) {
		
		animal.nuota();
	}
}
