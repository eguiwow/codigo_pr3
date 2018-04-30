package copypaste;

public class RecursivoCaracteres {
	
	
	/** M�todo recursivo para probar todas las combinaciones de longitud num de un array de caracteres dado
	 * @param palabra --> es la combinaci�n con la que se empieza, en primera llamada ""
	 * @param letras --> array de caracteres para formar las palabras 
	 * @param num --> n�mero de letras por palabra
	 */
	public static void combinacionLetras(String palabra, char[] letras, int num){
		//Definici�n recursiva --> si la �ltima combinaci�n es "FFF"
		if (num == 0){
			System.out.println(palabra);
		} else{
			for(char miLetra: letras){
				String miPalabra = palabra + miLetra;
				combinacionLetras(miPalabra, letras, num-1);
				//El resto de fors
				}
			}
		}

	/** M�todo shell o concha que hace la primera llamada al m�todo recursivo
	 * @param letras arrayLetras
	 * @param num numero de letras por palabra
	 */
	public static void combinatoria(char[] letras, int num){
		combinacionLetras("", letras, num);
	}
	
	public static void main(String[] args) {
		char [] arrayLetras = {'A', 'F','G','L'};
		
		combinatoria( arrayLetras, 3);
	
		
	}
}
