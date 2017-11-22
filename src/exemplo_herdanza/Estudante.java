/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo_herdanza;

/**
 *
 * @author oracle
 */
public class Estudante extends Persoa {
    private String codigo;
    private int notafinal;
   
    public Estudante(String nome, String apelido, int idade,String codigo,int nota) {
        super(nome, apelido, idade);//esta debe ser sempre a mesma sentenza
      this.codigo= codigo;
        notafinal= nota;
    }
    

    public String getCodigo() {
        return codigo;
    }

    public int getNotafinal() {
        return notafinal;
    }
    public void amosar(){
        System.out.println(" nome: "+getNome()+" un apelido: "+apelido+" edade "+getIdade()+" codigo: "+codigo+"notafinal "+notafinal);
    }

    
    @Override
    public String toString() {
        return "Estudante{" + "codigo=" + codigo + ", notafinal=" + notafinal + super.toString()+'}';
    }
    
}
//clase Estudante está herdando de Persoa