package ar.fi.uba.algo3;

public class Timbre {
    
    private Usuario dueño;

    public Timbre(Usuario usuario) {
        this.dueño = usuario;
    }

    public void sonar() {
        NotificadorTimbre notificador = new NotificadorTimbre();
        notificador.noitificar(this.dueño);
    }
    
    public void detectarMovimiento() {
    	NotificadorMovimiento notificador = new NotificadorMovimiento();
    	notificador.noitificar(this.dueño);
    }
}
