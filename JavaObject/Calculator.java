package JavaObject;

public class Calculator {
	//�޼ҵ常 ������̴�.
	
	//���� on �޼ҵ�
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}
//	// ���ϱ� �޼���
//	int add(int x, int y) {
//		int result = x + y;
//		return result;
//	}
//	
	// ���ŵ� ���ϱ� �޼ҵ�
//	int add(int[] values) {
//		int sum=0;
//		for(int i=0;i<values.length; i++) {
//			sum+=values[i];
//		}
//		return sum;
//	}
	
	//���ϱ� �޼ҵ� ����2
	//�Ű� ������ ���� �� ���
	int add (int ...values) {
		int sum=0;
		for(int i=0; i<values.length; i++) {
			sum+=values[i];
		}
		return sum;
	}
	// ���� �޼���
	int subtract (int x, int y) {
		int result = x - y;
		return result;
	}
	// ���ϱ� �޼���
	int Multiply (int x, int y) {
		int result = x+y;
		return result;
	}
	// ������ �޼���
	double Divide (int x, int y) {
		double result = (double)x/y;
		return result;
	}
	// ���� off �޼���
	
	
	

}
