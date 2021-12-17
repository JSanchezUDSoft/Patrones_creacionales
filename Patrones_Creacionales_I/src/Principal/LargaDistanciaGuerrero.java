package Principal;

public class LargaDistanciaGuerrero implements Guerrero{

    public String tipoPersonaje() {
        try {
            switch ((int) (Math.random() * 2 + 1)) {
                case 1:
                    return "Arco";
                case 2:
                    return "Jabalina";
                default:
                    return "Arco";
            }
        }
        catch(Exception e){
            System.out.println("Se presento un error en LargaDistanciaGuerrero.tipoPersonaje " + e);
            return "Error";
        }
    }

    public int defVida(String tipoPersonaje) {
        try {
            if (tipoPersonaje.equals("Arco")) {
                return (int) (Math.random() * (130-100+1) + 100);
            } else {
                return (int) (Math.random() * (100-90+1) + 90);
            }
        }
        catch(Exception e){
            System.out.println("Se presento un error en LargaDistanciaGuerrero.defVida " + e);
            return 0;
        }
    }

    public int defDaño() {
        try {
            return (int) (Math.random() * (20-15+1) + 15);
        }
        catch(Exception e){
            System.out.println("Se presento un error en LargaDistanciaGuerrero.defDaño " + e);
            return 0;
        }
    }

    public int defVelocidad() {
        try {
            return (int) (Math.random() * (15-10+1) + 10);
        }
        catch(Exception e){
            System.out.println("Se presento un error en LargaDistanciaGuerrero.tipoVelocidad " + e);
            return 0;
        }
    }

    public int defAlcance(String tipoPersonaje) {
        try {
            if (tipoPersonaje.equals("Arco")) {
                return (int) (Math.random() * (10-7+1) + 7);
            } else {
                return (int) (Math.random() * (13-9+1) + 9);
            }
        }
        catch(Exception e){
            System.out.println("Se presento un error en LargaDistanciaGuerrero.defAlcance " + e);
            return 0;
        }
    }

}
