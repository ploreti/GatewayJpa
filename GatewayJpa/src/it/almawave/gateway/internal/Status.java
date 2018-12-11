package it.almawave.gateway.internal;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Request
 *
 */
@Entity

@Table(name="status")
public class Status implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6485617124286504615L;
	
	@Id 
	private Integer STATUS;
	
	private String DESCRIZIONE;
	
	public Status() {
		super();
	}

	public Integer getSTATUS() {
		return STATUS;
	}

	public void setSTATUS(Integer sTATUS) {
		STATUS = sTATUS;
	}

	public String getDESCRIZIONE() {
		return DESCRIZIONE;
	}

	public void setDESCRIZIONE(String dESCRIZIONE) {
		DESCRIZIONE = dESCRIZIONE;
	}
	
	
	

}
