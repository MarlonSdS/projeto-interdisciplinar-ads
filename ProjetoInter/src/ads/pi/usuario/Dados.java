
package ads.pi.usuario;

/**
 *
 * @author LABORATORIO 01
 */
public class Dados {
    
    
    public String nome;
    public String user;
    public String senha;
    public String idade;
    public String email;
    public double peso;
    public double altura;
    public boolean sexo;
    public double imc;
    public int nivel;
    
    public void calcIMC(double peso, double altura){
        imc = peso / (altura * altura);
        
        if(imc < 16){
            nivel = 0;
        }else if(imc >= 16 && imc < 22){
            nivel = 1;
        }else if(imc >= 22 && imc < 28){
            nivel = 2;
        }else if(imc >= 28 && imc < 34){
            nivel = 3;
        }else if(imc >= 34 && imc < 40){
            nivel = 4;
        }else{
            nivel = 5;
        }
    }
}
