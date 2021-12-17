package Principal;

public class LargaDistanciaMaquina implements Maquina{

    public String tipoMaquina() {
        try {
            switch ((int) (Math.random() * 2 + 1)) {
                case 1:
                    return "Catapulta";
                case 2:
                    return "Vallesta";
                default:
                    return "Vallesta";
            }
        }
        catch(Exception e){
            System.out.println("Se presento un error en LargaDistanciaMaquina.tipoMaquina " + e);
            return "Error";
        }
    }

    public int defVida(String tipoMaquina){
        try {
            if (tipoMaquina.equals("Catapulta")) {
                return (int) (Math.random() * 250 + 200);
            } else {
                return (int) (Math.random() * 230 + 190);
            }
        }
        catch(Exception e){
            System.out.println("Se presento un error en LargaDistanciaMaquina.defVida " + e);
            return 0;
        }
    }

    public int defDaño(String tipoMaquina){
        try {
            if (tipoMaquina.equals("Catapulta")) {
                return (int) (Math.random() * 90 + 80);
            } else {
                return (int) (Math.random() * 120 + 100);
            }
        }
        catch(Exception e){
            System.out.println("Se presento un error en LargaDistanciaMaquina.defDaño " + e);
            return 0;
        }
    }

    public int defVelocidad(){
        try {
            return (int) (Math.random() * 7 + 4);
        }
        catch(Exception e){
            System.out.println("Se presento un error en LargaDistanciaMaquina.defVelocidad " + e);
            return 0;
        }
    }

    public int defAlcance(String tipoMaquina) {
        try {
            if (tipoMaquina.equals("Catapulta")) {
                return (int) (Math.random() * 35 + 30);
            } else {
                return (int) (Math.random() * 30 + 20);
            }
        }
        catch(Exception e){
            System.out.println("Se presento un error en LargaDistanciaMaquina.defAlcance " + e);
            return 0;
        }
    }
}