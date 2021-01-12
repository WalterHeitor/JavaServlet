package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MostraEmpresaServlet
 */
@WebServlet("/mostraEmpresa")
public class MostraEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String parameId = request.getParameter("id");
		Integer id = Integer.valueOf(parameId);
		
		Banco banco = new Banco();
		Empresa empresa = banco.buscaEmpresaPorId(id);
		System.out.println(empresa.getNome());
		request.setAttribute("empresa", empresa);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/formAlteraEmpresa.jsp");
		dispatcher.forward(request, response);
	}

}
