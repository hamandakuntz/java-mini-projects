public class App {
    public static void main(String[] args) throws Exception {
        int numero = 2;
        int i = 0;
        System.out.println("Tabela de multiplicação do" + " " + numero);

        for (i = 0; i < 11; i++) {
            System.out.println(numero + "x" + i + "=" + numero * i);
        }
    }
}
