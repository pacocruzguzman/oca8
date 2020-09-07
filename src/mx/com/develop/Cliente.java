package mx.com.develop;

class Cliente{
	String nombre;
	String apellido;
	Cuenta cuenta;

	public void mostrarInformacionCliente(){
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);
		System.out.println("Cuenta: " + cuenta);
	}
}