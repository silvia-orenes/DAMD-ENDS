package rrhh;

import java.util.Scanner;

public class PrincipalPersona {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nombre, apellidos, fecha_cumple, sexo; 
		int edad;
		
		System.out.println("***INICIO DE LA APLICACIÓN PROYECTO A ***");
		System.out.println("Introduce el nombre de la persona 1: ");
		nombre = sc.nextLine();
		System.out.println("Introduce los apellidos de la persona 1: ");
		apellidos = sc.nextLine();
		System.out.println("Introduce la fecha de nacimiento de la persona 1 con formato dd/mm/yyyy: ");
		fecha_cumple = sc.nextLine();
		System.out.println("Introduce el sexo de la persona 1: ");
		sexo = sc.nextLine();
		System.out.println("Introduce la edad de la persona 1: ");
		edad = sc.nextInt();
		sc.nextLine();
			
		//creo el objeto Persona con los datos
		Persona p1 = new Persona(nombre, apellidos,fecha_cumple,edad,sexo);
		//muestro la persona creada por consola
		p1.toString();
		
		
		//PEDIMOS LOS DATOS DE LA SEGUNDA PERSONA
		System.out.println("Introduce el nombre de la persona 2: ");
		nombre = sc.nextLine();
		System.out.println("Introduce los apellidos de la persona 2: ");
		apellidos = sc.nextLine();
		System.out.println("Introduce la fecha de nacimiento de la persona 2 con formato dd/mm/yyyy: ");
		fecha_cumple = sc.nextLine();
		System.out.println("Introduce el sexo de la persona 2: ");
		sexo = sc.nextLine();
		System.out.println("Introduce la edad de la persona 2: ");
		edad = sc.nextInt();
		sc.nextLine();
			
		//creo el objeto Persona con los datos
		Persona p2 = new Persona(nombre, apellidos,fecha_cumple,edad,sexo);
		//muestro la persona creada por consola
		p2.toString();
		
		p1.getEstacionNacimiento(p1.getFecha_cumple());
		p2.getEstacionNacimiento(p2.getFecha_cumple());
		
	}
}
