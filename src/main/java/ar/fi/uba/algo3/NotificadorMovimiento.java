package ar.fi.uba.algo3;

import java.util.HashMap;

public class NotificadorMovimiento implements Notificador {
	
	private static final HashMap<Usuario, Integer> historial = new HashMap<>();
	private Integer periodoAlertas;
	
	public NotificadorMovimiento() {
		this.periodoAlertas = 3;
	}

	@Override
	public void noitificar(Usuario usuario) {
		if(historial.containsKey(usuario)) {
			Integer notificacionesRecibidas = historial.get(usuario);
			if(notificacionesRecibidas < this.periodoAlertas) {
				historial.replace(usuario, notificacionesRecibidas + 1);
			} else {
				usuario.recibirAlerta(new AlertaMovimiento());
				historial.replace(usuario, 0);
			}
		} else {
			historial.put(usuario, 1);
		}
	}

}
