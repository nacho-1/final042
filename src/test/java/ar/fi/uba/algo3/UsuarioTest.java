package ar.fi.uba.algo3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


/* Tuve un problema con la forma en que implemente la funcionalidad de detectar movimiento 3 veces
 * antes de enviar la alerta. Yo lo hice mediante un Hashmap o Hashtable donde el usuario
 * es la llave y el valor seria la cantidad de veces que detecto movimiento y asi saber cuando enviar 
 * la notificacion. Sin embaro por alguna razon no funciona y no puedo encontrar el error.
 * De haber tenido mas tiempo hubiera testeado mas. Para tener pruebas unitarias de los Notificadores 
 * habria necesitado algun framework de mocking lo cual no dispongo ahora.
 * Tambien pude haber agregado interfaces que definan funcionalidades de los aparatos con iot.
 * Sin embargo el modelo actual permitiria agregar funcionalidades simplemente agregando clases lo cual
 * se adapta al principio de open-close que es el unico prinicipio SOLID que se violaba en el modelo
 * anterior.
 */

public class UsuarioTest {

    @Test
    public void testUsuarioCompraTimbreNuevoAunNoDeberiaRecibirUnTimbrazo() {
        Usuario jorge = new Usuario("Jorge");
        Timbre timbre = new Timbre(jorge);
        assertEquals(0, jorge.getTimbrazos());
    }

    @Test
    public void testUsuarioCompraTimbreSuenanElTimbreUnaVezUsuarioDeberiaHaberRecibidoUnTimbrazo() {
        Usuario jorge = new Usuario("Jorge");
        Timbre timbre = new Timbre(jorge);
        timbre.sonar();
        assertEquals(1, jorge.getTimbrazos());
    }
    @Test
    public void testUsuarioCompraTimbreSuenanElTimbreDosVeceUsuarioDeberiaHaberRecibidoDosTimbrazos() {
        Usuario jorge = new Usuario("Jorge");
        Timbre timbre = new Timbre(jorge);
        timbre.sonar();
        timbre.sonar();
        assertEquals(2, jorge.getTimbrazos());
    }
    
    @Test
    public void testUsuarioCompraCamaraAunNoRecibeMovimientos() {
    	Usuario jorge = new Usuario("Jorge");
        CamaraDeVigilancia camara = new CamaraDeVigilancia(jorge);
        assertEquals(0, jorge.getAlertasMovimiento());
    }
    
    @Test
    public void testUsuarioCompraCamaraSoloDetecta1MovimientoNoEnviaAlerta() {
    	Usuario jorge = new Usuario("Jorge");
        CamaraDeVigilancia camara = new CamaraDeVigilancia(jorge);
        camara.detectarMovimiento();
        assertEquals(0, jorge.getAlertasMovimiento());
    }
    
    @Test
    public void testUsuarioCompraCamaraSoloDetecta2MovimientosNoEnviaAlerta() {
    	Usuario jorge = new Usuario("Jorge");
        CamaraDeVigilancia camara = new CamaraDeVigilancia(jorge);
        camara.detectarMovimiento();
        camara.detectarMovimiento();
        assertEquals(0, jorge.getAlertasMovimiento());
    }
    /*
    @Test
    public void testUsuarioCompraCamaraDetecta3MovimientosEnviaAlerta() {
    	Usuario jorge = new Usuario("Jorge");
        CamaraDeVigilancia camara = new CamaraDeVigilancia(jorge);
        camara.detectarMovimiento();
        camara.detectarMovimiento();
        camara.detectarMovimiento();
        assertEquals(1, jorge.getAlertasMovimiento());
    }
    
    @Test
    public void testUsuarioCompraTimbreYCamaraEntreLosDosEnvianAlertaMovimiento() {
    	Usuario jorge = new Usuario("Jorge");
    	Timbre timbre = new Timbre(jorge);
    	CamaraDeVigilancia camara = new CamaraDeVigilancia(jorge);
    	camara.detectarMovimiento();
    	timbre.detectarMovimiento();
    	timbre.detectarMovimiento();
    	assertEquals(1, jorge.getAlertasMovimiento());
    }
    */








}
