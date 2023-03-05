public class Aluno {
    
    protected String nomeAluno;
    private double[] notaAluno = new double [4];
    private int tamanho = 0;
    private double mediaNota;
    private int auxIndice = 0;
    

    

    public Aluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;

    }

    
    public String getNome(){

        return nomeAluno;
    }

    public void adiciona(double notaAluno) throws Exception{

        if (this.tamanho < this.notaAluno.length){
            this.notaAluno[this.tamanho] = notaAluno;
            this.tamanho++;
        } else {
            throw new Exception("Todas as notas foram preenchidas!");
        }  
      }

    public void adicionaPosicao(double notaAluno, int auxIndice) throws Exception{

        this.notaAluno[this.auxIndice] = notaAluno;
    }

    public boolean removerTarefa(int indice) throws  Exception{
        if (indice >=0 && indice <tamanho){
            for (int i=indice; i<this.tamanho-1;i++){
                this.notaAluno[i] = this.notaAluno[i+1];
            }
            this.tamanho--;
            return true;
        }
        throw new Exception("Indice fora do renge");
    }
    public double mediaNota(){

        double somaNota = 0;
        for(int x = 0; x < notaAluno.length; x++){

            somaNota += notaAluno[x];
        }

        mediaNota = somaNota / 4;

        return mediaNota;
    }

    public void aprovacaoAluno(){
        this.mediaNota();

        if(mediaNota >= 6.0){

            System.out.println("Aprovado!");
            return;

        } 

        System.out.println("Reprovado!");
        return;


    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("[");
        
        for(int i=0; i<this.tamanho-1; i++){
            s.append(this.notaAluno[i]);
            s.append(", ");
        }
        
        if(this.tamanho> 0){
            s.append(this.notaAluno[this.tamanho-1]);
        }
        
        s.append("]");
                
        return s.toString();
    }
}
