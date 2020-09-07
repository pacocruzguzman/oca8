package mx.com.develop;

class Cuenta{
	int numeroCuenta;
	String propietario;
	double saldo;

	void consultaInformacionCuenta(){
		System.out.println("Numero de cuenta: " + numeroCuenta);
		System.out.println("Propietario: " + propietario);
		System.out.println("Saldo: " + saldo);
	}
}