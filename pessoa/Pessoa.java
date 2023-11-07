package pessoa;

public class Pessoa {
    //nome, idade, cpf
    private String nome;
    private int idade;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    //void não retorna nada, apenas executa uma ação
    //void imprimirDadosDaPessoa() {
    //
    //}

    //Retonar algo do tipo String
    //String imprimirDadosDapessoa() {
    //    return "";
    //}

    //Retonar algo do tipo String e pode receber um parametro do tipo inteiro
    String imprimirDadosDapessoa() {
        return "O nome da pessoa é " + nome + " a idade é " + idade + " e o documento é " + cpf;
    }
}
