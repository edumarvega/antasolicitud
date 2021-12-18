package mx.com.scheduler.servicios.repository;

import java.util.List;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.com.scheduler.servicios.entity.AntaSolicitud;

@Repository
public interface AntaSolicitudRepositoy extends CrudRepository<AntaSolicitud, Long> {
	
	 @Procedure(name = AntaSolicitud.NamedQuery_LeerSolicitudesPendientes)
	  List<AntaSolicitud> leerSolicitudesPendientes();

}
