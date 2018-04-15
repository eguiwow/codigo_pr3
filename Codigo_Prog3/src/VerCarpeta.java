import java.io.File;

public class VerCarpeta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File( "C:\\Users\\Ander\\Documents");
		System.out.println(file.getName());
		visualizar(file,2);
	}
	/** visualiza ficheros y carpetas de nivel n
	 * @param file directorio de inicio de la visualización
	 * @param nivelProfundidad nivel directorio
	 */
	private static void visualizar(File file, int nivelProfundidad) {
	try{
		
	
		for (File f: file.listFiles()){
			for (int esp=0; esp<(nivelProfundidad-1)*2;esp++) System.out.print(" ");
			if(f.isDirectory()){
				System.out.println( nivelProfundidad + "(D) " + f.getName());
				visualizar(f, nivelProfundidad+1);
			}
			else
			System.out.println("(F) " + f.getName());
		}
	}catch(NullPointerException e){
		
	}
	}

}
