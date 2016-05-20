package co.com.barbershop.jpa.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.barbershop.common.DAO.EmpleadoDAO;
import co.com.barbershop.common.model.EmpleadoDTO;

public class JPAEmpleadoDAOTest {
	
	ClassPathXmlApplicationContext context;

	@Test
	public void testLista_Empleados() {
		context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
	    EmpleadoDAO empleadoDAO = (EmpleadoDAO) context.getBean(EmpleadoDAO.class);
	    List<EmpleadoDTO> empleado;
		empleado = empleadoDAO.Lista_Empleados();
		for (EmpleadoDTO l : empleado) {
			System.out.println(l.getAlias());
		}
	}

}
