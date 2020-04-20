package ar.com.educacionit.app.ws.soap.impl;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import ar.com.educacionit.app.domain.Producto;
import ar.com.educacionit.app.ws.soap.ProductoWSService;

@WebService(endpointInterface = "ar.com.educacionit.app.ws.soap.ProductoWSService")
public class ProductoWSServiceImpl implements ProductoWSService {

	@Override
	public Producto getProducto(Long id) {

		Producto producto = new Producto();

		producto.setCodigo("abc");
		producto.setId(1L);
		producto.setDescripcion("Pen Driver");
		producto.setPrecio(175d);

		return producto;
	}

	@Override
	public List<Producto> findProductos() {

		List<Producto> productos = new ArrayList<Producto>();
		Producto producto = new Producto();

		producto.setCodigo("abc");
		producto.setId(1L);
		producto.setDescripcion("Pen Driver");
		producto.setPrecio(175d);
		productos.add(producto);

		producto = new Producto();

		producto.setCodigo("abcf");
		producto.setId(2L);
		producto.setDescripcion("Mouse Inalambrico");
		producto.setPrecio(1750d);
		productos.add(producto);

		return productos;
	}
}
