package ads.pi.usuario;

import ads.pi.util.HibernateUtil;
import java.io.Serializable;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Marlon Santana dos S
 */
public class UsuarioDAO {

    private Session sessao;
    private Transaction transacao;
    
    Usuario usuario = new Usuario();
    
    public void salvar(Usuario usuario){
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        
        sessao.save(null, usuario);
        
        transacao.commit();
        sessao.close();
    }
}
//(marlon, 24/11, 10:40am) transaction estava sendo importado da biblioteca errada
