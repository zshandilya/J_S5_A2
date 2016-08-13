
public class EntertainBuildA2 extends GenBuildingA2{
	
	int food_outlets;
	
	EntertainBuildA2() {
		food_outlets=0;
	}
	
	EntertainBuildA2(int x, double y, String label, String clr, int f) {
		super(x,y,label,clr);
		food_outlets=f;
	}
	
	public String purpose() {
		return "Generic Entertainment";
	}
	
	@Override
	public String toString() {
		return "EntertainBuildA2 [Building Name = " + name + ", No. of floors = " + floors + ", Area sqft = " + sqft + ", Building Color = " + color + ", No. of Food Outlets = " + food_outlets +"]\nPurpose: "+purpose()+"\n";
	}
}
