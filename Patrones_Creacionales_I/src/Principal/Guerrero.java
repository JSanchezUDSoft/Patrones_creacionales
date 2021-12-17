package Principal;

public interface Guerrero {
    public int defVida(String tipoPersonaje);
    public int defDaño();
    public int defVelocidad();
    public int defAlcance(String tipoPersonaje);
    public String tipoPersonaje();
}