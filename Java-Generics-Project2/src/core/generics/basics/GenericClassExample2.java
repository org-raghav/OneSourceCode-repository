package core.generics.basics;

class MyGenericClassWithTwoParameter<Ram, Shyam>{
	private Ram ram;
	private Shyam shyam;
	
	public MyGenericClassWithTwoParameter() {
	}
	public MyGenericClassWithTwoParameter(Ram ram, Shyam shyam) {
		this.ram = ram;
		this.shyam = shyam;
	}
	public Ram getRam() {
		return ram;
	}
	public void setRam(Ram ram) {
		this.ram = ram;
	}
	public Shyam getShyam() {
		return shyam;
	}
	public void setShyam(Shyam shyam) {
		this.shyam = shyam;
	}
	
}


public class GenericClassExample2 {

	public static void main(String[] args) {
		MyGenericClassWithTwoParameter<String, String> myClass = new MyGenericClassWithTwoParameter<>("raghavendra", "rai");
		System.out.println(myClass.getRam() + " " +myClass.getShyam());
	}

}
