package pessoa;

public class Pessoa {
    //nome, idade, cpf
    String nome;
    int idade;
    String cpf;

    //void não retorna nada, apenas executa uma ação
    //void imprimirDadosDaPessoa() {
    //
    //}

    //Retonar algo do tipo String
    //String imprimirDadosDapessoa() {
    //    return "";
    //}

    //Retonar algo do tipo String e pode receber um parametro do tipo inteiro
    String imprimirDadosDapessoa(int indece) {
        return "O nome da pessoa é " + nome + " a idade é " + idade + " e o documento é " + cpf + " O index é " + indece;
    }
}
