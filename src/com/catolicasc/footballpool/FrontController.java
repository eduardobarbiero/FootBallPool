package com.catolicasc.footballpool;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/team")
public class FrontController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
            
            Action action = ActionFactory.getAction(request, "ActionPaginaInicial");
            
            try {
                String view = action.execute(request, response);
                request.getRequestDispatcher(view).forward(request, response);
            } catch (ServletException | IOException e) {
                throw new ServletException("Falha na execução da action.", e);
            } catch (Exception ex) {
                //Logger.getLogger(FrontController.class.getName()).log(Level.SEVERE, null, ex);
            }		
	}
}
