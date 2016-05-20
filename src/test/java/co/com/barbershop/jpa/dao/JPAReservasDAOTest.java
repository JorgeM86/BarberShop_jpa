package co.com.barbershop.jpa.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.barbershop.common.DAO.ReservasDAO;
import co.com.barbershop.common.model.Reservas2DTO;
import co.com.barbershop.common.model.ReservasDTO;

public class JPAReservasDAOTest {
	
	ClassPathXmlApplicationContext context;

	@Test
	public void testLista_Reservas() {
		context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
		ReservasDAO reservasDAO = (ReservasDAO) context.getBean(ReservasDAO.class);
	    List<ReservasDTO> reserva;
	    reserva = reservasDAO.Lista_Reservas();
		for (ReservasDTO l : reserva) {
			System.out.println(l.getFecha_inicial());
		}
	}
	
	@Test
	public void testLista_Reservas2() {
		context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
		ReservasDAO reservasDAO = (ReservasDAO) context.getBean(ReservasDAO.class);
	    List<Reservas2DTO> reserva;
	    reserva = reservasDAO.Lista_Reservas2();
		for (Reservas2DTO l : reserva) {
			System.out.println(l.getDescripcion());
		}
	}

}
