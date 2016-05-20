package co.com.barbershop.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import co.com.barbershop.common.DAO.EmpleadoDAO;
import co.com.barbershop.common.model.EmpleadoDTO;
import co.com.barbershop.common.model.EmpleadosPageDTO;
import co.com.barbershop.common.services.PageEmpleados;

public class PageEmpleadosImple implements PageEmpleados {

	//private ApplicationContext Ac;
	
	
	public EmpleadosPageDTO getEmpleadosPageDTO() {
		return null;
	}


	public List<EmpleadoDTO> listEmpleados() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
	    EmpleadoDAO empleadoDAO = (EmpleadoDAO) context.getBean(EmpleadoDAO.class);
		List<EmpleadoDTO> empleado;
		empleado = empleadoDAO.Lista_Empleados();
		return empleado;
	}

}
