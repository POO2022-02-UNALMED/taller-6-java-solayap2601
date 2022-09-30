package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	
	private String nombre;
	private Pais pais;
	private int cantidad;
	private static ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		cantidad = 0;
		fabricantes.add(this);	
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Pais getPais() {
		return this.pais;
	}

	
	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public void icrementar() {
		cantidad += 1;
	}
	
	public static ArrayList<Fabricante> getFabricantes(){
		return fabricantes;
	}
	
	public static Fabricante fabricaMayorVentas() {
		
		Fabricante mayor = fabricantes.get(0);
		
		for(Fabricante i:fabricantes) {
			if(i.cantidad > mayor.cantidad) {
				mayor = i;
			}
		}
		return mayor;
		}

}