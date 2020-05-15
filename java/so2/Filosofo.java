package so2;

public class Filosofo extends Thread {
	String nombre;
	
	public Filosofo(String a) {
		this.nombre = a;
	}
	
	public void run() {
		
		while(true) {
			System.out.println(this.nombre + " estoy comiendo :D.");
		}
	}

}
