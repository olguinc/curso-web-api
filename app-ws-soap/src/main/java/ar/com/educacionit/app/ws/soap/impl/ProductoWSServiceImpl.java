package ar.com.educacionit.app.ws.soap.impl;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import ar.com.educacionit.app.domain.Producto;
import ar.com.educacionit.app.ws.soap.ProductoWSService;
import ar.com.educacionit.app.ws.soap.dto.CreateProductoDTO;

@WebService(endpointInterface = "ar.com.educacionit.app.ws.soap.ProductoWSService")
public class ProductoWSServiceImpl implements ProductoWSService {

	@Override
	public Producto getProducto(Long id) {
		Producto producto = new Producto();
		producto.setId(1L);
		producto.setDescripcion("Pend driver");
		producto.setCodigo("abc");
		producto.setPrecio(175d);
		
		return producto;
	}

	@Override
	public List<Producto> findProductos() {

		List<Producto> productos = new ArrayList<Producto>();

		Producto producto = new Producto();
		producto.setId(1L);
		producto.setDescripcion("Pen driver");
		producto.setCodigo("abc");
		producto.setPrecio(175d);
		productos.add(producto);

		producto = new Producto();
		producto.setId(2L);
		producto.setDescripcion("Mouse optico");
		producto.setCodigo("abcf");
		producto.setPrecio(1750d);
		productos.add(producto);

		return productos;
	}

	@Override
	public Producto createProducto(CreateProductoDTO producto) {
		// DTO = data transfer object
		// Call service to create product
		// Logic will be managed by hibernate
		Producto productoBean = new Producto();
		productoBean.setCodigo(producto.getCodigo());
		productoBean.setDescripcion(producto.getDescripcion());
		productoBean.setPrecio(producto.getPrecio());
		productoBean.setId(2L);

		return productoBean;
	}

	@Override
	public Producto updateProducto(Producto producto) {
		// Call service to update product
		// Logic will be managed by hibernate

		return producto;
	}
}
