package co.com.barbershop.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import co.com.barbershop.common.DAO.Reservas2DAO;
import co.com.barbershop.common.DAO.ReservasDAO;
import co.com.barbershop.common.model.Reservas2DTO;
import co.com.barbershop.common.model.ReservasDTO;

@Repository
public class JPAReservas2DAO implements Reservas2DAO {
	
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

	public List<Reservas2DTO> Lista_Reservas2() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
