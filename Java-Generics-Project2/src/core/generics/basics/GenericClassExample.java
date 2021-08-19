package core.generics.basics;

class Product{
	
	private Object productId;
	private Object productDescription;
	
	public Product(Object productId, Object productDescription) {
		this.productId = productId;
		this.productDescription = productDescription;
	}
	public Object getProductId() {
		return productId;
	}
	public void setProductId(Object productId) {
		this.productId = productId;
	}
	public Object getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(Object productDescription) {
		this.productDescription = productDescription;
	}
	
}

class Product1<PRODUCT, DESCRIPTION>{
	PRODUCT ProductId;
	DESCRIPTION productDescription;

	public Product1(PRODUCT productId, DESCRIPTION productDescription) {
		ProductId = productId;
		this.productDescription = productDescription;
	}
}

public class GenericClassExample {

	public static void main(String[] args) {
		
		Product product = new Product(121, "Soap");
		int pId = (int)product.getProductId();//type-cast
		System.out.println("Product Id :"+ pId);
		String productDescription = (String)product.getProductDescription();
		System.out.println("product Description :" + productDescription);
		
		
		Product1<Integer, String> product1 = new Product1<>(121, "Soap");
		int productId1 = product1.ProductId;//no need to type-cast
		String productDescription1 = product1.productDescription;
		System.out.println("Product Id :"+ productId1 + " Product Description :"+productDescription1);
		Product1<String, String> product2 = new Product1<>("Pears", "Soap");
		String productId2 = product2.ProductId;//no need to type-cast
		System.out.println(productId2);
	}

}
