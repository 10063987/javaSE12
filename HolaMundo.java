public class HolaMundo
{
	public static void main(String[] args)
	{

		System.out.println("\n\n\t\tJava Development Kit --> Para desarrollar");
		System.out.println("\n\n\t\tJava Runtime Environment --> Para ejecutar");

		System.out.println("\n\n\t'javac HolaMundo.java' --> Compilador--> 'byte code'");
		System.out.println("\t'java Holamundo' --> JVM --> ejecutable");


		System.out.println("\n\tEl método \"main\" es el punto de partida de todo programa java");


		System.out.println("\t------------------------------------------------");
		System.out.println("\t\t\tTipos de Datos");
		System.out.println("\t------------------------------------------------");


		System.out.println("\n\t\tTipos de datos primitivos enteros");

		System.out.println("\t\t\tbyte\t1 byte");
		System.out.println("\t\t\tshort\t2 bytes");
		System.out.println("\t\t\tint\t4 bytes");
		System.out.println("\t\t\tlong\t8 bytes");

		System.out.println("\tEjemplos: \n");

		//Enteros
		System.out.println("\t\t\tbyte edad = 127;");
		System.out.println("\t\t\tshort year = 2020;");
		System.out.println("\t\t\tint id_user = 1001;");
		System.out.println("\t\t\tlong id_twitter = 123456789L;");

		byte edad = 127;
		short year = 2020;
		int id_user = 1001;
		long id_twitter = 123456789L;

		System.out.println("\n\t\tTipos de datos primitivos con punto decimal");

		System.out.println("\t\t\tfloat \t4 bytes");
		System.out.println("\t\t\tdouble \t8 bytes");


		System.out.println("\t\tEjemplos: \n");

		//Decimales
		System.out.println("\t\t\tfloat diametro = 34.25f;");
		System.out.println("\t\t\tdouble precio = 1234.123456789987654321;");

		float diametro = 34.25f;
		double precio = 1234.123456789987654321;

		//Texto
		char genero = 'F';



		//Lógico
		System.out.println("\n\ttTipo de dato lógico");
		System.out.println("\t\t\tboolean isVisible = true;");
		boolean isVisible = true;
		boolean funciona = false;


	}
}