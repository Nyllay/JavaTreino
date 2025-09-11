package senac.com.rr;

public class Funcionario extends Pessoa {
    private String matricula;
    private double salario;
    private String cargo;
    private String setor;

    public Funcionario(
        String nome,
        int idade,
        String email,
        String telefone,
        String endereco,
        String nascimento,
        String cpf,
        String corDosOlhos,
        String matricula,
        double salario,
        String cargo,
        String setor
    ) {
        super(nome, idade, email, telefone, endereco, nascimento, cpf, corDosOlhos);
        this.matricula = matricula;
        this.salario = salario;
        this.cargo = cargo;
        this.setor = setor;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }

    public String getSetor() {
        return setor;
    }
}
