package universidade.positivo;

/**
 *
 * @author wcarlosg
 */
public class FilaDinamica<E> {
    private Node ini;
    private Node fim;
    private int qtdElementos;

    public FilaDinamica() {
        ini = null;
        fim = null;
        qtdElementos = 0;
    }
    
    
    public void enfileirar(E dado) {
        Node nova = new Node();
        nova.setValue(dado);
        if (qtdElementos == 0) {
            ini = nova;
            fim = nova;
            qtdElementos ++;
        } else {
            fim.setNext(nova);
            fim = fim.getNext();
            qtdElementos++;
        }
    }
}
