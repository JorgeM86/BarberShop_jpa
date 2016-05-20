package co.com.barbershop.jpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="servicio")
public class Servicio {
	
	public Servicio(int id, String nombre, String descripcion, String foto_servicio, int precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.foto_servicio = foto_servicio;
		this.precio = precio;
	}
	
	public Servicio() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idServicio")
	private int id;
	
	@Column(name="nombreServicio")
	private String nombre;
	
	@Column(name="descripcionServicio")
	private String descripcion;
	
	@Column(name="precioServicio")
	private int precio;
	
	@Column(name="fotoServicio")
	private String foto_servicio;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getFoto_servicio() {
		return foto_servicio;
	}
	public void setFoto_servicio(String foto_servicio) {
		this.foto_servicio = foto_servicio;
	}
}
