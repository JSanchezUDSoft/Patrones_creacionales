package Principal;

public class CuerpoCuerpoMaquina implements Maquina{

    public String tipoMaquina() {
        try{
        return "Ariete";
        }
        catch(Exception e){
            System.out.println("Se presento un error en CuerpoCuerpoMaquina.tipoMaquina " + e);
            return "Error";
        }
    }

    public int defVida(String tipoMaquina) {
        try {
            return (int) (Math.random() * 350 + 250);
        }
        catch(Exception e){
            System.out.println("Se presento un error en CuerpoCuerpoMaquina.defVida " + e);
            return 0;
        }
    }

    public int defDaño(String tipoMaquina) {
        try {
            return (int) (Math.random() * 70 + 60);
        }
        catch(Exception e){
            System.out.println("Se presento un error en CuerpoCuerpoMaquina.defDaño " + e);
            return 0;
        }
    }

    public int defVelocidad() {
        try {
            return (int) (Math.random() * 5 + 1);
        }
        catch(Exception e){
            System.out.println("Se presento un error en CuerpoCuerpoMaquina.defVelocidad " + e);
            return 0;
        }
    }

    public int defAlcance(String tipoMaquina){
        try {
            return 1;
        }
        catch(Exception e){
            System.out.println("Se presento un error en CuerpoCuerpoMaquina.defDaño " + e);
            return 0;
        }
    }
}
