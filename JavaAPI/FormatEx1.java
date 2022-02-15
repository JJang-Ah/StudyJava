package JavaAPI;

import java.text.DecimalFormat;

public class FormatEx1 {

	public static void main(String[] args) {
		String temp="", temp2="";
		int num1 = 235000000;
		String str = String.valueOf(num1);
		for(int i=str.length()-1;i>=0; i--){
			temp+=str.charAt(i);
			
		}
		
		System.out.println(temp);
		for(int i=0; i<str.length(); i++) {
			temp2+=temp.charAt(i);
			if(i%3==0&&i!=0) {
				temp2+=",";
			}
		}
		System.out.println(temp2);
		String temp3="";
		for(int i=temp2.length()-1;i>=0;i--) {
			temp3+=temp2.charAt(i);
		}
		
		System.out.println(temp3);
		
		int num2=23500000;
		DecimalFormat df = new DecimalFormat("#,##0");
		df.format(num2);
		System.out.println(df.format(num2));
		
		double dnum = 24254.13;
		df = new DecimalFormat("0.00");
		System.out.println(df.format(dnum));
		
		
	}

}
