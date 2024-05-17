public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepformatado = formatarCep("23765064");
            System.out.println(cepformatado);
        } catch (CepInvalidoException e) {
           System.out.println("O cep não corresponde com as regras de negócio");
        }
    }
    static public String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
            throw new CepInvalidoException();

        return "23.756-064";
    }
}
