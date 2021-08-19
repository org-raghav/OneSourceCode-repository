package core.generics.boundedTypesWildCard;


/**
class Family {
	String familyName;
	public Family(String familyName) {
		this.familyName=familyName;
	}
}

class GrandFather extends Family {
	String grandFatherName;
	String fName;
	public GrandFather(String grandFatherName, String fName) {
		super(fName);
		this.grandFatherName=grandFatherName;
	}
	
}
class Father extends GrandFather {
	String fatherName;
	String grandFatherName;
	public Father(String fatherName, String grandFatherName) {
		this.fatherName=fatherName;
		super(grandFatherName);
	}
}

class Son extends Father {}

class GrandSon extends Son {}

public class UpperBoundWildCardFamilyTree {

	*//**
	 * VVIP:- we can not add elements in upper-bounded list. 
	 * it's kind of read only list, we cannot modify it.
	 * 
	 * @param list
	 *//*
	public static void addFamilyMember(List<? extends GrandFather> list) {
		//list.add(new Son());
	}
	
	public static void familyTree(List<? extends GrandFather> list) {
		for(GrandFather gf : list) {
			System.out.println(gf.getClass().getName());
		}
	}
	
	public static void main(String[] args) {
		List<Family> family = new ArrayList<>();
		family.add(new GrandSon());
		
		List<GrandFather> gfs = new ArrayList<>();
		GrandFather gf1 = new GrandFather();
		gfs.add(gf1);
		
		List<Father> fas = new ArrayList<>();
		Father fa1 = new Father(); 
		fas.add(fa1);
		
		List<Son> sons = new ArrayList<>();
		Son s1 = new Son();
		sons.add(s1);
		
		List<GrandSon> gss = new ArrayList<>();
		GrandSon gs1 = new GrandSon();
		gss.add(gs1);
		
		//familyTree(family); //as method accepts only GrandFather or it's child only.
		familyTree(gfs);
		familyTree(fas);
		familyTree(sons);
		familyTree(gss);
	}
*/

