
package javahash;

public class Pessoa {
    private String nome;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pessoa outraAtividade = (Pessoa) o;

        return this.getCpf() != null ? this.getCpf().equals(outraAtividade.getCpf()) : outraAtividade.getCpf() == null;
    }
    
    @Override
    public int hashCode() {
        return this.getCpf() != null ? this.getCpf().hashCode() : 0;
    }

    
     @Override
    public String toString(){
        return getNome() + " : - " + getCpf();
    }// fim toString
    
}
