public class TiposVariaveis {
    public static void main(String[] args){
        int salarioMinimo = 2500; // Na linguagem java a virgula é representada pelo "." pois o java se baseia no valor americano   
        double numeroExemplo = 2.500; //Observe que o número não vai contar os zeros depois do 5 pois ele é considerado um decimal assim ignorando os zeros
        
        System.out.println("\n" + salarioMinimo);
        System.out.println(numeroExemplo + "\n");
        
        int numero = 3;
        numero = 10;
        final double VALOR_DE_PI = 3.14;
        // Perceba que o valor da variavel numero mudou, já o de PI não mudou pois adicionando "final" antes do tipo da variavel indica ao java que ela é uma constante
        System.out.println(numero);
        System.out.println(VALOR_DE_PI);
    }
}
