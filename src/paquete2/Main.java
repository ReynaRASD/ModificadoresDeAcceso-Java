package paquete2;
import paquete1.ClaseDefault;
import paquete1.ClasePrivada;
import paquete1.ClaseProtected;

//Un modificador de acceso es para tener controlado
//el acceso entre paquetes y clases

public class Main extends ClaseProtected{
	public static void main(String[] args) {
		ClaseDefault prueba = new ClaseDefault();
		prueba.mostrar();
		System.out.println("*********************************");
		
		ClasePrivada privada = new ClasePrivada();
		//privada.nombre = "RASD";
		//privada.edad = 25;
		
		privada.setSaludar("RASD", 25);
		
		System.out.println(privada.getSaludarNombre());
		System.out.println(privada.getSaludarEdad());
		System.out.println("********************************");
		
		
		
		Main protegido = new Main();
		//Entonces Main funciona como una subclase de la ClaseProtected.
		protegido.setEdad(28); // set modifica
		System.out.println(protegido.getEdad()); //get lee
		System.out.println("*******************************");
		
	}
	
	
}

	