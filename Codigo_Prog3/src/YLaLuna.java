
public class YLaLuna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aLaLuna(0.0001, 384400000.0, 0);
	}

	private static void aLaLuna( double grosor, double dist, long numDob){
		if (grosor >= dist){
			System.out.println("Luna encontrada en " + numDob + " dobleces!" );
			
		} else {
			aLaLuna( grosor*2, dist, numDob+1);
			
		}
	}
}
