package com.sopra.spring.ejemplo02spring.ej01;

public class BarDeCopas {
	private String nombre;
	private String CalidadDeLaBebida;
	
	
	@Override
	public String toString() {
		return "BarDeCopas [nombre=" + nombre + ", CalidadDeLaBebida=" + CalidadDeLaBebida + "]";
	}
	public String getNombre() {
		return nombre;
	}	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BarDeCopas other = (BarDeCopas) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCalidadDeLaBebida() {
		return CalidadDeLaBebida;
	}
	public void setCalidadDeLaBebida(String calidadDeLaBebida) {
		CalidadDeLaBebida = calidadDeLaBebida;
	}
	
	
}
