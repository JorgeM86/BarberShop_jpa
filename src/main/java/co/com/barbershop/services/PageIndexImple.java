package co.com.barbershop.services;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.ModelAndView;

import co.com.barbershop.common.model.IndexPageDTO;
import co.com.barbershop.common.services.PageIndex;


public class PageIndexImple implements PageIndex  {
	
	//private ApplicationContext Ac;

	
	public IndexPageDTO getIndexPageDTO() {
		
		/*IndexPageDTO indexPageDTO = new IndexPageDTO();
		
		ArrayList<String>  imagePath = new  ArrayList<String>();
		imagePath.add("resources/assets/images/bb3.gif");
		imagePath.add("resources/assets/images/servicesmain-618x412-69.jpg");
		imagePath.add("resources/assets/images/cortehombre-388x368-78.jpg");
		imagePath.add("resources/assets/images/barbahombre2-580x387-60.jpg");
		imagePath.add("resources/assets/images/tinte-1000x680-96.jpg");
		imagePath.add("resources/assets/images/mlux-spa-services-1353x936-89.jpg");
		imagePath.add("resources/assets/images/manicurepedicure-1024x778-0.jpg");
		imagePath.add("resources/assets/images/best-spas-in-sydney1-1600x1200-84.jpg");
		indexPageDTO.setImagePath(imagePath);
		
		ArrayList<String>  titulos = new  ArrayList<String>();
		titulos.add("NUESTROS SERVICIOS");
		titulos.add("NUESTRAS SEDES");
		titulos.add("RESERVA YA!");
		titulos.add("NUESTROS PROFESIONALES");
		indexPageDTO.setTitulos(titulos);
		
		ArrayList<String>  descripcion = new  ArrayList<String>();
		descripcion.add("BARBER SHOP posee uno de los menus de servicios mas detallados en el la industria barbera. VEN! Y ANIMATE A UN CORTE!!");
		descripcion.add("BARBER SHOP tiene sedes en todo el pais, todo esto para surtitr tus necesidades esteticas con la mejor calidad y cariño.");
		descripcion.add("Animate y has una reserva en la sede mas cercanda a tu recidencia. Horarios Lun - Vier 8:00 am - 8:00 pm Y Sabados 8:00 am a 6:00 pm ");
		descripcion.add("Ven y conoce a nuestro equipo de profesionales que juntos conforman la famila BARBER SHOP");
		indexPageDTO.setDescripcion(descripcion);*/
		
		/*return indexPageDTO;
		 * 	BarberiaFacade bf = new BarberiaFacade();
		//BarberiaFacade bf = new BarberiaFacade.getInstance();
		return new ModelAndView("servicios2", "command", bf.getServiciosPageDTO());
		 * 
		 * */
		
		return null;
		
	}
	
	
	//metodos JPA
	
	

}
