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
public class updateGuard extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private EntityManagerFactory emf =
			Persistence.createEntityManagerFactory("Iseseisev2");
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateGuard() {
    }

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		emf.close();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("id") == null)
			return;
		
		ServletOutputStream out = response.getOutputStream();
		EntityManager em = emf.createEntityManager();
		
		int id = 0, age = 0;
		try {
			id = Integer.parseInt(request.getParameter("id"));
			out.println("ID " + id);
			
			Guard guard = em.find(Guard.class, id);
			
			out.println("<br />From DB <br />");
			out.print("Name " + guard.getName()+ "<br />Age " + guard.getAge() + "<br/>");
			out.println("Updates: <br />");

			if (request.getParameter("age") != null) {
				age = Integer.parseInt(request.getParameter("age"));
				guard.setAge(age); // new age
				out.println("age " + guard.getAge());
			}
			if (request.getParameter("name") != null) {
				guard.setName(request.getParameter("name")); // new name
				out.println("name " + guard.getName());
			}
			
			em.getTransaction().begin();
			em.persist(guard);
			em.getTransaction().commit();	
		} 
		finally {
			em.close();
		}
	}
}
