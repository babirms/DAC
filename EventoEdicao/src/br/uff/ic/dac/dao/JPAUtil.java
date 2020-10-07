package br.uff.ic.dac.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	 private static EntityManagerFactory emUtil;

	    public static EntityManager getEM(){
	        if (emUtil == null) {
	        	emUtil = Persistence.createEntityManagerFactory("Eventos-PU");
	        }
	        return emUtil.createEntityManager();        
	    }
	    
	    public static void fechaEmf(){
	    	emUtil.close();
	    }
	    
	

}
