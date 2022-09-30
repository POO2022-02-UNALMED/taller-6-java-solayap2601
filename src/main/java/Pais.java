package vehiculos;

import java.util.ArrayList;

public class Pais {
	private String nombre;
	private int cantidad;
	private static ArrayList<Pais> paises = new ArrayList<Pais>();
	
	public Pais(String nombre) {
		this.nombre = nombre;
		cantidad = 0;
		paises.add(this);
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void icrementar() {
		cantidad += 1;
	}
	public static ArrayList<Pais> getPaises(){
		return paises;
	}
	
	public static Pais paisMasVendedor() {
		Pais mayor = paises.get(0);
		
		for(Pais i:paises) {
				if(i.cantidad > mayor.cantidad) {
				mayor = i;
				}
			}
		return mayor;
	}

}
