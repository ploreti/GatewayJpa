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
@NamedQueries({
    @NamedQuery(name="RequestStatus.findStatusByExtId",
                query="SELECT r.STATUS FROM RequestStatus r WHERE r.EXT_ID = :extID ORDER BY r.INSERT_DATE DESC")
    
}) 
@Table(name="request_status")

public class RequestStatus implements Serializable {

	   
	@Id  @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer ID;
	private String EXT_ID;
	@ManyToOne
	@JoinColumn(name="STATUS")
	private Status STATUS;
	
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


	public Status getSTATUS() {
		return STATUS;
	}
	
	public void setSTATUS(Status sTATUS) {
		STATUS = sTATUS;
	}
	
	public java.util.Date getINSERT_DATE() {
		return this.INSERT_DATE;
	}
	
	public void setINSERT_DATE(java.util.Date INSERT_DATE) {
		this.INSERT_DATE = INSERT_DATE;
	}
	@Override
	public String toString() {
		return "RequestStatus [ID=" + ID + ", EXT_ID=" + EXT_ID + ", STATUS=" + STATUS 
				+ ", INSERT_DATE=" + INSERT_DATE + "]";
	}
	
	
   
}
