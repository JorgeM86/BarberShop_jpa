package co.com.barbershop.services;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.barbershop.common.DAO.ServiciosDAO;
import co.com.barbershop.common.model.ServiciosDTO;
import co.com.barbershop.common.model.ServiciosPageDTO;
import co.com.barbershop.common.services.PageServicios;

public class PageServiciosImple implements PageServicios {
	
	//private ApplicationContext Ac;

	
	public ServiciosPageDTO getServiciosPageDTO() {
		return null;
	}


	public List<ServiciosDTO> listServicios() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
	    ServiciosDAO serviciosDAO = (ServiciosDAO) context.getBean(ServiciosDAO.class);
		List<ServiciosDTO> servicios;
		servicios = serviciosDAO.Lista_Servicios();
		return servicios;
	}

}
