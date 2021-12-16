package Principal;

public class CuerpoaCuerpoFactory implements MiliciaFactory{

    public void crearGuerrero() {
        CuerpoCuerpoGuerrero guerrero = new CuerpoCuerpoGuerrero();
    }

    public void crearMaquina() {
        CuerpoCuerpoMaquina maquina = new CuerpoCuerpoMaquina();
    }
}
