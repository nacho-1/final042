package ar.fi.uba.algo3;

public class Usuario {

    private String nombre;

    private int timbrazos;
    private int alertasDeMovimiento;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.timbrazos = 0;
        this.alertasDeMovimiento = 0;
    }
	
	public int getTimbrazos() {
		return this.timbrazos;
	}
	
	public int getAlertasMovimiento() {
		return this.alertasDeMovimiento;
	}

	public void recibirAlerta(Alerta alerta) {
		/* esto esta mal, pero a fines de testear que el usuario recibe las alertas correctamente
		 * lo dejo asi. Habria que agregar algun comportamiento polimorfico a las alertas.
		 */
		if(alerta instanceof AlertaTimbrazo) {
			this.timbrazos++;
		} else if(alerta instanceof AlertaMovimiento) {
			this.alertasDeMovimiento++;
		}
		
	}
	
}
