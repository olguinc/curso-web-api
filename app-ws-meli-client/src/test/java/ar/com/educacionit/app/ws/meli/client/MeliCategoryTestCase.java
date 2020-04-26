package ar.com.educacionit.app.ws.meli.client;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Test;

import ar.com.educacionit.app.ws.meli.client.dto.category.Categoria;

public class MeliCategoryTestCase {

	@Test
	public void categoryTestCase() {

		CategoryRestExecutor sre = new CategoryRestExecutor("https://api.mercadolibre.com/categories/MLA1071");

		try {
			Categoria category = sre.executeRestCall();
			System.out.println(category);
			assertNotNull(category);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
}
