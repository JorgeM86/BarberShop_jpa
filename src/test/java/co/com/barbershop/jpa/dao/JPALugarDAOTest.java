package co.com.barbershop.jpa.dao;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.barbershop.common.DAO.LugarDAO;
import co.com.barbershop.common.model.LugarDTO;

public class JPALugarDAOTest {
	
	ClassPathXmlApplicationContext context;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFindLugarById() {
		context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
	    LugarDAO lugarDAO = (LugarDAO) context.getBean(LugarDAO.class);
	    LugarDTO lugar = lugarDAO.findLugarById(1);
	    System.out.println("Nombre: " + lugar.getNombre());
	    System.out.println("Direccion: " + lugar.getDireccion());
	}

	@Test
	public void testListLugar() {
		context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
	    LugarDAO lugarDAO = (LugarDAO) context.getBean(LugarDAO.class);
	    List<LugarDTO> lugar;
		lugar = lugarDAO.List_Lugar();
		for (LugarDTO l : lugar) {
			System.out.println(l.getImagenLugar());
		}
	}

}
