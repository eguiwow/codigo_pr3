package copypaste;

public class Recursividad {

	public static void main(String[] args) {
//		f(0);
		long resultado = factorial(20);
//		System.out.println(resultado);
//		System.out.println(string1_10_1(1));
		System.out.println(fib(10));
	}
	public static void f(int num){
		if (num<1000){
//			f(num+1);
//			System.out.println(num);	//aquí vamos del 0 al 1000
//			
			f(num+1);
			System.out.println(num);	//aquí lo hacemos al revés 1000-0
		}
	}

	private static long factorial(long n) {
		//Definición factorial:
		// factorial (n) = n * factorial (n-1) si n>0
		if (n> 0){
		return  n*factorial(n-1);
		}
		else return 1;
	}
	/** Devuelve un string formado de todos los números
	 * subiendo entre n y 10 y bajando de nuevo hasta n
	 * Ejemplo: "1 2 3 ... 9 10 9 ... 3 2 1"
	 * @param n número en el que empezar (menor o igual)
	 * @return String buscado
	 */
	private static String string1_10_1(int n){
		//Definición recursiva
		//devuelvo n + " " + string1_10_1(n) + " " + n 
		// caso base: n==10 devuelvo "10"
		if (n ==10){
			return "10";
		}
		else
		return  n + " " + string1_10_1(n+1) + " " + n;
		
	}
	private static long fib( long n) {
		//Definición recursiva
		//devuelve fib(n-1)+fib(n-2)
		//caso base: n==1 || n==2 --> fib=1
		if ( n == 1 || n==2 ){
			return 1;
		}else{
			return fib(n-1)+fib(n-2);
		}
		
	}
}
