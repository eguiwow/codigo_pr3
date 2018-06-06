import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.TreeMap;

public class Jugador {

	private String email;
	private int maxPuntuacion;
	
	private static HashMap<String,Integer> mapaPrueba = new HashMap<>();
	private static TreeMap<String,Integer> treeMapaPrueba = new TreeMap<>();
	private static LinkedList<Jugador> llJugador = new LinkedList<>();
	private static ArrayList<Jugador> alJugador = new ArrayList<>();
	
	public Jugador(String email, int maxPunt){
		super();
		this.email=email;
		this.maxPuntuacion=maxPunt;
		
	}
	public static void pruebaHashMap(){
		String mail = "test"; 
		for (int i=0; i<12000;i++){
			mapaPrueba.put(mail, 0);
			mail = mail + i;
		}
	}
	public static void pruebaTreeMap(){
		String mail = "test"; 
		for (int i=0; i<12000;i++){
			treeMapaPrueba.put(mail, 0);
			mail = mail + i;
		}
	}
	public static void pruebaLinkedList(){
		String mail = "test"; 
		for (int i=0; i<2000;i++){
			alJugador.add(0, new Jugador(mail, 0));
			mail = mail + i;
		}
	}

	public static void pruebaArrayList(){
		String mail = "test"; 
		for (int i=0; i<2000;i++){
			llJugador.addFirst(new Jugador(mail, 0));
			mail = mail + i;
		}
	}		

	public static void main(String[] args) {
	    long startTime = System.currentTimeMillis();	
//	    pruebaHashMap();
	    long stopTime = System.currentTimeMillis();
	    long elapsedTime = stopTime - startTime;
	    System.out.println(elapsedTime);

	    startTime = System.currentTimeMillis();	
//	    pruebaTreeMap();
	    stopTime = System.currentTimeMillis();
	    elapsedTime = stopTime - startTime;
	    System.out.println(elapsedTime);

	    startTime = System.currentTimeMillis();	
	    pruebaLinkedList();
	    stopTime = System.currentTimeMillis();
	    elapsedTime = stopTime - startTime;
	    System.out.println(elapsedTime);
	    
	    startTime = System.currentTimeMillis();	
	    pruebaArrayList();
	    stopTime = System.currentTimeMillis();
	    elapsedTime = stopTime - startTime;
	    System.out.println(elapsedTime);
	    
	}
}

