package co.com.barbershop.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import co.com.barbershop.common.DAO.LugarDAO;
import co.com.barbershop.common.model.LugarDTO;

@Repository
public class JPALugarDAO implements LugarDAO {
	
	@PersistenceContext(name="lugar")
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

	public LugarDTO findLugarById(int lugarId) {
		Query q =(Query) getEntityManager().createQuery("SELECT new co.com.barbershop.common.model.LugarDTO(l.nombre, l.direccion, l.alt, l.lon, l.telefono, l.descripcion,l.horario, l.correo, l.imagenLugar) FROM Lugar l WHERE l.id =:lugarId");
		q.setParameter("lugarId", lugarId);
		LugarDTO lugar = (LugarDTO) q.getSingleResult();
		return lugar;
	}

	public List<LugarDTO> List_Lugar() {
		Query query = em.createQuery( "Select new co.com.barbershop.common.model.LugarDTO(l.nombre,l.direccion,l.alt,l.lon,l.telefono,l.descripcion,l.horario,l.correo, l.imagenLugar) from Lugar l " );
		List<LugarDTO> lista =  query.getResultList();
		return lista;
	}

	public LugarDTO findLugarByDireccion(String lugarDireccion) {
		Query q =(Query) getEntityManager().createQuery("SELECT new co.com.barbershop.common.model.LugarDTO(l.nombre, l.direccion, l.alt, l.lon, l.telefono, l.descripcion,l.horario, l.correo, l.imagenLugar) FROM Lugar l WHERE l.id =:lugarDireccion");
		q.setParameter("lugarDireccion", lugarDireccion);
		LugarDTO lugar = (LugarDTO) q.getSingleResult();
		return lugar;
	}


}
