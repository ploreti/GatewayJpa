package it.almawave.gateway.internal;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Parameters
 *
 */
@Entity

@Table(name="parameters")
public class Parameters implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2604947418403455660L;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer ID;
	
	private String KEY;
	private String VALUE;
	private String LABEL;
	
	
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getKEY() {
		return KEY;
	}
	public void setKEY(String kEY) {
		KEY = kEY;
	}
	public String getVALUE() {
		return VALUE;
	}
	public void setVALUE(String vALUE) {
		VALUE = vALUE;
	}
	public String getLABEL() {
		return LABEL;
	}
	public void setLABEL(String lABEL) {
		LABEL = lABEL;
	}
	@Override
	public String toString() {
		return "Parameters [ID=" + ID + ", KEY=" + KEY + ", VALUE=" + VALUE + ", LABEL=" + LABEL + "]";
	}
	
	
	

}
