package so5;

public class Filosofo extends Thread {
	
	int estomago;
	
	public Filosofo() {
		this.estomago = 0;
	}
	
	@SuppressWarnings("static-access")
	public void run() {
		
		while(true) {
				comer();
				try {
					this.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("+Se ha producido una excepcion...");
				}
				long inicio = System.nanoTime();
				pensar();
				long despues = System.nanoTime();
				long tiempo = despues - inicio;
				if(tiempo<=2000) {
					System.out.println(this.getName() + " acabo de morir de hambre.");
				}
		}
	}
	
	public void comer() {
		long inicio = System.nanoTime();
		this.estomago++;
		long despues = System.nanoTime();
		long tiempo = despues - inicio;
		System.out.println(this.getName() + " estoy comiendo ... " + this.estomago + " me demore "+ tiempo);
		
	}
	
	public void pensar() {
		long inicio = System.nanoTime();
		this.estomago--;
		long despues = System.nanoTime();
		long tiempo = despues - inicio;
		System.out.println(this.getName() + " estoy pensando ... " + this.estomago + " me demore "+ tiempo);
	}

}