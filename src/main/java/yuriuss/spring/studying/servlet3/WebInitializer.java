package yuriuss.spring.studying.servlet3;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import yuriuss.spring.studying.config.SpringRootConfig;
import yuriuss.spring.studying.config.SpringWebConfig;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * Replace web.xml
 */
public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { SpringRootConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { SpringWebConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        logger.info("!!! On Startup Web Initializer !!!");
        super.onStartup(servletContext);
    }
}
