package i377.team6.yl3.servlet;

import i377.team6.yl3.entities.Guard;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class updateGuard
 */
@WebServlet("/updateGuard")
public class generateGuards extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private EntityManagerFactory emf = Persistence
			.createEntityManagerFactory("Iseseisev2");

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public generateGuards() {
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		emf.close();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("count") == null)
			return;

		ServletOutputStream out = response.getOutputStream();
		EntityManager em = emf.createEntityManager();

		 int id = 0, count = 0;
		   try {
		      count = Integer.parseInt(request.getParameter("count"));        em.getTransaction().begin();
		        for(int i=1; i<count; i++){
			        
		        	Guard guard = new Guard();
			       
		        	guard.setId(i); // new id
			        guard.setName("Valvur" + i); // new name
			        guard.setAge((int) Math.random()* 100); // new age
			       
			        em.persist(guard);        
		        }
		        em.getTransaction().commit(); 
		        em.find(Guard.class, 6);
		  }  
			finally {
			      em.close();    
			}
		}
}
