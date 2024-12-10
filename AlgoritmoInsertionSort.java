import java.util.Scanner;

/*
Grupo 2: Adrizia Silva da Paixao, Fabricio John Sullivan, Jaqueline Sobral
Algoritmo escolhido:  InsertionSort
dia: 10/12/2024
*/
public class AlgoritmoInsertionSort{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pergunta ao usuário quantos nomes ele quer ordenar
        System.out.print("Informe a quantidade de nomes: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); // limpa o scaner

        // Cria um array para armazenar os nomes
        String[] nomes = new String[quantidade];
        System.out.println("Digite os nomes, um por linha:");
        for (int i = 0; i < quantidade; i++) {
            nomes[i] = scanner.nextLine();
        }

        // Ordena os nomes usando o algoritmo Insertion Sort
        for (int i = 1; i < nomes.length; i++) {
            String atual = nomes[i];
            int j = i - 1;

            // Move os nomes maiores para frente
            while (j >= 0 && nomes[j].compareTo(atual) > 0) {
                nomes[j + 1] = nomes[j];
                j--;
            }
            nomes[j + 1] = atual;
        }
        // Ordena os nomes
        ordenarNomes(nomes);

        // Exibe os nomes ordenados
        System.out.println("Nomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.print(nome + " ");
        }
    }

    static void ordenarNomes(String[] nomes) {
    }

}

