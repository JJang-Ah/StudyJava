package Javapro;

public class ArrayEx2 {

	public static void main(String[] args) {
		int scores[]= {78,96,60,86,77};
		// ÃÑÁ¡=??
		// Æò±Õ=??
		int sum=0;
		double avg;
		for(int i=0; i<scores.length;i++) {
			sum+=scores[i];			
		}
		avg= (double)(sum)/scores.length;
		
		System.out.println("ÃÑÁ¡ : "+sum);
		System.out.println("Æò±Õ : "+avg);
		
		
		
	}

}
