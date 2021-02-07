package ar.fi.uba.algo3;

public class NotificadorTimbre implements Notificador {

	@Override
	public void noitificar(Usuario usuario) {
		usuario.recibirAlerta(new AlertaTimbrazo());
	}

}
