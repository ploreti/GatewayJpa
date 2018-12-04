package it.almawave.gateway.internal;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: RequestStatus
 *
 */
@Entity
@Table(name="request_status")

public class RequestStatus implements Serializable {

	   
	@Id  @GeneratedValue
	private Integer ID;
	private String EXT_ID;
	private Integer STATUS;
	private Integer SYSTEM_ID;
	
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date INSERT_DATE;
	
	private static final long serialVersionUID = 1L;

	public RequestStatus() {
		super();
	}   
	public Integer getID() {
		return this.ID;
	}

	public void setID(Integer ID) {
		this.ID = ID;
	}   
	public String getEXT_ID() {
		return this.EXT_ID;
	}

	public void setEXT_ID(String EXT_ID) {
		this.EXT_ID = EXT_ID;
	}   
	public Integer getSTATUS() {
		return this.STATUS;
	}

	public void setSTATUS(Integer STATUS) {
		this.STATUS = STATUS;
	}   
	public Integer getSYSTEM_ID() {
		return this.SYSTEM_ID;
	}

	public void setSYSTEM_ID(Integer SYSTEM_ID) {
		this.SYSTEM_ID = SYSTEM_ID;
	}
	public java.util.Date getINSERT_DATE() {
		return this.INSERT_DATE;
	}
	public void setINSERT_DATE(java.util.Date INSERT_DATE) {
		this.INSERT_DATE = INSERT_DATE;
	}
   
}
