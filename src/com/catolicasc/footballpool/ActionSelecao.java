package com.catolicasc.footballpool;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import eu.dataaccess.footballpool.TFullTeamInfo;
import eu.dataaccess.footballpool.TTeamInfo;
import eu.dataaccess.footballpool.TTopGoalScorer;

public class ActionSelecao implements Action {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	System.out.println("ANIMALLLLLL");
        ClientSoapConnect client = new ClientSoapConnect();
        TFullTeamInfo team_info = client.getTeamsInfo(request.getParameter("pais"));
		request.setAttribute("teams", team_info);			
		List<TTopGoalScorer> tg = new ArrayList<>(); 
		for (TTopGoalScorer tTopGoalScorer : client.getTopGolScorrer()) {
			if(tTopGoalScorer.getSFlag().equals(team_info.getSCountryFlag()))				
				tg.add(tTopGoalScorer);			
		}
		request.setAttribute("top_goals", tg);
        
        return "/WEB-INF/Team/selecao-list.jsp";
        
   }
    
}