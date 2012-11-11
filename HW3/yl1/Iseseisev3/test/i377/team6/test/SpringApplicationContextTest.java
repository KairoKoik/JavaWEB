package i377.team6.test;

import i377.team6.yl1.IncidentSimulatorServiceImpl;

import org.junit.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplicationContextTest {

	private ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
	
	@Test
	public void test() {
		IncidentSimulatorServiceImpl bean = ctx.getBean(IncidentSimulatorServiceImpl.class);
		System.out.println(bean.getUnresolvedIncidents().get(0));
		
		Assert.assertNotNull(bean);
	}

}
