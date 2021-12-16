package Principal;

public class LargaDistanciaGuerrero implements Guerrero{

    public String tipoPersonaje() {

        switch ((int)(Math.random()*2+1)){
            case 1:
                return "Arco";
            case 2:
                return "Jabalina";
            default:
                return "Arco";
        }

    }

    public int defVida(String tipoPersonaje) {

        if(tipoPersonaje.equals("Arco")){
            return (int)(Math.random()*130+100);
        }else{
            return (int)(Math.random()*100+90);
        }

    }

    public int defDaño() {
        return (int)(Math.random()*20+15);
    }

    public int defVelocidad() {
        return (int)(Math.random()*15+10);
    }

    public int defAlcance(String tipoPersonaje) {

        if(tipoPersonaje.equals("Arco")){
            return (int)(Math.random()*10+7);
        }else{
            return (int)(Math.random()*13+9);
        }

    }

}
