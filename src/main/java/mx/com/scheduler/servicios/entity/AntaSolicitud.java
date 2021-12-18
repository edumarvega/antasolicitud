package mx.com.scheduler.servicios.entity;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

@Entity
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "AntaSolicitud.NamedQuery_LeerSolicitudesPendientes",
            procedureName = "ventas.PKG_ANTAD.LeerSolicitudesPendientes",
            resultClasses = AntaSolicitud.class,
            parameters = { 
                    @StoredProcedureParameter(mode = ParameterMode.REF_CURSOR, type = ResultSet.class)
            })
})
public class AntaSolicitud {
	
	public static final String NamedQuery_LeerSolicitudesPendientes = "leerSolicitudesPendientes";
	@Column(name = "IDSOLICITUD")
	private Long id;
	@Column(name = "TIPO")
	private String tipo;
	@Column(name = "FECHA")
	private Date fecha;
	@Column(name = "COMERCIO")
	private String comercio;
	@Column(name = "SUCURSAL")
	private String sucursal;
	@Column(name = "CAJA")
	private String caja;
	@Column(name = "CAJERO")
	private String cajero;
	@Column(name = "HORARIO")
	private String horario;
	@Column(name = "TICKET")
	private String ticket;
	@Column(name = "FOLIOCOMERCIO")
	private String folioComercio;
	@Column(name = "OPERACION")
	private String operacion;
	@Column(name = "REFERENCIA")
	private String referencia;
	@Column(name = "MONTO")
	private BigDecimal monto;
	@Column(name = "EMISO")
	private String emisor;
	@Column(name = "MODOINGRESO")
	private String modoIngreso;
	@Column(name = "COMISION")
	private BigDecimal comision;
	@Column(name = "REFERENCIA2")
	private String referencia2;
	@Column(name = "REFERENCIA3")
	private String referencia3;
	@Column(name = "FECHACONTAB")
	private String fechaContab;
	@Column(name = "IDESTADO")
	private Integer idEstado;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getComercio() {
		return comercio;
	}
	public void setComercio(String comercio) {
		this.comercio = comercio;
	}
	public String getSucursal() {
		return sucursal;
	}
	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}
	public String getCaja() {
		return caja;
	}
	public void setCaja(String caja) {
		this.caja = caja;
	}
	public String getCajero() {
		return cajero;
	}
	public void setCajero(String cajero) {
		this.cajero = cajero;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getTicket() {
		return ticket;
	}
	public void setTicket(String ticket) {
		this.ticket = ticket;
	}
	public String getFolioComercio() {
		return folioComercio;
	}
	public void setFolioComercio(String folioComercio) {
		this.folioComercio = folioComercio;
	}
	public String getOperacion() {
		return operacion;
	}
	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	public String getEmisor() {
		return emisor;
	}
	public void setEmisor(String emisor) {
		this.emisor = emisor;
	}
	public String getModoIngreso() {
		return modoIngreso;
	}
	public void setModoIngreso(String modoIngreso) {
		this.modoIngreso = modoIngreso;
	}
	public BigDecimal getComision() {
		return comision;
	}
	public void setComision(BigDecimal comision) {
		this.comision = comision;
	}
	public String getReferencia2() {
		return referencia2;
	}
	public void setReferencia2(String referencia2) {
		this.referencia2 = referencia2;
	}
	public String getReferencia3() {
		return referencia3;
	}
	public void setReferencia3(String referencia3) {
		this.referencia3 = referencia3;
	}
	public String getFechaContab() {
		return fechaContab;
	}
	public void setFechaContab(String fechaContab) {
		this.fechaContab = fechaContab;
	}
	public Integer getIdEstado() {
		return idEstado;
	}
	public void setIdEstado(Integer idEstado) {
		this.idEstado = idEstado;
	}
	
	
}
