import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Disciplina matematica = new Disciplina("MAT-1", "Matemática", 1);
        Disciplina poo = new Disciplina("POO-97", "Programação Orientada a Objetos", 1);
        Disciplina logicaDeProgramacao = new Disciplina("LP1-23", "Lógica de Programação", 1);

        Aluno aluno1 = new Regular("111.111.111-11", "Alice", 20, 1001);
        Aluno aluno2 = new Regular("222.222.222-22", "Bob", 21, 1002);
        Aluno aluno3 = new Bolsista("333.333.333-33", "Carlos", 22, 1003);

        Professor professor = new Professor("444.444.444-44", "Prof. Silva", 45, "Departamento de Computação");

        Visitante visitante1 = new Visitante("555.555.555-55", "Visitante A", 30);
        Visitante visitante2 = new Visitante("666.666.666-66", "Visitante B", 35);

        Turma turma1 = new Turma("TURMA1", matematica, professor);
        Turma turma2 = new Turma("TURMA2", poo, professor);
        Turma turma3 = new Turma("TURMA3", logicaDeProgramacao, professor);

        turma1.adicionarAluno(aluno1);
        turma1.adicionarAluno(aluno2);
        turma1.adicionarAluno(aluno3);

        turma2.adicionarAluno(aluno1);
        turma2.adicionarAluno(aluno2);
        turma2.adicionarAluno(aluno3);

        turma3.adicionarAluno(aluno1);
        turma3.adicionarAluno(aluno2);
        turma3.adicionarAluno(aluno3);

        imprimirInformacoesTurma(turma1);
        imprimirInformacoesTurma(turma2);
        imprimirInformacoesTurma(turma3);
    }

    public static void imprimirInformacoesTurma(Turma turma) {
        System.out.println("Código da Turma: " + turma.getCodigo());
        System.out.println("Disciplina: " + turma.getDisciplina().getNome());
        System.out.println("Professor: " + turma.getProfessor().getNome());
        System.out.println("Alunos:");
        for (Aluno aluno : turma.getAlunos()) {
            System.out.println(" - " + aluno.getNome());
        }
        System.out.println();
    }
}
