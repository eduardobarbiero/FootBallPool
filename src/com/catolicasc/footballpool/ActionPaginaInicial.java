package com.catolicasc.footballpool;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ActionPaginaInicial implements Action {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {        
        ClientSoapConnect client = new ClientSoapConnect();
        
		request.setAttribute("teams", client.getTeams());        
        
        return "/WEB-INF/Team/team-list.jsp";
        
   }
    
}