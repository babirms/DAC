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
 * Servlet implementation class EventoServlet
 */
@WebServlet("/RegistrarEventoServlet")
public class RegistrarEventoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegistrarEventoServlet() {
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

		EventoEntity evento = new EventoEntity();
		evento.setNome(request.getParameter("nome"));
		evento.setSigla(request.getParameter("sigla"));
		evento.setInstituicaoOrganizadora(request.getParameter("instOrg"));
		evento.setAreaConcentracao(request.getParameter("areaConcentracao"));
		
		dao.salvaEvento(evento);
		
		int id = evento.getEventoId();
		
		request.setAttribute("id", id);
		
		 ServletContext servcontext = request.getServletContext();

	        if (dao.buscaEventoPorId(id) != null) {
	            RequestDispatcher dispatcher = servcontext.getRequestDispatcher("/OperacaoSucesso.jsp");
	            dispatcher.include(request, response);
	        } else {
	            RequestDispatcher dispatcher = servcontext.getRequestDispatcher("/OperacaoErro.jsp");
	            dispatcher.include(request, response);
	        }

	}

}
