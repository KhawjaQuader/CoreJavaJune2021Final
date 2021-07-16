package lec11_java_oop_inheritance;

public class TestFamilyHierarchy {

	public static void main(String[] args) {
		
		Grandfather grandfather = new Grandfather();
		grandfather.grandfatherInfo();
		
		Uncle uncle = new Uncle();
		uncle.uncleInfo();
		Cousin2 cousin2 = new Cousin2();
		cousin2.cousin2Info();
		
		Aunt aunt = new Aunt();
		aunt.auntInfo();
		Cousin1 cousin1 = new Cousin1();
		cousin1.cousin1Info();
		
		
		Father father = new Father();
		father.fatherInfo();		
		
		Sister sister = new Sister();
		sister.sisterInfo();	
		Niece niece = new Niece();
		niece.nieceInfo();
		GrandChildren grandChildren = new GrandChildren();
		grandChildren.grandchildrenInfo();
		
		Brother brother = new Brother();
		brother.brotherInfo();
		Nephew nephew = new Nephew();
		nephew.nephewInfo();
		
		Me me = new Me();
		me.myInfo();
		Daughter daughter = new Daughter();
		daughter.daughterInfo();
		
		
		
		
		
		

	}

}
