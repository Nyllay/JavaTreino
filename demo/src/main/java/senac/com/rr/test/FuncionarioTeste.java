package senac.com.rr.test;

import senac.com.rr.Funcionario;

public class FuncionarioTeste{
    private static int contadorGetNome = 0;
   private static int contadorGetSalario = 0;

public static void main(String[] args) {
        System.out.println("TESTE DA CLASSE FUNCIONARIO");

        Funcionario funcionarioFake = new Funcionario(
            "Nyllay",
            17, 
            "nnullo@gmai.com", 
            "sla", 
            "março", 
            "12/34/5667", 
            "12345678", 
            "Amarelo", 
            "12343", 
            10000.00, 
            "Pika Blaster", 
            "MINI");


        Funcionario funcionarioSpy = criarSpy(funcionarioFake);

        assertEquals("Nyllay", funcionarioFake.getNome(), "nome");
        assertEquals(10000.00, funcionarioFake.getSalario(), "salario");
       funcionarioSpy.getNome();
        funcionarioSpy.getSalario();
    }

    private static Funcionario criarSpy(Funcionario original){
        return new Funcionario(
                original.getNome(), original.getIdade(), original.getEmail(), original.getTelefone(),
                original.getEndereco(), original.getNascimento(), original.getCpf(), original.getcorDosOlhos(),
                original.getMatricula(), original.getSalario(), original.getCargo(), original.getSetor()
            ){

                @Override
                public String getNome(){
                    contadorGetNome++;
                    System.out.println("getNome foi chamado " + contadorGetNome + " vezes");
                    return super.getNome();
                }
                @Override
                public Double getSalario(){
                    contadorGetSalario++;
                    System.out.println("getSalario foi chamado " + contadorGetSalario + " vezes");
                   
                    
                    int soma = contadorGetNome + contadorGetSalario;
                    System.out.println( "o total é de: " +soma ); 
                    return super.getSalario();
                }
            };
    }
     //Metodo para testar String
    public static void assertEquals(String esperado, String valorObitido, String campo){
        if(esperado.equals(valorObitido)){
            System.out.println("Passou no Teste de String");
        } else {
            System.out.println("Não passou no teste");
        }
    }


    public static void assertEquals(Double esperado, Double valorObitido, String campo){
        if(Math.abs(esperado - valorObitido) > 0.0001 ){
            System.out.println("Não passou no teste");
        } else {
            System.out.println("Passou no teste");
        }
}
}