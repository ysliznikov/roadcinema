package yuriuss.spring.studying.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@EnableWebMvc //<mvc:annotation-driven /> from spring-web-config.xml
@Configuration
@ComponentScan( {"yuriuss.spring.studying.controllers"} ) // <context:component-scan base-package="yuriuss.spring.studying.controllers" /> from spring-web-config.xml
public class SpringWebConfig extends WebMvcConfigurerAdapter {
    private static final Logger logger = LoggerFactory.getLogger(SpringWebConfig.class);
    static { logger.info("--- SpringWebConfig loaded ---"); }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        logger.info("*** Add resource handlers ***");
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }

    @Bean
    public InternalResourceViewResolver viewResolver() {
        logger.info("*** View resolver activated ***");
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/views/jsp/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }


}
