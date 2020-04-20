package ar.com.educacionit.app.ws.soap;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import ar.com.educacionit.app.domain.Producto;

@WebService
public interface ProductoWSService {

	@WebMethod
	public Producto getProducto(Long id);

	@WebMethod
	public List<Producto> findProductos();
}
