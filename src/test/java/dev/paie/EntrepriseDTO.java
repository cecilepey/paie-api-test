package dev.paie;

import org.springframework.stereotype.Component;


public class EntrepriseDTO {
	
	private String code;
	
	private String denomination;
	
	


	/** Getter
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/** Setter
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/** Getter
	 * @return the denomination
	 */
	public String getDenomination() {
		return denomination;
	}

	/** Setter
	 * @param denomination the denomination to set
	 */
	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}
	
	

}
