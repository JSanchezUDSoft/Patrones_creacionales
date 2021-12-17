package Principal;

public class LargaDistanciaFactory implements MiliciaFactory{

    public void crearGuerrero() {
        try {
            LargaDistanciaGuerrero guerrero = new LargaDistanciaGuerrero();
            String tipo = guerrero.tipoPersonaje();
            System.out.println("Tipo de guerrero: " + tipo);
            System.out.println("\t" + "Vida: " + guerrero.defVida(tipo));
            System.out.println("\t" + "Daño: " + guerrero.defDaño());
            System.out.println("\t" + "Velocidad: " + guerrero.defVelocidad());
            System.out.println("\t" + "Alcance: " + guerrero.defAlcance(tipo));
        }
        catch(Exception e){
            System.out.println("Se presento un error en LargaDistanciaFactory.crearGuerrero " + e);
        }
    }

    public void crearMaquina() {
        try {
            LargaDistanciaMaquina maquina = new LargaDistanciaMaquina();
            String tipo = maquina.tipoMaquina();
            System.out.println("Tipo de Maquina: " + tipo);
            System.out.println("\t" + "Vida: " + maquina.defVida(tipo));
            System.out.println("\t" + "Daño: " + maquina.defDaño(tipo));
            System.out.println("\t" + "Velocidad: " + maquina.defVelocidad());
            System.out.println("\t" + "Alcance: " + maquina.defAlcance(tipo));
        }
        catch(Exception e){
            System.out.println("Se presento un error en LargaDistanciaFactory.crearMaquina " + e);
        }
    }

}
