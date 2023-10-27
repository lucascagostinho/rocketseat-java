package pessoa;

public class TesteDePessoa {
    public static void main(String[] args) {
        //Causa nullPointer(Erro no Java)
        //Pessoa pessoa00 = null

        //Forma de instanciar
        //Pessoa pessoa0;
        //pessoa0 = new Pessoa();

        Pessoa pessoa1 = new Pessoa();
        pessoa1.cpf = "45785665115";
        pessoa1.nome = "Lucas";
        pessoa1.idade = 33;

        System.out.println(pessoa1.nome);
        System.out.println(pessoa1.imprimirDadosDapessoa(1));

        Pessoa pessoa2 = new Pessoa();
        pessoa2.cpf = "45624846214";
        pessoa2.nome = "Maria";
        pessoa2.idade = 19;

        System.out.println(pessoa2.nome);
        System.out.println(pessoa2.imprimirDadosDapessoa(2));
    }
}
