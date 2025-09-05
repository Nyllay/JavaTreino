package senac.rr.com;

public class Pessoa {
    public String nome;
    public int idade;
    private String cpf;
    
    public String getNome(){
        System.out.println("Seu nome é");
        return this.nome;
    }

    public int getIdade(){
        System.out.println("e a sua idade é");
        return this.idade;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    
    }
    public String getCpf(){
        System.out.println("e o seu CPF é esse");
        return this.cpf;
    }

}
