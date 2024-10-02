package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_usuario database table.
 * 
 */
@Entity
@Table(name="tbl_usuario")
@NamedQuery(name="TblUsuario.findAll", query="SELECT t FROM TblUsuario t")
public class TblUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	private String clave;

	private String claveusuario;

	private int idusuario;

	

	private String nrousuario;

	private String usuario;

	public TblUsuario() {
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getClaveusuario() {
		return this.claveusuario;
	}

	public void setClaveusuario(String claveusuario) {
		this.claveusuario = claveusuario;
	}

	public int getIdusuario() {
		return this.idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}



	public String getNrousuario() {
		return this.nrousuario;
	}

	public void setNrousuario(String nrousuario) {
		this.nrousuario = nrousuario;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}