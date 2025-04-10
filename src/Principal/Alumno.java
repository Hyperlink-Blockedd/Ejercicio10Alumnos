package Principal;

import java.util.ArrayList;

public class Alumno
{
	private String nombre;
	private ArrayList<Integer> notas;
	
	public Alumno(String nombre)
	{
		super();
		this.nombre = nombre;
		this.notas = new ArrayList<>();
	}
	
	public void addNota(int nota)
	{
		notas.add(nota);
	}
	
	public String toString()
	{
		String resultado="";
		double media;
		int suma = 0;
		for (Integer nota : notas)
			suma += nota;
		media = (double) suma/notas.size();
		resultado = nombre+" "+media;
		return resultado;
	}
	
}
