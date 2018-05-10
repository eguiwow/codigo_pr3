import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class GrafoCarreteras {

//	private HashSet<String> ciudades;
//	private ArrayList<Carretera> carreteras;
	private HashMap<String, ArrayList<Carretera>> carreteras;
	
	public ArrayList<Carretera> getCarrs( String ciudad ) {
		return carreteras.get( ciudad );
	}
	
	//anyadirCarretera( String ciudad1, String ciudad2, int distancia)
	//int getDistanciaMinima(String ciudad1, String ciudad2 )
	
	public class Carretera{
		private String ciudad1;
		private String ciudad2;
		private int distancia; // km
		
		public Carretera(String ciudad1, String ciudad2, int distancia){
			super();
			this.ciudad1 = ciudad1;
			this.ciudad2 = ciudad2;
			this.distancia = distancia;
		}

		public String getCiudad1() {
			return ciudad1;
		}

		public void setCiudad1(String ciudad1) {
			this.ciudad1 = ciudad1;
		}

		public String getCiudad2() {
			return ciudad2;
		}

		public void setCiudad2(String ciudad2) {
			this.ciudad2 = ciudad2;
		}

		public int getDistancia() {
			return distancia;
		}

		public void setDistancia(int distancia) {
			this.distancia = distancia;
		}
		
	} 
	
	public static void main(String[] args) {	
		
	}

}
