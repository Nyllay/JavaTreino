package senac.com.rr;

public class Pessoa {
    public String nome;
    public int idade;
    public String email;
    public String telefone;
    public String endereco;
    public String Nascimento;
     public String corDosOlhos;
    private String cpf;
   

    public Pessoa(
        String nome,
        int idade,
        String email,
        String telefone,
        String endereco,
        String Nascimento,
        String cpf,
        String corDosOlhos
    ){
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.Nascimento = Nascimento;
        this.cpf = cpf;
        this.corDosOlhos = corDosOlhos;
    }

    public String getcorDosOlhos(){
        System.out.println(this.corDosOlhos);
        return this.corDosOlhos;
    }
    public void setcorDosOlhos(String corDosOlhos){
        this.corDosOlhos = corDosOlhos;
    }
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
    public String getEmail(){
        System.out.println(this.email);
        return this.email;
    }
    public void setEmail(String Email){
        this.email = Email;
    }
    public String getTelefone(){
        System.out.println(this.telefone);
        return this.telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public String getEndereco(){
        System.out.println(this.endereco);
        return this.telefone;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
     public String getNascimento(){
        System.out.println(this.Nascimento);
        return this.telefone;
    }
    public void setNascimento(String Nascimento){
        this.Nascimento = Nascimento;
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