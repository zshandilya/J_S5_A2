
public class BuildingDemoA2 {

	public static void main(String[] args) {

		GenBuildingA2 b;
		b=new GenBuildingA2(20,2875,"The Nexus Tower","Grey");
		System.out.println(b.toString());
		
		b=new ResBuildingA2(22,9826,"Yantra","Barn Red",53,88);
		System.out.println(b.toString());
		
		b=new CorpBuildingA2(8, 4785, "Tower 1","Forest Green","DELL",877,"IT");
		System.out.println(b.toString());
		
		b=new EntertainBuildA2(3,11325,"Recreational Paradise","Yellow",15);
		System.out.println(b.toString());
		
		b=new MallA2(4, 14326,"Ambience Mall","Turquoise",38, 145, 132);
		System.out.println(b.toString());
		
		b=new MultiplexA2(2, 8768, "Delite Cinemas","Cyan",4,6,900);
		System.out.println(b.toString());
	}

}
