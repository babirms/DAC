package br.uff.ic.dac.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.uff.ic.dac.dao.EventoDAO;
import br.uff.ic.dac.entity.EventoEntity;

/**
 * Servlet implementation class RemoverEventoServlet
 */
@WebServlet("/RemoverEventoServlet")
public class RemoverEventoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RemoverEventoServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");

		EventoDAO dao = new EventoDAO();

		String resposta = dao.excluiEvento(Integer.parseInt(request.getParameter("idEventoRemover")));

		ServletContext servcontext = request.getServletContext();

		if (resposta.equals("Evento removido com sucesso.")) {
			RequestDispatcher dispatcher = servcontext.getRequestDispatcher("/OperacaoSucesso.jsp");
			dispatcher.include(request, response);
		} else {
			RequestDispatcher dispatcher = servcontext.getRequestDispatcher("/OperacaoErro.jsp");
			dispatcher.include(request, response);
		}
	}

}
