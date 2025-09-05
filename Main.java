package senac.rr.com;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoah = new Pessoa();

        pessoah.nome = "Nyllay";
        pessoah.idade = 18;
       pessoah.setCpf("089.122.255.75");

       System.out.println(pessoah.getNome());
       System.out.println(pessoah.getIdade());
       System.out.println(pessoah.getCpf());
    }
}