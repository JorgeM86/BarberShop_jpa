package co.com.barbershop.services;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.barbershop.common.DAO.ReservasDAO;
import co.com.barbershop.common.model.Reservas2DTO;
import co.com.barbershop.common.model.ReservasDTO;
import co.com.barbershop.common.model.ReservasPageDTO;
import co.com.barbershop.common.services.PageReservas;

public class PageReservasImple implements PageReservas {

	public ReservasPageDTO getReservasPageDTO() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<ReservasDTO> listReservas() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
	    ReservasDAO reservasDAO = (ReservasDAO) context.getBean(ReservasDAO.class);
		List<ReservasDTO> reservas;
		reservas = reservasDAO.Lista_Reservas();
		return reservas;
	}

	public List<Reservas2DTO> listReservas2() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
	    ReservasDAO reservasDAO = (ReservasDAO) context.getBean(ReservasDAO.class);
		List<Reservas2DTO> reservas;
		reservas = reservasDAO.Lista_Reservas2();
		return reservas;
	}

	

}
