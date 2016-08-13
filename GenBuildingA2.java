
public class GenBuildingA2 {
	
	int floors;
	double sqft;
	String name;
	String color;
	
	GenBuildingA2(){
		floors=0;
		sqft=0;
		name="A Generic Building";
	}
	
	GenBuildingA2(int x, double y, String label, String clr) {
		floors=x;
		sqft=y;
		name=label;
		color=clr;
	}

	@Override
	public String toString() {
		return "GenBuildingA2 [Building Name = " + name + ", No. of floors = " + floors + ", Area sqft = " + sqft + ", Building Color = " + color + "]\nPurpose: "+purpose()+"\n";
	}
	
	public String purpose() {
		return "Generic";
	}
	
}
