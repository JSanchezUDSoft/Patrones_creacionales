package Principal;

public class CuerpoCuerpoMaquina implements Maquina{

    public String tipoMaquina() {
        return "Ariete";
    }

    public int defVida(String tipoMaquina) {
        return (int)(Math.random()*350+250);
    }

    public int defDaño(String tipoMaquina) {
        return (int)(Math.random()*70+60);
    }

    public int defVelocidad() {
        return (int)(Math.random()*5+1);
    }

    public int defAlcance(String tipoMaquina){
        return 1;
    }
}
