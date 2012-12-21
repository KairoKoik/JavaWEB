package i377.conf;

import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.*;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages={"i377"})
@ImportResource("/WEB-INF/security-context.xml")
public class DispatcherConfig extends WebMvcConfigurerAdapter{
	
	@Bean
	public InternalResourceViewResolver jspResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setViewClass(JstlView.class);
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
}
