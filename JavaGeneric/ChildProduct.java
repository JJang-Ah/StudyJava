package JavaGeneric;

public class ChildProduct<T, M, C> extends Product<T, M>{
	
	
	//제네릭 상속
	
	
	private C company;

	public C getCompany() {
		return company;
	}

	public void setCompany(C company) {
		this.company = company;
	}
	
	

}
