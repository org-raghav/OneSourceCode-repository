package core.generics.basics;


public class GenericClassWithKTypeAndVType {

	public static void main(String[] args) {
		Mapping<Integer, String> map = new Mapping<>(1, "One");
		System.out.println(map);
		Integer k = map.getK();
		String v = map.getV();
		System.out.println("key : "+k+ " value : "+v);
	}
}

class Mapping<K, V>{
	private K k;
	private V v;

	public Mapping(K k, V v) {
		this.k = k;
		this.v = v;
	}

	public K getK() {
		return k;
	}

	public void setK(K k) {
		this.k = k;
	}

	public V getV() {
		return v;
	}

	public void setV(V v) {
		this.v = v;
	}

	@Override
	public String toString() {
		return "Mapping [k=" + k + ", v=" + v + "]";
	}
	
}
