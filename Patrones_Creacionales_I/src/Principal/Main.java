package Principal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner txt = new Scanner(System.in);
            boolean menu = true;
            String opcion;

            System.out.println("Bienvenido a la fabrica de la milicia, para crear un personaje elija entre las siguientes opciones: ");

            while (menu == true) {
                System.out.println("\n1. Personaje cuerpo a cuerpo");
                System.out.println("2. Personaje a larga distancia");
                System.out.println("3. Salir2");
                opcion = txt.nextLine();

                switch (opcion) {
                    case "1":
                        CuerpoaCuerpoFactory cuerpoaCuerpoFactory = new CuerpoaCuerpoFactory();
                        cuerpoaCuerpoFactory.crearGuerrero();
                        cuerpoaCuerpoFactory.crearMaquina();
                        break;
                    case "2":
                        LargaDistanciaFactory largaDistanciaFactory = new LargaDistanciaFactory();
                        largaDistanciaFactory.crearGuerrero();
                        largaDistanciaFactory.crearMaquina();
                        break;
                    case "3":
                        menu = false;
                        System.out.println("El presupuesto de la milicia se acabo");
                        break;
                    default:
                        System.out.println("Opción incorrecta, intente nuevamente");
                        break;

                }

            }
        }
        catch(Exception e){
            System.out.println("Se presento un error en Main " + e);
        }
    }


}
