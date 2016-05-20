package co.com.barbershop.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import co.com.barbershop.common.DAO.ReservasDAO;
import co.com.barbershop.common.model.Reservas2DTO;
import co.com.barbershop.common.model.ReservasDTO;

@Repository
public class JPAReservasDAO implements ReservasDAO {
	
	@PersistenceContext(name="reserva")
	private EntityManager em;
	private DataSource dataSource;
	
	public EntityManager getEntityManager() {
		return em;
	}
	
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}
	
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public ReservasDTO findReservaById(int id_reserva) {
		// TODO Auto-generated method stub
		return null;
	}

	public void insert_Reserva() {
		// TODO Auto-generated method stub
		
	}

	public void delete_Reserva() {
		// TODO Auto-generated method stub
		
	}
	
	public void update_Reserva() {
		// TODO Auto-generated method stub
		
	}

	public List<ReservasDTO> Lista_Reservas() {
		Query query = em.createQuery( "Select new co.com.barbershop.common.model.ReservasDTO(l.idLugar,l.idCliente,l.fecha_inicial,l.fecha_final) from Reserva l ");
		List<ReservasDTO> lista =  query.getResultList();
		return lista;
	}
	
	public List<Reservas2DTO> Lista_Reservas2() {
		Query query = em.createQuery( "Select new co.com.barbershop.common.model.Reservas2DTO(l.titulo,l.descripcion,l.imagen) from Reserva2 l ");
		List<Reservas2DTO> lista =  query.getResultList();
		return lista;
	}
}
