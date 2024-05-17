public class ExemploFor {
    public static void main(String[] args) {
        // for (int carneirinhos = 1; carneirinhos <=20; carneirinhos ++ ){
        //     System.out.println("contando carneirinhos:" + carneirinhos);
        // }
        // System.out.println("Joãozinho dormiu");

        //exemplo de For

        // String alunos[] = {"Gean", "felipe", "Marcelo", "Julio"};
        // for (int x = 0; x < alunos.length; x++){
        //     System.out.println("o aluno no indice x=" + x + " é " + alunos[x]);

            //outro exemplo de For
        String alunos[] = {"Gean", "felipe", "Marcelo", "Julio"};
            for (String aluno: alunos) {
                System.out.println("Nome do aluno é:" + aluno);
            }

        }   
        
    }
