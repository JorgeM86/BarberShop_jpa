package co.com.barbershop.services;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.barbershop.common.DAO.LugarDAO;
import co.com.barbershop.common.model.LugarDTO;
import co.com.barbershop.common.services.PageLugar;

public class PageLugarImple implements PageLugar {
	
	
	public LugarDTO getLugarPageDTO() {
		 return null;
	}

	public List<LugarDTO> listLugar() {
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
		 LugarDAO lugarDAO = (LugarDAO) context.getBean(LugarDAO.class);
		 List<LugarDTO> lugar;
		 lugar = lugarDAO.List_Lugar();
		 return lugar;
	}
}
