package mx.com.scheduler.servicios.scheduler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import mx.com.scheduler.servicios.entity.AntaSolicitud;
import mx.com.scheduler.servicios.repository.AntaSolicitudRepositoy;

@Component
public class ServicioScheduler {
	
	@Autowired
	private AntaSolicitudRepositoy repository;
	
	@Scheduled(fixedRate = 120000, initialDelay = 60000)
    public void sendData() {
		//para usar crone
		//https://frontbackend.com/linux/cron-every-10-minutes
		
		//fixedRate
		//https://github.com/windoctor7/codigo-tutoriales-blog/blob/master/spring-scheduler/src/main/java/windoctor7/github/io/spring/scheduled/TareasPeriodicas.java
        System.out.println("Corrio el cron.....");
        List<AntaSolicitud> resultado = repository.leerSolicitudesPendientes();
        
        if(!resultado.isEmpty()) {
        	for (AntaSolicitud antaSolicitud : resultado) {
        		System.out.println("CAJA: "+antaSolicitud.getCaja());
        		System.out.println("CAJERO:" +antaSolicitud.getCajero());
        		//EJECUTAR EL WEB SERVICES
        		//HACER UPDATE DE LA TABLA ANTASOLCITUD
				//invocar el web services con rest template de spring
			}
        }
        
    }

}
