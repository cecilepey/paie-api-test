package dev.paie;


import org.junit.Assert;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;



public class EntrepriseApiTest {

	@Test
	public void listerEntreprise() {
		RestTemplate rt = new RestTemplate();
		EntrepriseDTO[] resultatEntreprise = rt.getForObject("https://paie-api-cecile.herokuapp.com/entreprises",
				EntrepriseDTO[].class);
		
		Assert.assertNotNull(resultatEntreprise);
		
		for (EntrepriseDTO liste : resultatEntreprise) {
			Assert.assertNotNull(liste.getCode());
			Assert.assertNotNull(liste.getDenomination());
		}
			
			}

}
