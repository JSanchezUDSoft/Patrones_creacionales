package Principal;

public interface Maquina {
    public String tipoMaquina();
    public int defVida(String tipoMaquina);
    public int defDaño(String tipoMaquina);
    public int defVelocidad();
    public int defAlcance(String tipoMaquina);

}
