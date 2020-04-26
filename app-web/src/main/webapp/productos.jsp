<%@page import="ar.com.educacionit.app.domain.Producto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<title>Products List</title>
</head>
<body>
	<div class="container">
		<h1>Products List</h1>
		<div class="row">
			<div class="col-12">
				<form action="<%=request.getContextPath()%>/logout">
					<button type="submit" class="btn btn-info">Logout</button>
				</form>
			</div>
		</div>
		<div class="row">
			<div class="col-12">
				<table class="table">
					<thead>
						<tr>
							<th scope="col">ID</th>
							<th scope="col">CODE</th>
							<th scope="col">NAME</th>
							<th scope="col">PRICE</th>
						</tr>
					</thead>
					<%
						List<Producto> productos = (List<Producto>) session.getAttribute("productos");
					%>
					<%
						for (Producto producto : productos) {
					%>
					<tr>
						<th scope="row"><%=producto.getId()%>
						</td>
						<td><%=producto.getCodigo()%></td>
						<td><%=producto.getDescripcion()%></td>
						<td><%=producto.getPrecio()%></td>
					</tr>
					<%
						}
					%>
				</table>
			</div>
		</div>
		<div class="row">
			<div class="col-12">
				<form action="<%=request.getContextPath()%>">
					<button type="submit" class="btn btn-primary">Back</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>