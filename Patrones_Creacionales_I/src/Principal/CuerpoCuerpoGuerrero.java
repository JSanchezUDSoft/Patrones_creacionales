package Principal;

import java.util.Random;

public class CuerpoCuerpoGuerrero implements Guerrero{

    public String tipoPersonaje() {
        try {
            switch ((int) (Math.random() * 2+1)) {
                case 1:
                    return "Espada";
                case 2:
                    return "Lanza";
                default:
                    return "Espada";
            }
        }
        catch(Exception e){
            System.out.println("Se presento un error en CuerpoCuerpoGuerrero.tipoPersonaje " + e);
            return "Error";
        }
    }

    public int defVida(String tipoPersonaje) {
        try {
            if (tipoPersonaje.equals("Espada")) {
                return (int) (Math.random() * (150-130+1) + 130);
            } else {
                return (int) (Math.random() * (130-100+1) + 100);
            }
        }
        catch(Exception e){
            System.out.println("Se presento un error en CuerpoCuerpoGuerrero.defVida " + e);
            return 0;
        }

    }

    public int defDaño() {
        try {
            return (int) (Math.random() * (30-15+1) + 15);
        }
        catch(Exception e){
            System.out.println("Se presento un error en CuerpoCuerpoGuerrero.defDaño " + e);
            return 0;
        }
    }

    public int defVelocidad() {
        try {
            return (int) (Math.random() * (10-5+1) + 5);
        }
        catch(Exception e){
            System.out.println("Se presento un error en CuerpoCuerpoGuerrero.defVelocidad " + e);
            return 0;
        }
    }

    public int defAlcance(String tipoPersonaje){
        try {
            if (tipoPersonaje.equals("Espada")) {
                return 1;
            } else {
                return 2;
            }
        }
        catch(Exception e){
            System.out.println("Se presento un error en CuerpoCuerpoGuerrero.defAlcance " + e);
            return 0;
        }
    }
}
