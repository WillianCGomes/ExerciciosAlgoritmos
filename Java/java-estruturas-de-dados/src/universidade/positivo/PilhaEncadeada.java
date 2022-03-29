
package universidade.positivo;

import static java.lang.Math.E;

/**
 *
 * @author wcarlosg
 */
public class PilhaEncadeada {
    private Node topo;
    private int qtdElementosNaPilha ;

    public PilhaEncadeada() {
        topo = null;
        qtdElementosNaPilha = 0;
    }
    
    public void empilhar(int dado) {
       Node novo = new Node();
       novo.setValue(novo);
       novo.setNext(topo);
       topo=novo;
       qtdElementosNaPilha ++;
       
        
    }
    
    
    
    
    public static void main(String[] args) {
    }
    
}
