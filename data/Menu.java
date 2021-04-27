package data;

import java.util.ArrayList;

public class Menu {
	ArrayList<String> name = new ArrayList<>();
	ArrayList<Float> price = new ArrayList<>();
	
	

	public Menu() {
		// TODO Auto-generated constructor stub
	}
	
	public void addRecipe(String name, float price) {
		this.name.add(name);
		this.price.add(price);
		System.out.println("la receta fue agregada");			
	}
	
	public int printAmount() {
		return name.size();
	}
	
	public void printMenu() {
		System.out.print("-------Menu-------\n");
		for (int i=0; i < name.size();i++) {
			System.out.print(name.get(i)+"       $"+price.get(i)+"\n");
		}
	}
	
	public void replaceRecipe(String name, float price, int id) {
		this.name.set(id,name);
		this.price.set(id, price);
		 System.out.print("La reseta fue reemplazada correctamente\n");
	}

}
