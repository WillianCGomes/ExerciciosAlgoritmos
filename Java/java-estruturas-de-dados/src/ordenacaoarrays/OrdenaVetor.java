package ordenacaoarrays;

/**
 *
 * @author Willian Carlos Gomes
 */
public class OrdenaVetor {

    public void bubbleSort(int vet[]) {
        for (int i = 0; i < vet.length - 1; i++) {
            for (int j = 0; j < vet.length - 1; j++) {
                if (vet[j] > vet[j + 1]) {
                    int aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }
    }

    public void insertionSort(int vet[]) {
        for (int i = 1; i < vet.length; i++) {
            int aux = vet[i];
            int j = i;

            while ((j > 0) && (vet[j - 1] > aux)) {
                vet[j] = vet[j - 1];
                j--;
            }
            vet[j] = aux;
        }
    }

    public void selectionSort(int vet[]) {
        int min, temp;
        for (int i = 0; i < vet.length; i++) {
            min = i;
            for (int j = i + 1; j < vet.length; j++) {
                if (vet[j] < vet[min]) {
                    min = j;
                }
            }
            temp = vet[i];
            vet[i] = vet[min];
            vet[min] = temp;
        }

    }

    public void mostrarVetor(int vet[]) {
        for (int i = 0; i < vet.length; i++) {
            System.out.println(" " + vet[i]);
        }
    }

    public void desordenaVetor(int vet[]) {
        for (int i = 0; i < vet.length; i++) {
            vet[i] = (vet.length - i);
        }
    }

    public static void main(String[] args) {

        OrdenaVetor metodosOrdenacao = new OrdenaVetor();

        int n = 10;
        int vet[] = new int[n];

        for (int i = 0; i < n; i++) {
            vet[i] = (n - i);
        }

        //mostrando vetor desordenado
        System.out.println(" Vetor desordenado:");
        metodosOrdenacao.mostrarVetor(vet);
        System.out.println("\n");


        /*
         * Ordenando e mostrando
         */
        //Ordenando com BubbleSort
        metodosOrdenacao.bubbleSort(vet);
        System.out.println(" Vetor ordenado com Bubble Sort");
        metodosOrdenacao.mostrarVetor(vet);
        System.out.println("\n");
        //desordenando o vetor novamente
        metodosOrdenacao.desordenaVetor(vet);

        //Ordenando com InsertionSort
        metodosOrdenacao.insertionSort(vet);
        System.out.println(" Vetor ordenado com Insertion Sort");
        metodosOrdenacao.mostrarVetor(vet);
        System.out.println("\n");
        //desordenando o vetor novamente
        metodosOrdenacao.desordenaVetor(vet);

        //Ordenando com SelectionSort
        metodosOrdenacao.selectionSort(vet);
        System.out.println(" Vetor ordenado com SelectionSort");
        metodosOrdenacao.mostrarVetor(vet);
        System.out.println("\n");
        //desordenando o vetor novamente
        metodosOrdenacao.desordenaVetor(vet);

        System.out.println(" Vetor desordenado:");
        metodosOrdenacao.mostrarVetor(vet);
    }

}
