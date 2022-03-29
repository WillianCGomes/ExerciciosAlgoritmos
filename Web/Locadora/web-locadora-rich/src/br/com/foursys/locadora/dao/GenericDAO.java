package br.com.foursys.locadora.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import br.com.foursys.locadora.util.HibernateUtil;

/**
 * Classe responsavel por armazenar os metodos genericos de incluir, alterar e
 * excluir
 * @author Willian Carlos Gomes
 * @since 27/04/2021
 * @version 1.0
 */
public class GenericDAO {

    /*
     * método generico para incluir e alterar um objeto
     */
    public void salvar(Object obj) {
        // classe auxiliar para armazenar uma sessao com o banco de dados
        Session sessao = null;
        //classe auxiliar para efetuar transacoes com o banco de dados
        Transaction transacao = null;

        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();

            // incluindo ou alterando um objeto
            sessao.saveOrUpdate(obj);
            transacao.commit();
        } catch (Exception e) {
            transacao.rollback();
        } finally {
            sessao.close();
        }

    } // fim do método salvar

    /*
    * método genérico para excluir um registro
    */
    public void excluir(Object obj) {
        // classe auxiliar para armazenar uma sessão com o banco de dados
        Session sessao = null;
        //classe auxiliar para efetuar transações com o banco de dados
        Transaction transacao = null;

        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();

            // incluindo ou alterando um objeto
            sessao.delete(obj);
            transacao.commit();
        } catch (Exception e) {
            transacao.rollback();
        } finally {
            sessao.close();
        }
    }
    
}
