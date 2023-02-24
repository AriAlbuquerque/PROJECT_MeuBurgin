public class Cliente {

    private String nome;
    private String endereco;
    private String telefone, CPF;

    public Cliente (String nome, String endereco, int telefone){https://github.com/AriAlbuquerque/PROJECT_MeuBurgin.git

        this.nome = nome;
        this.endereco = endereco;
        this.telefone = String.valueOf(telefone);
        this.CPF = CPF;

    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public void setCPF(String CPF){
        this.CPF = CPF;
    }

    public String getNome(){
        return nome;
    }

    public String getEndereco(){
        return endereco;
    }

    public String getTelefone(){
        return telefone;
    }
    public String getCPF(){
        return CPF;
    }

    public String toString(){
        return (this.nome+"\n" + this.endereco + "\n" + this.telefone+ "\n" + this.CPF+"\n");
    }
}

