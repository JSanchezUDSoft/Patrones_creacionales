package Principal;

public class LargaDistanciaFactory implements MiliciaFactory{

    public void crearGuerrero() {
        LargaDistanciaGuerrero guerrero = new LargaDistanciaGuerrero();
        String tipo = guerrero.tipoPersonaje();
        System.out.println(tipo);
        System.out.println("\t"+ guerrero.defVida(tipo));
        System.out.println("\t"+ guerrero.defDaño());
        System.out.println("\t"+ guerrero.defVelocidad());
        System.out.println("\t"+ guerrero.defAlcance(tipo));
    }

    public void crearMaquina() {
        LargaDistanciaMaquina maquina = new LargaDistanciaMaquina();
        String tipo = maquina.tipoMaquina();
        System.out.println(tipo);
        System.out.println("\t"+ maquina.defVida(tipo));
        System.out.println("\t"+ maquina.defDaño(tipo));
        System.out.println("\t"+ maquina.defVelocidad());
        System.out.println("\t"+ maquina.defAlcance(tipo));
    }

}
