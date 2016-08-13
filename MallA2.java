
public class MallA2 extends EntertainBuildA2{
	
	int shops,rshops;
	
	public String purpose() {
		return "Shopping";
	}
	
	MallA2() {
		shops=0;
		rshops=0;
	}
	
	MallA2(int x, double y, String label, String clr, int f, int s, int rs) {
		super(x,y,label,clr,f);
		shops=s;
		rshops=rs;
	}

	@Override
	public String toString() {
		return "MallA2 [Name of the Mall = " + name + ", Area sqft = " + sqft + ", Mall Building Color = " + color + ", No. of floors = " + floors + ", Total Shops = " + shops + ", No. of rented shops = " + rshops + ", No. of Food Outlets = " + food_outlets 
				+ "]\nPurpose: " + purpose()+"\n";
	}

}
