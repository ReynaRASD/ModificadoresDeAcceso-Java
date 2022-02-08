package paquete1;

	public class ClasePrivada {
	
		//atributos
		private String nombre;
		private int edad;

		//metodos
		public void setSaludar(String nombre, int edad) { // fijar o modificar el valor
			this.nombre = nombre;
			this.edad = edad;
			System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad);
	}
		
		public String getSaludarNombre() {
			return this.nombre;
		}
		
		public int getSaludarEdad() {
			return this.edad;
		}
	
}
