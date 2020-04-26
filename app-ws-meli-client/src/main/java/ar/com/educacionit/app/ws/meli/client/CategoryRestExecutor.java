package ar.com.educacionit.app.ws.meli.client;

import javax.ws.rs.core.Response;

import ar.com.educacionit.app.ws.meli.client.dto.category.Categoria;

public class CategoryRestExecutor extends RestRequestExecutor<Categoria> {

	public CategoryRestExecutor(String urlRestApi) {
		super(urlRestApi);
	}

	@Override
	protected Categoria buildResponseDto(Response response) {

		Categoria categoria = response.readEntity(Categoria.class);

		return categoria;
	}

}
