package senac.rr.com;

public class Pessoa {
    public String nome;
    public int idade;
    private String cpf;
    
    public String getNome(){
        System.out.println("\nSeu nome é \n" + this.nome);
        return this.nome;
    }

    public int getIdade(){
        System.out.println("e a sua idade é \n" +this.idade );
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        System.out.println("e o seu CPF é esse \n" +this.cpf);
        return this.cpf;
    }
    public void Andar(){
        System.out.println("\nÓ "+nome+" começa a andar" );
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(1500);
                System.out.print("tac ");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 

    }
    public void Falar(){
        System.out.println("e em seguida o "+nome+" começa a  falar");

        try {
            String fala = "Eu quero dormir";
            for (char letra : fala.toCharArray()) {
                System.out.print(letra);
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
