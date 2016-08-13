
public class ResBuildingA2 extends GenBuildingA2{
	
	int rentedFlats;
	int totalFlats;
	
	ResBuildingA2() {
		super();
		rentedFlats=0;
		totalFlats=0;
	}
	
	ResBuildingA2(int x, double y, String label, String clr, int m, int n) {
		
		super(x,y,label,clr);
		rentedFlats=m;
		totalFlats=n;
	}
	
	@Override
	public String toString() {
		return "ResBuildingA2 [Building Name = " + name + ", No. of Floors = " + floors + ", Total No. of Flats = " + totalFlats +", No. of Rented Flats = " + rentedFlats +  ", Area sqft = "
				 + sqft + ", Building Color = " + color + "]\nPurpose: " + purpose()+"\n";
	}

	public String purpose() {
		return "Residence";
	}

}
