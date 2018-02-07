package com.projecta.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.projecta.models.Owner;

/**
 * Servlet implementation class LoadServlet
 */
@WebServlet("/LoadServlet")
public class LoadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoadServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		List<Owner> owners = new ArrayList<Owner>();
		String json = null;
		Gson gson = new Gson();

		Owner owner1 = new Owner();
		owner1.setOwnerName("Giftson Jebasingh");
		owner1.setEmail("giftsonp@gmail.com");

		Owner owner2 = new Owner();
		owner2.setOwnerName("Ponmani Tamilselvan");
		owner2.setEmail("ponmanihere@gmail.com");

		Owner owner3 = new Owner();
		owner3.setOwnerName("Vincent Praveen");
		owner3.setEmail("vincent26jecs004@gmail.com");

		Owner owner4 = new Owner();
		owner4.setOwnerName("Ivan Fredrick");
		owner4.setEmail("frederick.ivan77@gmail.com");

		Owner owner5 = new Owner();
		owner5.setOwnerName("Ganesh Kumar");
		owner5.setEmail("ganesh1127@gmail.com");

		owners.add(owner1);
		owners.add(owner2);
		owners.add(owner3);
		owners.add(owner4);
		owners.add(owner5);

		json = gson.toJson(owners);
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");

		response.getWriter().write(json);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
