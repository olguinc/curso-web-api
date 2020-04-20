package ar.com.educacionit.web.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.engine.query.spi.sql.NativeSQLQueryCollectionReturn;
import org.hibernate.query.Query;

import ar.com.educacionit.app.domain.Producto;

@WebServlet(name = "HomeServlet", urlPatterns = "/api/home")
public class HomeServlet extends HttpServlet {

	private static final long serialVersionUID = 3429274211443195913L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Works!!");

		// Query to DB to get a product
		List<Producto> productos = findProductos();

		// Save in session the data to show them
		req.getSession().setAttribute("productos", productos);

		// Redirect to productos.jsp
		getServletContext().getRequestDispatcher("/productos.jsp").forward(req, resp);
	}

	public List<Producto> findProductos() {

		List<Producto> lista = new ArrayList<Producto>();

		Producto producto = new Producto();

		producto.setCodigo("abc");
		producto.setId(1L);
		producto.setDescripcion("Pen Driver");
		producto.setPrecio(175d);
		lista.add(producto);

		return lista;

//		SessionFactory factory = HibernateUtils.getSessionFactory();

//		Session session = factory.getCurrentSession();

//		List<Producto> products = new ArrayList<Producto>();

//		try {
		// All the action with DB via Hibernate
		// must be located in one transaction.
		// Start Transaction
//			session.getTransaction().begin();

		// Create an HQL statement, query the object.
//			String sql = "Select e from " + Producto.class.getName() + " e ";

		// Create Query object
//			Query<Producto> query = session.createQuery(sql);

		// Execute query.
//			products = query.getResultList();

		// Commit data. session.getTransaction().commit();

//		} catch (Exception e) {
//
//			e.printStackTrace();
		// Rollback in case of an error occurred
//			session.getTransaction().rollback();
//		} finally {
//			session.close();
		// session.createQuery("");
//		}
//		return products;

	}
}
