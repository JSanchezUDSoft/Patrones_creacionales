package Principal;

import java.util.Random;

public class CuerpoCuerpoGuerrero implements Guerrero{

    public String tipoPersonaje() {

        switch ((int)(Math.random()*2+1)){
            case 1:
                return "Espada";
            case 2:
                return "Lanza";
            default:
                return "Espada";
        }

    }

    public int defVida(String tipoPersonaje) {

        if(tipoPersonaje.equals("Espada")){
            return (int)(Math.random()*150+130);
        }else{
            return (int)(Math.random()*130+100);
        }

    }

    public int defDaño() {
        return (int)(Math.random()*30+15);
    }

    public int defVelocidad() {
        return (int)(Math.random()*10+5);
    }

    public int defAlcance(String tipoPersonaje){

        if(tipoPersonaje.equals("Espada")){
            return 1;
        }else{
            return 2;
        }

    }
}
