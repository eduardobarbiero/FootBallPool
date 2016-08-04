package com.catolicasc.footballpool;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ActionSelecao implements Action {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	System.out.println("ANIMALLLLLL");
        ClientSoapConnect client = new ClientSoapConnect();
        
		request.setAttribute("teams", client.getTeams());        
        
        return "/WEB-INF/Team/selecao-list.jsp";
        
   }
    
}