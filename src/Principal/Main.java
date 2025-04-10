package Principal;

import java.io.IOException;

public class Main
{

	public static void main(String[] args) throws IOException
	{
		Alumnos alumnos = new Alumnos();
		
		alumnos.leerFichero("notas.txt");
		
		System.out.println(alumnos);
	}

}
