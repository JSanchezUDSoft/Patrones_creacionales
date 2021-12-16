package Principal;

public class LargaDistanciaMaquina implements Maquina{

    public String tipoMaquina() {
        switch ((int)(Math.random()*2+1)){
            case 1:
                return "Catapulta";
            case 2:
                return "Vallesta";
            default:
                return "Vallesta";
        }
    }

    public int defVida(String tipoMaquina){

        if(tipoMaquina.equals("Catapulta")){
            return (int)(Math.random()*250+200);
        }else{
            return (int)(Math.random()*230+190);
        }
    }

    public int defDaño(String tipoMaquina){

        if(tipoMaquina.equals("Catapulta")){
            return (int)(Math.random()*90+80);
        }else{
            return (int)(Math.random()*120+100);
        }
    }

    public int defVelocidad(){
        return (int)(Math.random()*7+4);
    }

    public int defAlcance(String tipoMaquina) {
        if(tipoMaquina.equals("Catapulta")){
            return (int)(Math.random()*35+30);
        }else{
            return (int)(Math.random()*30+20);
        }
    }
}