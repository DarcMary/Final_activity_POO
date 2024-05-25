public class Regular extends Aluno {
    public Regular(String cpf, String nome, int idade, int matricula) {
        super(cpf, nome, idade, matricula);
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(getNome() + " pagando mensalidade integralmente");
    }
}
