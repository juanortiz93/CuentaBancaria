package test;

import java.util.Scanner;

import data.Menu;


public class Runner {

	public Runner() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu menu = new Menu();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("//////////////////////////////////////////////");
		System.out.println("/                                            /");
		System.out.println("/    Bienvenido al Restaurante		         /");
		System.out.println("/                                            /");
		System.out.println("//////////////////////////////////////////////");
		System.out.println("");
		
		boolean exit = false;

        do{
            System.out.println("Ingrese el número de la opción que desea realizar");
            System.out.println("1. Agregar reseta");
            System.out.println("2. Reemplazar reseta");
            System.out.println("3. Ver el numero de resetas");
            System.out.println("4. Ver todo el menú");
    		System.out.println("5. Salir");
            
            int option = scan.nextInt();
            
            switch (option){
            case 1:
                System.out.print("Ingrese el nombre de la reseta: \n");
                String name1 = scan.next();
                
                System.out.print("Ingrese el precio de la reseta: \n");
                float price1 = scan.nextFloat();
                menu.addRecipe(name1, price1);
              
               
                break;
            case 2:
            	System.out.print("Seleccione la opción que desea reemplazar\n");
            	int id = scan.nextInt();
            	
            	System.out.print("Ingrese el nombre de la reseta que desea\n");
                String name2 = scan.next();
            	
                System.out.print("Ingrese el precio de la reseta\n");
                float price2 = scan.nextFloat();
                
                
                menu.replaceRecipe(name2, price2, id);
               
            	
                break;
            case 3:
            	int menuAmount=menu.printAmount();
            	System.out.println("La cantidad de resetas es: "+menuAmount);
                break;
            case 4:
                menu.printMenu();
                break;
            default:
                exit = true;
                System.out.println("Gracias por utilizar nuestro portal! Vuelva pronto\n");
                break;
            }

        } while (exit == false);
	}

}
