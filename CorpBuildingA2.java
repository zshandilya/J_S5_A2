
public class CorpBuildingA2 extends GenBuildingA2{
	String compName;
	int NoEmp;
	String sect;
	
	public CorpBuildingA2() {
		super();
		compName=null;
		NoEmp=0;
		sect=null;
	}
	
	public CorpBuildingA2(int x, double y, String label, String clr, String comp, int count, String sctr) {
		super(x,y,label,clr);
		compName=comp;
		NoEmp=count;
		sect=sctr;
	}
	
	@Override
	public String toString() {
		return "CorpBuildingA2 [Company Name = " + compName + ", Business Sector = " + sect + ", Building Name = " + name + ", Building Color = " + color + ", No. of Employees = " + NoEmp + ", No. of Floors = " + floors + ", Area sqft = "
				 + sqft + "]\nPurpose: " + purpose()+"\n";
	}
	
	public String purpose() {
		return "Corporate";
	}

}
