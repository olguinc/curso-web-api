package ar.com.educacionit.dao;

import java.util.List;
import ar.com.educacionit.app.domain.Producto;
import ar.com.educacionit.dao.exceptions.DuplicateException;
import ar.com.educacionit.dao.exceptions.GenericException;

public interface ProductoDAO {

	public Producto getProducto(String codigo) throws GenericException;

	public List<Producto> findProductos() throws GenericException;

	public Producto createProducto(Producto producto) throws DuplicateException, GenericException;

	public Producto updateProducto(Producto producto) throws GenericException;

	public Producto deleteProducto(String codigoProducto) throws GenericException;
}