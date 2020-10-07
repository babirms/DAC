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
 * Servlet implementation class EditarEventoServlet
 */
@WebServlet("/EditarEventoServlet")
public class EditarEventoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditarEventoServlet() {

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
		
		// recupera o evento
		evento = dao.buscaEventoPorId(Integer.parseInt(request.getParameter("idEventoEditar")));

		evento.setNome(request.getParameter("nome"));
		evento.setSigla(request.getParameter("sigla"));
		evento.setInstituicaoOrganizadora(request.getParameter("instOrg"));
		evento.setAreaConcentracao(request.getParameter("areaConcentracao"));
		System.out.println(evento.getNome());

		dao.merge(evento);

		int id = evento.getEventoId();

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
