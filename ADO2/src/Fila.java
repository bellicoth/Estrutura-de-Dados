public class Fila extends EstruturaEstatica{

  
    public boolean enfilerar(Object elemento) {
        // TODO Auto-generated method stub
        return super.adiciona(elemento);
    }

    
    public boolean enfilerar(int posicao, Object elemento) {
        // TODO Auto-generated method stub
        return super.adiciona(posicao, elemento);
    }

    
    public void desfilerar(int posicao) {
        // TODO Auto-generated method stub
        super.remove(posicao);
    }

    
    
}
