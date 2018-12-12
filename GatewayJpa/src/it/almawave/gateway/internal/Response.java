package it.almawave.gateway.internal;

import java.io.Serializable;
import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Response
 *
 */
@Entity

@Table(name="response")
public class Response implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6571432994791400607L;

	@Id  @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer ID;
	
	private String EXT_ID;
	private String TUPLA1;
	private String TUPLA2;
	private String TUPLA3;
	private Integer RANK_TUPLA1;
	private Integer RANK_TUPLA2;
	private Integer RANK_TUPLA3;
	private String URGENTE;
	private String KM;
	
	@Lob
	private byte[] TESTO;
	
	public Response() {
		super();
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getEXT_ID() {
		return EXT_ID;
	}

	public void setEXT_ID(String eXT_ID) {
		EXT_ID = eXT_ID;
	}

	public String getTUPLA1() {
		return TUPLA1;
	}

	public void setTUPLA1(String tUPLA1) {
		TUPLA1 = tUPLA1;
	}

	public String getTUPLA2() {
		return TUPLA2;
	}

	public void setTUPLA2(String tUPLA2) {
		TUPLA2 = tUPLA2;
	}

	public String getTUPLA3() {
		return TUPLA3;
	}

	public void setTUPLA3(String tUPLA3) {
		TUPLA3 = tUPLA3;
	}

	public Integer getRANK_TUPLA1() {
		return RANK_TUPLA1;
	}

	public void setRANK_TUPLA1(Integer rANK_TUPLA1) {
		RANK_TUPLA1 = rANK_TUPLA1;
	}

	public Integer getRANK_TUPLA2() {
		return RANK_TUPLA2;
	}

	public void setRANK_TUPLA2(Integer rANK_TUPLA2) {
		RANK_TUPLA2 = rANK_TUPLA2;
	}

	public Integer getRANK_TUPLA3() {
		return RANK_TUPLA3;
	}

	public void setRANK_TUPLA3(Integer rANK_TUPLA3) {
		RANK_TUPLA3 = rANK_TUPLA3;
	}

	public String getURGENTE() {
		return URGENTE;
	}

	public void setURGENTE(String uRGENTE) {
		URGENTE = uRGENTE;
	}

	public String getKM() {
		return KM;
	}

	public void setKM(String kM) {
		KM = kM;
	}

	public byte[] getTESTO() {
		return TESTO;
	}

	public void setTESTO(byte[] tESTO) {
		TESTO = tESTO;
	}

	@Override
	public String toString() {
		return "Response [ID=" + ID + ", EXT_ID=" + EXT_ID + ", TUPLA1=" + TUPLA1 + ", TUPLA2=" + TUPLA2 + ", TUPLA3="
				+ TUPLA3 + ", RANK_TUPLA1=" + RANK_TUPLA1 + ", RANK_TUPLA2=" + RANK_TUPLA2 + ", RANK_TUPLA3="
				+ RANK_TUPLA3 + ", URGENTE=" + URGENTE + ", KM=" + KM + ", TESTO=" + Arrays.toString(TESTO) + "]";
	}

	
}
