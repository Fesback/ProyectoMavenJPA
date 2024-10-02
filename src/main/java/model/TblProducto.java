package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tbl_productos database table.
 * 
 */
@Entity
@Table(name="tbl_productos")
@NamedQuery(name="TblProducto.findAll", query="SELECT t FROM TblProducto t")
public class TblProducto implements Serializable {
	private static final long serialVersionUID = 1L;

	private double cantidad;

	private String codbarras;

	@Temporal(TemporalType.DATE)
	private Date fechaven;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idproucto;

	private String nomprod;

	private String nroloter;

	private double precio;

	private double total;

	public TblProducto() {
	}

	public double getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public String getCodbarras() {
		return this.codbarras;
	}

	public void setCodbarras(String codbarras) {
		this.codbarras = codbarras;
	}

	public Date getFechaven() {
		return this.fechaven;
	}

	public void setFechaven(Date fechaven) {
		this.fechaven = fechaven;
	}

	public int getIdproucto() {
		return this.idproucto;
	}

	public void setIdproucto(int idproucto) {
		this.idproucto = idproucto;
	}

	public String getNomprod() {
		return this.nomprod;
	}

	public void setNomprod(String nomprod) {
		this.nomprod = nomprod;
	}

	public String getNroloter() {
		return this.nroloter;
	}

	public void setNroloter(String nroloter) {
		this.nroloter = nroloter;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getTotal() {
		return this.total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

}