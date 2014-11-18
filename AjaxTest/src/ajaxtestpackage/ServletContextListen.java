package ajaxtestpackage;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
/**
 * Application Lifecycle Listener implementation class ServletContextListen
 *
 */
@WebListener
public class ServletContextListen implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public ServletContextListen() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0) {
        // TODO Auto-generated method stub
    	
    	AccountManager accountManager = new AccountManager();
    	ServletContext sc = arg0.getServletContext();
    	sc.setAttribute("accountManager", accountManager);
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0) {
        // TODO Auto-generated method stub
    }
	
}
