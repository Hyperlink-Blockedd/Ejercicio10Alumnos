package Principal;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Alumnos
{
	private ArrayList<Alumno> lista;
	
	public Alumnos()
	{
		lista = new ArrayList<>();
	}
	
	public boolean add(Alumno a)
	{
		return lista.add(a);
	}
	
	public String toString()
	{
		String resultado = "";
		for (Alumno a : lista)
			resultado += a+"\n";
		return resultado;
	}
	
	public void leerFichero(String fileName) throws IOException
	{
		FileReader fr = new FileReader(fileName);
		Scanner entrada = new Scanner(fr);
		String linea;
		String [] tokens;
		Alumno alumno;
		while (entrada.hasNextLine())
		{
			linea = entrada.nextLine();
			tokens = linea.split(";");
			alumno = new Alumno(tokens[0]);
			for (int i=1;i<tokens.length;i++)
				alumno.addNota(Integer.parseInt(tokens[i]));
			lista.add(alumno);
		}
		entrada.close();
		fr.close();
	}
	
}
