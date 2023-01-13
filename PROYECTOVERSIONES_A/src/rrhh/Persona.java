package rrhh;

public class Persona {
	//declaramos los atributos como privados
		private String nombre;
		private String apellidos;
		private String fecha_cumple; //la declaro como String porque no hemos visto aún los datos de tipo Date
		private int edad;
		private String sexo;
		
		//constructor
		public Persona(String nombre, String apellidos, String fecha_cumple, int edad, String sexo) {
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.fecha_cumple = fecha_cumple;
			this.edad = edad;
			this.sexo = sexo;
		}

		//métodos getter y setter
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellidos() {
			return apellidos;
		}

		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}

		public String getFecha_cumple() {
			return fecha_cumple;
		}

		public void setFecha_cumple(String fecha_cumple) {
			this.fecha_cumple = fecha_cumple;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public String getSexo() {
			return sexo;
		}

		public void setSexo(String sexo) {
			this.sexo = sexo;
		} 
	
	/* método que dada la fecha de nacimiento, nos diga si la persona 
	 * ha nacido en primavera, verano, otoño o invierno
	 */
	
	public void getEstacionNacimiento(String fecha) {
		
		String estacion;
		String dia = fecha.substring(0,2); //extraigo la subcadena que hay desde la posición 0 a la 2
		
		//extraigo el mes de la variable fecha que debe tener formato dd/mm/yyyy.
		//indicándole que coja la subcadena que empieza en la posición siguiente a la primera /
		//y que termina dos posiciones despues
		String mes = fecha.substring(fecha.indexOf("/")+1,fecha.indexOf("/")+3);
		
		//transformamos dia y mes a enteros para poder hacer comparaciones con > e ==
		int diaNac = Integer.parseInt(dia);
		int mesNac = Integer.parseInt(mes);
		
		//Primavera: inicia el 20 de marzo al 21 de junio. 
		if((diaNac>=20 && mesNac==3)|| mesNac==4 || mesNac==5 || (diaNac<=21 && mesNac==6))
			estacion = "primavera";
		
		//Verano: inicia el 21 de junio y finaliza el 23 de septiembre. 
		else if ((diaNac>=21 && mesNac==6)|| mesNac==7 || mesNac==8 || (diaNac<=23 && mesNac==9))
			estacion = "verano";
		
		//Otoño: inicia el 23 de septiembre y finaliza el 21 de diciembre.
		else if ((diaNac>=23 && mesNac==9)|| mesNac==10 || mesNac==11 || (diaNac<=21 && mesNac==12))
			estacion = "otoño";
		else
			estacion = "invierno";
		//Invierno: inicia el 21 de diciembre y finaliza el 20 de marzo.	 
		
		System.out.println(this.nombre + " has nacido en " + estacion);
	}
	
	
}
