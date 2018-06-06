import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import javax.sound.midi.Receiver;

public class GrafoCarreteras {

//	private HashSet<String> ciudades;
//	private ArrayList<Carretera> carreteras;
	private HashMap<String, ArrayList<Carretera>> carreteras;

	public ArrayList<Carretera> getCarrs( String ciudad ) {
		return carreteras.get( ciudad );
	}

	public GrafoCarreteras(){
		carreteras = new HashMap<>();
	}
	public void anyadirCarretera( String ciudad1, String ciudad2, int distancia){
		if ( !carreteras.containsKey(ciudad1)) carreteras.put(ciudad1, new ArrayList<>());
			carreteras.get(ciudad1).add(new Carretera(ciudad1,ciudad2,distancia));
		if ( !carreteras.containsKey(ciudad2)) carreteras.put(ciudad2, new ArrayList<>());
			carreteras.get(ciudad2).add(new Carretera(ciudad2,ciudad1,distancia));
			
	}
	public int getDistanciaMinima(String ciudad1, String ciudad2 ){
				
		return getDMRecursiva(ciudad1, ciudad2, ciudad1, 0);
	}
	
	public int getDMRecursiva(String ciudad1, String ciudad2, String caminoRecorrido, int distAcumulada) {
		
		if (ciudad1.equals(ciudad2)){
			System.out.println(caminoRecorrido + "-" + "distancia " + distAcumulada);
			return 0;
		} else {
		
		int menor = Integer.MAX_VALUE;
		for ( Carretera c : carreteras.get(ciudad1)){
			if (!caminoRecorrido.contains(c.ciudad2)){
			int dist = getDMRecursiva( c.ciudad2, ciudad2, caminoRecorrido + "#" + c.ciudad2, distAcumulada + c.distancia);
			if (dist<Integer.MAX_VALUE) dist = dist + c.distancia;
			if (dist<menor) menor = dist;
			}
		}
		return menor;
		}
	}
	
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
	
	GrafoCarreteras grafoEjemplo = new GrafoCarreteras();
	grafoEjemplo.anyadirCarretera("Bilbao", "Vitoria", 61);
	grafoEjemplo.anyadirCarretera("Bilbao", "Santander", 108);
	grafoEjemplo.anyadirCarretera("Bilbao", "Donostia", 112);
	grafoEjemplo.anyadirCarretera("Vitoria", "Pamplona", 95);
	grafoEjemplo.anyadirCarretera("Donostia", "Vitoria", 101);
	grafoEjemplo.anyadirCarretera("Pamplona", "Donostia", 82);
	grafoEjemplo.anyadirCarretera("Pamplona", "Logroño", 80);
	grafoEjemplo.anyadirCarretera("Burgos", "Vitoria", 114);
	grafoEjemplo.anyadirCarretera("Burgos", "Palencia", 93);
	grafoEjemplo.anyadirCarretera("Burgos", "Valladolid", 117);
	grafoEjemplo.anyadirCarretera("Logroño", "Vitoria", 86);
	grafoEjemplo.anyadirCarretera("Logroño", "Soria", 100);
	grafoEjemplo.anyadirCarretera("Logroño", "Zaragoza", 172);
	grafoEjemplo.anyadirCarretera("Soria", "Burgos", 141);
	grafoEjemplo.anyadirCarretera("Zaragoza", "Huesca", 72);
	System.out.println(grafoEjemplo.getDistanciaMinima("Bilbao","Soria"));
	
	}
}
