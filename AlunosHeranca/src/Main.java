public class Main {
    public static void main(String[]args){

        UniversidadePatopolis universidade = new UniversidadePatopolis();

        Curso fisica = new Curso("Fisica", "Ciências Exatas");
        Curso matematica = new Curso("Matematica", "Ciências Exatas");

        universidade.adicionarAlunoGraduacao(new AlunoGraduacao("Lucas Gouveia", 21, fisica, "TCC do Lucas", 9.8));
        universidade.adicionarAlunoGraduacao(new AlunoGraduacao("Gabriel Silva", 20, matematica,"TCC do Gabriel", 3.65));
        universidade.adicionarAlunoGraduacao(new AlunoGraduacao("Patrick Ferreira", 20, fisica,"TCC do Patrick", 3.99));
        universidade.adicionarAlunoGraduacao(new AlunoGraduacao("Pedro Santos", 22, matematica,"TCC do Pedro", 2.90));
        universidade.adicionarAlunoLacto(new LactoSenso("Luis", 28, fisica, "Monografia de Luis", 3.00));
        universidade.adicionarAlunoLacto(new LactoSenso("Mariana", 26, matematica, "Monografia de Mariana", 7.75));
        universidade.adicionarAlunoStricto(new StrictoSensu("Luisa",32, fisica, "Tese de Luisa", 7.00));
        universidade.adicionarAlunoStricto(new StrictoSensu("Bruna",23, matematica, "Tese de Bruna", 6.00));

        System.out.println("\nTotal de alunos: " + universidade.getTotalAlunos());
        universidade.relatorioAlunosPorCurso();

        System.out.println("\nTotal de alunos reprovados: " + universidade.getTotalReprovados());
        universidade.maiorNotaPorTipo();

        System.out.println("\nAlunos em exame:");
        universidade.alunosEmExame();
    }
}