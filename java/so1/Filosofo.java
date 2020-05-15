package so1;

public class Filosofo {
	String nombre;
	
	public Filosofo(String a) {
		this.nombre = a;
	}
	
	public void Cenar() {
		
		while(true) {
			System.out.println(this.nombre + " estoy comiendo :D.");
		}
	}

}
