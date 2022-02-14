package JavaAPI;

public class StringEx6 {

	public static void main(String[] args) {

		String[] names = {"»´±Êµø", "±Ë±‚µø", "∞Ìøµ»Ò"};
		String[] ssn = {"123123-1001234", 
				"456456-2004567", "789789-3007890"};
		
		//** ∞≥¿Œ¡§∫∏ **
		//»´±Êµø ==> 123123-*******
		//±Ë√∂ºˆ ==> 456456-*******
		
		
		System.out.println("**∞≥¿Œ¡§∫∏**");
		
		for(int i=0;i<names.length;i++) {
			String[] sssn = new String[names.length];
			sssn[i] = ssn[i].substring(0,6) + "-*******";
			
			System.out.println(names[i] + "==>" + sssn[i]);
		}
		
	}

}
