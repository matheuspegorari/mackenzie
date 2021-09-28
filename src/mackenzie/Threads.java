package mackenzie;

import java.util.Random;

public class Threads {
	public static void main(String[] args) {
		Random rand = new Random();
		
		int[] vet = new int[100];
		int[] vet2 = new int[100];
		
		for(int i = 0;i<50;i++) {
			vet[i] = rand.nextInt(100);
			vet2[i] = rand.nextInt(100);			
		}
		
		ThreadClass tc1 = new ThreadClass();
		tc1.run(vet);
		
		ThreadClass tc2 = new ThreadClass();
		tc2.run(vet2);
		
		
		
	}
}
