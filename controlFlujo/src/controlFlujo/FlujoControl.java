package controlFlujo;

import java.util.Scanner;

public class FlujoControl {

	public static void main(String[] args) { // debe coincidir la clase con el nombre del documento
		/*String viaje = null;
		
		if(viaje != null) {
			
			System.out.println("ya no tenemos fechas disponibles");
			
			}else {
				System.out.println("puede reservar su viaje");
			}

		
		/*Validación de contraseñas
				Scanner scanner = new Scanner (System.in);
				
				//Solicitar la contraseña 
				System.out.print("Ingrese la contraseña: ");
				String passw1 = scanner.nextLine();
				
				//Verificando contraseña
				System.out.print("Ingrese nuevamente la contraseña: ");
				String passw2 = scanner.nextLine();
				
				//Verificar si las contraseñas son iguales
				if (passw1.equals(passw2)) {
					System.out.println("Las contraseñas coinciden");
				} else {
					System.out.println("Contraseñas no coinciden");
				}
				
				scanner.close();*/
		
		//ejercicio de switch
		
		
		
		Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Mostrar el menú
            System.out.println("Menú:\n"
            		+"1. Palomitas\n"
            		+"2. Refresco\n"
            		+"3. Nachos\n"
            		+"4. Hotdog\n"
            		+"5. Salir del menú\n");

            // Leer la opción del usuario
            opcion = scanner.nextInt();

            // Procesar la opción utilizando switch
            switch (opcion) {
              case 1:
               System.out.println("Ha seleccionado la Opción 1.");
                 break;

              case 2:
                System.out.println("Ha seleccionado la Opción 2.");
                 break;

              case 3:
                System.out.println("Ha seleccionado la Opción 3.");
                 break;

              case 4:
                System.out.println("Elejiste la opcion 4");
                 break;
                 
              case 5:
                  System.out.println("Saliendo del programa. ¡Hasta luego!");
                   break;

               default:
                 System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }

        } while (opcion != 5);

        scanner.close();
		
		
		
		
		
	}//main

}//class