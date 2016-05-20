package co.com.barbershop.jpa.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import co.com.barbershop.common.DAO.EmpleadoDAO;
import co.com.barbershop.common.model.EmpleadoDTO;

@Repository
public class JPAEmpleadoDAO implements EmpleadoDAO {
	
	@PersistenceContext(name="empleado")
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

	public EmpleadoDTO findEmpleadoById(int id) {
		Query q =(Query) getEntityManager().createQuery( "Select new co.com.barbershop.common.model.EmpleadoDTO(l.cedula,l.nombre,l.apellido,l.alias,l.descripcion,l.edad,l.telefono,l.correo, l.fotoEmpleado) from Empleado l WHERE l.id =:empleadoId ");
		q.setParameter("empleadoId", id);
		EmpleadoDTO lugar = (EmpleadoDTO) q.getSingleResult();
		return lugar;
	}

	public EmpleadoDTO findEmpleadoByCedula(String cedula) {
		Query q =(Query) getEntityManager().createQuery( "Select new co.com.barbershop.common.model.EmpleadoDTO(l.cedula,l.nombre,l.apellido,l.alias,l.descripcion,l.edad,l.telefono,l.correo, l.fotoEmpleado) from Empleado l WHERE l.cedula =:empleadoCedula ");
		q.setParameter("empleadoCedula", cedula);
		EmpleadoDTO lugar = (EmpleadoDTO) q.getSingleResult();
		return lugar;
	}

	public List<EmpleadoDTO> Lista_Empleados() {
		Query query = em.createQuery( "Select new co.com.barbershop.common.model.EmpleadoDTO(l.cedula,l.nombre,l.apellido,l.alias,l.descripcion,l.edad,l.telefono,l.correo, l.fotoEmpleado) from Empleado l ");
		List<EmpleadoDTO> lista =  query.getResultList();
		return lista;
	}
}
