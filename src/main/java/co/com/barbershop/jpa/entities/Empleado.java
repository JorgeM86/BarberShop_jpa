package co.com.barbershop.jpa.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="empleado")
public class Empleado {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="cedulaEmpleado")
	private String cedula;
	
	@Column(name="nombreEmpleado")
	private String nombre;
	
	@Column(name="apellidoEmpleado")
	private String apellido;
	
	@Column(name="aliasEmpleado")
	private String alias;
	
	@Column(name="descEmpleado")
	private String descripcion;
	
	@Column(name="edadEmpleado")
	private int edad;
	
	@Column(name="telefonoEmpleado")
	private String telefono;
	
	@Column(name="correoEmpleado")
	private String correo;	
	
	@Column(name="fotoEmpleado")
	private String fotoEmpleado;
	
	public Empleado(int id, String cedula, String nombre, String apellido, String alias, String descripcion, int edad,
			String telefono, String correo, String fotoEmpleado) {
		this.id = id;
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.alias = alias;
		this.descripcion = descripcion;
		this.edad = edad;
		this.telefono = telefono;
		this.correo = correo;
		this.fotoEmpleado = fotoEmpleado;
	}
	
	public Empleado (){
		super();
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getFotoEmpleado() {
		return fotoEmpleado;
	}
	public void setFotoEmpleado(String fotoEmpleado) {
		this.fotoEmpleado = fotoEmpleado;
	}
}
