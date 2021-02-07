package ar.fi.uba.algo3;

public class CamaraDeVigilancia {
	
    private Usuario dueño;

    public CamaraDeVigilancia(Usuario usuario) {
        this.dueño = usuario;
    }
    
    public void detectarMovimiento() {
    	NotificadorMovimiento notificador = new NotificadorMovimiento();
    	notificador.noitificar(this.dueño);
    }

}
