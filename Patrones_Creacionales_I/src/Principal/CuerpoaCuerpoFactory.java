package Principal;

public class CuerpoaCuerpoFactory implements MiliciaFactory{

    public void crearGuerrero() {
        CuerpoCuerpoGuerrero guerrero = new CuerpoCuerpoGuerrero();
        String personaje = guerrero.tipoPersonaje();
        System.out.println(personaje);
        System.out.println("\t"+ guerrero.defVida(personaje));
        System.out.println("\t"+ guerrero.defDaño());
        System.out.println("\t"+ guerrero.defVelocidad());
        System.out.println("\t"+ guerrero.defAlcance(personaje));

    }

    public void crearMaquina() {
        CuerpoCuerpoMaquina maquina = new CuerpoCuerpoMaquina();
        String tipo = maquina.tipoMaquina();
        System.out.println(tipo);
        System.out.println("\t"+ maquina.defVida(tipo));
        System.out.println("\t"+ maquina.defDaño(tipo));
        System.out.println("\t"+ maquina.defVelocidad());
        System.out.println("\t"+ maquina.defAlcance(tipo));

    }
}
