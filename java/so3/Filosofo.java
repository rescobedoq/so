package so3;

public class Filosofo extends Thread {
	
	
	
	
	@SuppressWarnings("static-access")
	public void run() {
		
		while(true) {
			System.out.println(this.getId() + " : " + this.getName() + " estoy "+this.getState() + " con prioridad " + this.getPriority());
			try {
				this.sleep(5000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void comer() {
		
	}
	
	public void pensar() {
		
	}

}

//12:05 ESTADO
//12:40 PRIORIDAD
