package co.com.barbershop.jpa.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="lugar")
public class Lugar {
	
	//sin ID
	public Lugar(String nombre, String direccion, long alt, long lon,String telefono,String descripcion, String horario,
				String correo, String imagenLugar) {
			this.nombre=nombre;
			this.direccion=direccion;
			this.alt=alt;
			this.lon=lon;
			this.telefono=telefono;
			this.descripcion=descripcion;
			this.horario=horario;
			this.correo=correo;
			this.imagenLugar = imagenLugar;
	}
	
	//con ID
	public Lugar(int id, String nombre, String direccion, Long alt, Long lon, String telefono, String descripcion,
			String horario, String correo, String imagenLugar) {
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.alt = alt;
		this.lon = lon;
		this.telefono = telefono;
		this.descripcion = descripcion;
		this.horario = horario;
		this.correo = correo;
		this.imagenLugar = imagenLugar;
	}

	//Basio
	public Lugar (){
		super();
	}
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="direccion")
	private String direccion;
	
	@Column(name="dir_lat")
	private Long alt;
	
	@Column(name="dir_lon")
	private Long lon;
	
	@Column(name="telefono")
	private String telefono;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="horario")
	private String horario;
	
	@Column(name="correo")
	private String correo;
	
	@Column(name="imagenLugar")
	private String imagenLugar;
	
	public String getImagenLugar() {
		return imagenLugar;
	}
	public void setImagenLugar(String imagenLugar) {
		this.imagenLugar = imagenLugar;
	}
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Long getAlt() {
		return alt;
	}
	public void setAlt(Long alt) {
		this.alt = alt;
	}
	public Long getLon() {
		return lon;
	}
	public void setLon(Long lon) {
		this.lon = lon;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	
	
}
