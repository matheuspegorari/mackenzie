package mackenzie;

public class ThreadClass extends Thread {	
	
	int soma;
	
	public void run(int[] vet) {
		
		for (int x = 0; x<100;x++) {
			soma += vet[x];
		}
		System.out.println(getName() + " a soma foi " + soma);
		
	}
	
	
}
