package ar.com.educacionit.web.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.educacionit.app.domain.Producto;
import ar.com.educacionit.services.ProductoService;
import ar.com.educacionit.services.exceptions.ServiceException;
import ar.com.educacionit.services.impl.ProductoServiceImpl;

@WebServlet(name = "HomeServlet", urlPatterns = "/api/home")
public class HomeServlet extends HttpServlet {

	private static final long serialVersionUID = 3429274211443195913L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Works!!");

		ProductoService productoService = new ProductoServiceImpl();

		// Query to DB to get a product
		List<Producto> productos;

		try {
			productos = productoService.findProductos();
		} catch (ServiceException e) {
			throw new ServletException(e);
		}

		// Save in session the data to show them
		req.getSession().setAttribute("productos", productos);

		// Redirect to productos.jsp
		getServletContext().getRequestDispatcher("/productos.jsp").forward(req, resp);

	}
}