package core.generics.boundedTypesWildCard;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundWildCardFamilyMember {

	/**
	 * VVIP:- we can add elements in lower-bounded list. 
	 * In lower-bound we can only add class type and it's child.
	 * eg: father and it's child classes.
	 * 
	 * @param list : can contain only Father or it's super classes
	 * like GrandFather and Family.but we can only add Father or it's child
	 * classes.
	 * 
	 * 
	 */
	public static void addFamilyMember(List<? super Father> list) {
		list.add(new Son());
		list.add(new GrandSon());
		list.add(new Father());
		//list.add(new GrandFather()); we cannot add super class of father
		
		for(Object f : list) {
			System.out.println(f.getClass().getName());
		}
		
	}
	
	public static void familyTree(List<? extends GrandFather> list) {
		for(GrandFather gf : list) {
			System.out.println(gf.getClass().getName());
		}
	}
	
	public static void main(String[] args) {
		List<Family> family = new ArrayList<>();
		family.add(new Family());
		
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
		System.out.println("********Seperator***********");
		family.add(new Family());
		family.add(new GrandFather());
		family.add(new Father());
		addFamilyMember(family);
	}


}
