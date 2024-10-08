import java.util.*;
public class w3q1a{
	int ano;
	String name;
	String sym;
	String group;
	Double wt;
	
//constructor
w3q1a(int ano, String name, String sym, String group, double wt){
	this.ano = ano;
	this.name = name;
	this.sym = sym;
	this.group = group;
	this.wt = wt;
}
public void display(){
	System.out.println("Atomic Number: " +ano);
	System.out.println("Name: " +name);
	System.out.println("Chemical Symbol: " +sym);
	System.out.println("Element Class: " +group);
	System.out.println("Atomic Weight: " +wt);
}
public static void displayGwt(w3q1a elts[]){
	System.out.println("Elements with atomic weight > 15");
	for(int i = 0; i<elts.length; i++){
		if(elts[i].wt>15){
			elts[i].display();
		}
	}
}
public static void main(String[] args){

	w3q1a sodium = new w3q1a(11,"Sodium","Na","Alkali Metal",22.9898);
	w3q1a helium = new w3q1a(2, "Helium", "He", "Noble Gas", 4.0026);
	w3q1a iron = new w3q1a(26, "Iron", "Fe", "Metal", 55.845);

	sodium.display();
	helium.display();
	iron.display();

	w3q1a elts[] = {sodium, helium, iron};
	displayGwt(elts);
	}
}
