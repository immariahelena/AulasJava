public class Array {
    public static void main(String[] args) {
        int[] numeros = {1, 5, 2, 8, 3, 7, 4, 9, 0, 6,11};
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 8) {
                System.out.println("Valor maior que 8 encontrado: " + numeros[i]);
            }
        }
    }
}