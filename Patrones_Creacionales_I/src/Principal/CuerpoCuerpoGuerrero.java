package Principal;

import java.util.Random;

public class CuerpoCuerpoGuerrero implements Guerrero{
    public String tipoPersonaje() {
        return null;
    }

    public int defVida(String tipoPersonaje) {
        //Random random = new Random();
        //int vida = random.nextInt(100-150);


        return (int)(Math.random()*150+100);
    }

    public int defDaño() {
        //Random random = new Random();
        //int vida = random.nextInt(100-150);
        int vida = (int)(Math.random()*150+100);

        return 0;
    }

    public int defVelocidad() {
        return 0;
    }

    public int defAlcance(){
        return 0;
    }
}
