package br.uff.ic.dac.servlets;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.uff.ic.dac.dao.EdicaoDAO;
import br.uff.ic.dac.dao.EventoDAO;
import br.uff.ic.dac.entity.EdicaoEntity;
import br.uff.ic.dac.entity.EventoEntity;

/**
 * Servlet implementation class EdiÁ„oServlet
 */
@WebServlet("/RegistrarEdicaoServlet")
public class RegistrarEdiÁ„oServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegistrarEdiÁ„oServlet() {
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");

		EdicaoDAO dao = new EdicaoDAO();

		EventoDAO eventoDao = new EventoDAO();

		EdicaoEntity edicao = new EdicaoEntity();
		
		edicao.setNumero(Integer.parseInt(request.getParameter("num")));
		edicao.setAno(Integer.parseInt(request.getParameter("ano")));
		edicao.setDataInicio(Long.parseLong(request.getParameter("dataInicio")));
		edicao.setDataFim(Long.parseLong(request.getParameter("dataFinal")));
		edicao.setCidadeSede(request.getParameter("cidade"));
		edicao.setPaisSede(request.getParameter("pais"));
		edicao.setEvento(eventoDao.buscaEventoPorId(Integer.parseInt(request.getParameter("idEvento"))));

		dao.salvaEdicao(edicao);

		int id = edicao.getEdicaoId();

		request.setAttribute("id", id);

		ServletContext servcontext = request.getServletContext();

		if (dao.buscaEdicaoPorId(id) != null) {
			RequestDispatcher dispatcher = servcontext.getRequestDispatcher("/OperacaoSucesso.jsp");
			dispatcher.include(request, response);
		} else {
			RequestDispatcher dispatcher = servcontext.getRequestDispatcher("/OperacaoErro.jsp");
			dispatcher.include(request, response);
		}

	}

}
