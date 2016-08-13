
public class MultiplexA2 extends EntertainBuildA2{
	
	int nscreens, cap;
	
	public String purpose() {
		return "Watching Movies";
	}
	
	MultiplexA2() {
		nscreens=0;
		cap=0;
	}
	
	MultiplexA2(int x, double y, String label, String clr, int f, int s, int rs) {
		super(x,y,label,clr,f);
		nscreens=s;
		cap=rs;
	}
	
	@Override
	public String toString() {
		return "MultiplexA2 [Multiplex Name = " + name + ", Area sqft = " + sqft + ", Multiplex Building Color = " + color + ", No. of floors = " + floors + ", No. of Screens = " + nscreens + ", Max Capacity = " + cap + ", No. of Food Outlets = " + food_outlets 
				+ "]\nPurpose: " + purpose()+"\n";
	}
}
