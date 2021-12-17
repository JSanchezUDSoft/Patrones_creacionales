package Principal;

public class CuerpoaCuerpoFactory implements MiliciaFactory{

    public void crearGuerrero() {
        try {
            CuerpoCuerpoGuerrero guerrero = new CuerpoCuerpoGuerrero();
            String tipo = guerrero.tipoPersonaje();
            System.out.println("Tipo de guerrero: " + tipo);
            System.out.println("\t" + "Vida: " + guerrero.defVida(tipo));
            System.out.println("\t" + "Daño: " + guerrero.defDaño());
            System.out.println("\t" + "Velocidad: " + guerrero.defVelocidad());
            System.out.println("\t" + "Alcance: " + guerrero.defAlcance(tipo));
        }
        catch(Exception e){
            System.out.println("Se presento un error en CuerpoaCuerpoFactory.crearGuerrero " + e);
        }
    }

    public void crearMaquina() {
        try {
            CuerpoCuerpoMaquina maquina = new CuerpoCuerpoMaquina();
            String tipo = maquina.tipoMaquina();
            System.out.println("Tipo de Maquina: " + tipo);
            System.out.println("\t" + "Vida: " + maquina.defVida(tipo));
            System.out.println("\t" + "Daño: " + maquina.defDaño(tipo));
            System.out.println("\t" + "Velocidad: " + maquina.defVelocidad());
            System.out.println("\t" + "Alcance: " + maquina.defAlcance(tipo));
        }
        catch(Exception e){
            System.out.println("Se presento un error en CuerpoaCuerpoFactory.crearMaquina " + e);
        }
    }
}
