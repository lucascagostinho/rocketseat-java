package pessoa;

public class TesteDePessoa {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.setCpf("45785665115");
        professor.setNome("Lucas");
        professor.setIdade(33);
        professor.setSalario(6000);
        System.out.println(professor.imprimirDadosDapessoa());

        Aluno aluno = new Aluno();
        aluno.setCpf("021568465214");
        aluno.setNome("teste");
        aluno.setIdade(25);
        aluno.setMatricula("156798165");
        System.out.println(aluno.imprimirDadosDapessoa());
    }
}
