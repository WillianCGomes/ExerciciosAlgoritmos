package br.com.foursys.locadora.util;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * Classe responsável por efetuar a conexão com o banco de dados
 * @author Willian Carlos Gomes
 * @since 27/04/2021
 * @version 1.0
 */
@SuppressWarnings("deprecation")
public class HibernateUtil {
    
    //atributo para armazenar a seção de comunicação
    private static final SessionFactory sessionFactory = buildSessionFactory();
    
    /*
    * método para criar uma seção de conexão com o banco de dados
    */
    private static SessionFactory buildSessionFactory() {
        return new AnnotationConfiguration().configure().buildSessionFactory();
    }
    //método para acessar o atributo de conexão e seção com o banco de dadso
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    
}
