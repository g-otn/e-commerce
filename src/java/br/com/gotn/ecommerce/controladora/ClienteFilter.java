package br.com.gotn.ecommerce.controladora;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(filterName = "ClienteFilter", urlPatterns = {"/cliente/*", "/cliente"}, servletNames = {"ClienteServlet"})
public class ClienteFilter implements Filter {
    
    public void init(FilterConfig filterConfig) {
    }

    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        // Verificar se logado, se não, redirecionar ao login
        // Filtrar tipo de usuário logado, se admin, redirecionar a listagem de clientes
    }
    
    public void destroy() {    
    }
    
}
