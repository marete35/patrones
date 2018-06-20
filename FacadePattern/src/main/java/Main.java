/**
 * Imaginaremos que estamos, con un equipo de desarrollo, realizando el software para una inmobiliaria. Obviamente una inmobiliaria
 * realiza muchos trabajos diferentes, como el cobro de alquiler, muestra de inmuebles, administracion de consorcios, contratos 
 * de ventas, contratos de alquiler. etc. 
 * Por una cuestion de seguir el paradigma de programacion orientada a objetos, es probable que no se realice todo a una misma clase, 
 * sino que se dividen las responsabilidades en diferentes clases. 
 * @author Mario
 *
 */
public class Main {

	public static void main(String[] args) {
		Cliente c = new Cliente();
		Interesado i = new Interesado();
		Inmobiliaria inmo = new Inmobiliaria();
		
		inmo.atencionCliente(c);
		inmo.atencionInteresado(i);
		
		MuestraPropiedad muestraPropiedad = new MuestraPropiedad();
		muestraPropiedad.mostrarPropiedad(123);
		
		VentaInmueble venta = new VentaInmueble();
		venta.gestionaVenta();
		
		AdministracionAlquiler alquiler = new AdministracionAlquiler();
		alquiler.cobro(1200);
		CuentasAPagar cuentasAPagar = new CuentasAPagar();
		cuentasAPagar.pagoPropietario(1100);
		
		//lo mismo pero despues del Facade
		Inmobiliaria inmo2 = new Inmobiliaria();
		inmo2.atencion(i);
		inmo2.atencion(c);
		inmo2.mostrarPropiedad(123);
		inmo2.gestionaVenta();
		inmo2.cobraAlquiler(1200);
		inmo2.paga(1100);
	}

}
