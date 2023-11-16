package org.java.lessons.pojo.abs;



public abstract class Animale  {
	
	protected String name;
	protected String size;

	public Animale(String name, String size ){
		
		setName(name);
		setSize(size);
		
	}
	
	public String getSize() {
		return size;
	}
	
	
	protected void setSize(String size) {
		this.size = size;
	}
	
	public String getName() {
	
		return this.name;
		
	}
	
	
	protected void setName(String name) {

		this.name = name;
		
	}
	
	
	public void dormi() {
		
		System.out.println(getName()+" Zzz"); 
	}

	public abstract void verso(); 

	public abstract void mangia(); 



}

