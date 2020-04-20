package ar.com.educacionit.app.ws.soap.main;

import javax.xml.ws.Endpoint;

import ar.com.educacionit.app.ws.soap.impl.ProductoWSServiceImpl;

public class ProductoWSSoapMain {

	public static void main(String[] args) {

		System.out.println("Publishing WS Soap in 8000 port");

		Endpoint.publish("http://localhost:8000/", new ProductoWSServiceImpl());

		System.out.println("WS ProductoWSService has started in http://localhost:8000/");

		System.out.println("WSDL URL is: http://localhost:8000/?wsdl");
	}
}
