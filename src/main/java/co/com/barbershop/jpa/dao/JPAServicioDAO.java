package co.com.barbershop.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;

import co.com.barbershop.common.DAO.ServiciosDAO;
import co.com.barbershop.common.model.ServiciosDTO;

@Repository
public class JPAServicioDAO implements ServiciosDAO {

	@PersistenceContext(name="servicio")
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

	public ServiciosDTO findServiciosById(int id) {
		return null;
	}

	public List<ServiciosDTO> Lista_Servicios() {
		Query query = em.createQuery( "Select new co.com.barbershop.common.model.ServiciosDTO(l.nombre,l.descripcion,l.foto_servicio,l.precio) from Servicio l " );
		List<ServiciosDTO> lista =  query.getResultList();
		return lista;
	}

}
