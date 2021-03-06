package br.uff.ic.dac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculadoraServlet
 */
@WebServlet("/CalculadoraServlet")
public class CalculadoraServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CalculadoraServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// define o tipo de resposta enviada para o cliente
		response.setContentType("text/html");

		// recupera os valores do JSP
		double primeiroValue = Double.parseDouble(request.getParameter("primeiroValue"));
		double segundoValue = Double.parseDouble(request.getParameter("segundoValue"));
		String operacao = request.getParameter("operacao");

		double resultado;

		// realiza as opera��es da calculadora
		if (operacao.equals("+")) {
			resultado = primeiroValue + segundoValue;
		} else if (operacao.equals("-")) {
			resultado = primeiroValue - segundoValue;
		} else if (operacao.equals("x")) {
			resultado = primeiroValue * segundoValue;
		} else {
			resultado = primeiroValue / segundoValue;
		}

		// inicializa o contador de visitas
		int contador = 1;

		// atualiza o contador de visitas de acordo com os cookies lidos
		Cookie cookies[] = request.getCookies();
		if (cookies != null)

			for (int i = 0; i < cookies.length; i++) {
				if (cookies[i].getName().equals("contador")) {
					contador = Integer.parseInt(cookies[i].getValue()) + 1;
				}
			}

		// cria um novo objeto Cookie com o valor final de 'contador'
		Cookie cookieResult = new Cookie("contador", String.valueOf(contador));

		// add o cooki ao header HTTP
		response.addCookie(cookieResult);

		// define as vari�veis (e valores) que ser�o exibidos no JSP
		request.setAttribute("resultado", resultado);
		request.setAttribute("contador", contador);

		// envia as resources para o jsp
		request.getRequestDispatcher("./Resultado.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
