package co.com.barbershop.jpa.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.barbershop.common.DAO.ServiciosDAO;
import co.com.barbershop.common.model.ServiciosDTO;

public class JPAServicioDAOTest {
	
	ClassPathXmlApplicationContext context;

	@Test
	public void testLista_Servicios() {
		context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
		ServiciosDAO serviciosDAO = (ServiciosDAO) context.getBean(ServiciosDAO.class);
	    List<ServiciosDTO> servicios;
		servicios = serviciosDAO.Lista_Servicios();
		for (ServiciosDTO l : servicios) {
			System.out.println(l.getNombre());
		}
	}

}
