
package exemplo_herdanza;

public class Persoa {
    private String nome;
    public String apelido;
    private int idade;
    public Persoa(String nome, String apelido, int idade){
    this.nome=nome;
this.apelido=apelido;
        this.idade=idade;
    }

    public String getNome() {
        return nome;
    }

    public String getApelido() {
        return apelido;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Persoa{" + "nome=" + nome + ", apelido=" + apelido + ", idade=" + idade + '}';
    }
    
            

            }