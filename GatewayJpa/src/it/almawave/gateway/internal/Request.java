package it.almawave.gateway.internal;

import java.io.Serializable;
import java.lang.Integer;
import java.util.Arrays;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Request
 *
 */
@Entity
@NamedQueries({
    @NamedQuery(name="Request.findByExtId",
                query="SELECT r FROM Request r WHERE r.EXT_ID = :extID ")
    
}) 
@Table(name="request")

public class Request implements Serializable {

	private static final long serialVersionUID = 1L;   
	@Id  @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer ID;

	private String EXT_ID;
	private Long AUDIOMA_ID;
	private String NODE_ID;
	private String FILE_URI;
	private String TIPO_VISITA;
	private String DTP;
	private String SPECIALIZZAZIONE;
	
	private Integer CRM_RESPONSE;

	@Lob
	private byte[] PVT;
	@Lob
	private byte[] TXT;

	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date START_DATE;
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date END_DATE;

	public Request() {
		super();
	}   
	
	public Integer getID() {
		return this.ID;
	}
	public void setID(Integer ID) {
		this.ID = ID;
	}

	public String getNODE_ID() {
		return NODE_ID;
	}

	public void setNODE_ID(String nODE_ID) {
		NODE_ID = nODE_ID;
	}

	public String getFILE_URI() {
		return FILE_URI;
	}
	public void setFILE_URI(String fILE_URI) {
		FILE_URI = fILE_URI;
	}
	public String getTIPO_VISITA() {
		return TIPO_VISITA;
	}
	public void setTIPO_VISITA(String tIPO_VISITA) {
		TIPO_VISITA = tIPO_VISITA;
	}
	public String getDTP() {
		return DTP;
	}
	public void setDTP(String dTP) {
		DTP = dTP;
	}
	public String getSPECIALIZZAZIONE() {
		return SPECIALIZZAZIONE;
	}
	public void setSPECIALIZZAZIONE(String sPECIALIZZAZIONE) {
		SPECIALIZZAZIONE = sPECIALIZZAZIONE;
	}
	public byte[] getPVT() {
		return PVT;
	}
	public void setPVT(byte[] pVT) {
		PVT = pVT;
	}
	public byte[] getTXT() {
		return TXT;
	}
	public void setTXT(byte[] tXT) {
		TXT = tXT;
	}
	public java.util.Date getSTART_DATE() {
		return START_DATE;
	}
	public void setSTART_DATE(java.util.Date sTART_DATE) {
		START_DATE = sTART_DATE;
	}
	public java.util.Date getEND_DATE() {
		return END_DATE;
	}
	public void setEND_DATE(java.util.Date eND_DATE) {
		END_DATE = eND_DATE;
	}
	public String getEXT_ID() {
		return EXT_ID;
	}
	public void setEXT_ID(String eXT_ID) {
		EXT_ID = eXT_ID;
	}
	public Long getAUDIOMA_ID() {
		return AUDIOMA_ID;
	}
	public void setAUDIOMA_ID(Long aUDIOMA_ID) {
		AUDIOMA_ID = aUDIOMA_ID;
	}

	public Integer getCRM_RESPONSE() {
		return CRM_RESPONSE;
	}

	public void setCRM_RESPONSE(Integer cRM_RESPONSE) {
		CRM_RESPONSE = cRM_RESPONSE;
	}

	@Override
	public String toString() {
		return "Request [ID=" + ID + ", EXT_ID=" + EXT_ID + ", AUDIOMA_ID=" + AUDIOMA_ID + ", NODE_ID=" + NODE_ID
				+ ", FILE_URI=" + FILE_URI + ", TIPO_VISITA=" + TIPO_VISITA + ", DTP=" + DTP + ", SPECIALIZZAZIONE="
				+ SPECIALIZZAZIONE + ", CRM_RESPONSE=" + CRM_RESPONSE + ", PVT=" + Arrays.toString(PVT) + ", TXT="
				+ Arrays.toString(TXT) + ", START_DATE=" + START_DATE + ", END_DATE=" + END_DATE + "]";
	}
	
	
}
