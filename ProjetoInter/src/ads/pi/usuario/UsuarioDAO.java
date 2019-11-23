package ads.pi.usuario;

import ads.pi.util.HibernateUtil;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;
import org.hibernate.Session;

/**
 *
 * @author Marlon Santana dos S
 */
public class UsuarioDAO {

    private Session sessao;
    private Transaction transacao;
    
    public void salvar(Usuario usuario)
            throws RollbackException, HeuristicRollbackException, 
            HeuristicMixedException, SecurityException, SystemException{
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = (Transaction) sessao.beginTransaction();
        
        sessao.save(usuario);
        
        transacao.commit();
        sessao.close();
    }
}
