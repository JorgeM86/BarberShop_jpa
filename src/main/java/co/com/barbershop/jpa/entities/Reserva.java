package co.com.barbershop.jpa.entities;

import java.sql.Date;
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
@Table(name="reserva")
public class Reserva {
	
	public Reserva(int id, int idLugar, int idCliente, Date fecha_inicial, Date fecha_final) {
		this.id = id;
		this.idLugar = idLugar;
		this.idCliente = idCliente;
		this.fecha_inicial = fecha_inicial;
		this.fecha_final = fecha_final;
	}
	
	public Reserva(){
		super();
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idReserva")
	private int id;
	
	@Column(name="idLugar")
	private int idLugar;
	
	@Column(name="idCliente")
	private int idCliente;
	
	@Column(name="fecha_inicial")
	private Date fecha_inicial;
	
	@Column(name="fecha_final")
	private Date fecha_final;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdLugar() {
		return idLugar;
	}
	public void setIdLugar(int idLugar) {
		this.idLugar = idLugar;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public Date getFecha_inicial() {
		return fecha_inicial;
	}
	public void setFecha_inicial(Date fecha_inicial) {
		this.fecha_inicial = fecha_inicial;
	}
	public Date getFecha_final() {
		return fecha_final;
	}
	public void setFecha_final(Date fecha_final) {
		this.fecha_final = fecha_final;
	}
}
