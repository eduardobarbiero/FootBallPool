package com.catolicasc.footballpool;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import eu.dataaccess.footballpool.InfoLocator;
import eu.dataaccess.footballpool.InfoSoapType;
import eu.dataaccess.footballpool.TGameInfo;
import eu.dataaccess.footballpool.TTeamInfo;

public class ClientSoapConnect {
	
	private InfoLocator theInfo = null;
	private InfoSoapType infoType = null;
	
	public ClientSoapConnect(){
		try {
			theInfo = new InfoLocator();
			infoType = theInfo.getInfoSoap();	 		
		} catch(ServiceException se){
			System.out.println(se);
		}
	}

	public TGameInfo[] getGames(){
		TGameInfo games[] = null;
		try{
			games = infoType.allGames();	
		} catch(RemoteException re){
			
		}	
		return games;		
	}
	
	public TTeamInfo[] getTeams(){
		TTeamInfo teams[] = null;
		try{
			teams = infoType.teams();	
		} catch(RemoteException re){
			
		}	
		return teams;		
	}

}
