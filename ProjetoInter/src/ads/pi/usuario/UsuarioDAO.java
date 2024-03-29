package ads.pi.usuario;

import ads.pi.util.HibernateUtil;

import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Marlon Santana dos S
 */
public class UsuarioDAO {

    private Session sessao;
    private Transaction transacao;

    public void salvarUsuario(Usuario usuario) {
      sessao = HibernateUtil.
                getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        if(usuario.getId() == 0){
            sessao.save(usuario);
            JOptionPane.showMessageDialog(null, "Usuário Cadastrado!");
        }else{
            sessao.update(usuario);
            JOptionPane.showMessageDialog(null, "Usuário Editado!");
        }
        transacao.commit();
        sessao.close();
    

    }

    /*sobrecarga utilizada para pesquisa de id*/
    public void Pesquisa(int id) {
        sessao = HibernateUtil.
                getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        Usuario usuario = (Usuario) sessao.
                createCriteria(Usuario.class).add(
                        Restrictions.eq("Id", id))
                .uniqueResult();
    }
    /*sobrecarga utilizada para identificar o login e senha*/

    public Usuario Pesquisa(String login, String senha) {
        sessao = HibernateUtil.
                getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        Usuario usuario = (Usuario) sessao.
                createCriteria(Usuario.class).add(
                        Restrictions.eq("usuario", login)).add(
                        Restrictions.eq("senha", senha))
                .uniqueResult();
        return usuario;

    }

    /*comando utilizado para lista do banco de dados*/
    public List<Usuario> Pesquisa() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        List<Usuario> usuarios = sessao.
                createCriteria(Usuario.class).list();
        return usuarios;
    }

 }
//(marlon, 24/11, 10:40am) transaction estava sendo importado da biblioteca errada
