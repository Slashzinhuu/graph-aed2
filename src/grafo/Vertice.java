package grafo;
import java.util.ArrayList;
import java.util.List;


public class Vertice {
	
     public static final int INDICE_DESCONHECIDO = -1;
	
	 private String conteudo;
	 private int indice; 
     private int distancia;
     private boolean visitado;
     private Vertice pai;
     private List<Aresta> arestas;
     private List<Vertice> vizinhos;
     
     public Vertice(String conteudo)
     {
    	 indice = INDICE_DESCONHECIDO;
    	 this.conteudo = conteudo;
    	 this.visitado = false; 
    	 this.arestas = new ArrayList<Aresta>();
    	 this.vizinhos = new ArrayList<Vertice>();	 
     }
     
     public Vertice (int indice, String conteudo)
     {
    	 this.indice = indice;
    	 this.conteudo = conteudo;
    	 this.visitado = false; 
    	 this.arestas = new ArrayList<Aresta>();
    	 this.vizinhos = new ArrayList<Vertice>();	 
     }
     
     public Vertice(String conteudo, int id) { 
    	 this.conteudo = conteudo; 
    	 this.indice = id; 
    	 this.visitado = false; 
    	 this.arestas = new ArrayList<Aresta>();
    	 this.vizinhos = new ArrayList<Vertice>();	 
     }
     
     public void setConteudo(String conteudo){
             
             this.conteudo = conteudo;
     }
     
     public String getConteudo(){
             
             return conteudo;
             
     }
     
     public void visitar (){
             
             this.visitado = true;
     }
     
     public boolean verificarVisita(){
             
             return visitado;
     }
     
     public void setDistancia(int distancia){
             
             this.distancia = distancia;
     }
     
     public int getDistancia(){
             
             return this.distancia;
     }
     
     public void setPai(Vertice pai){
             
             this.pai = pai;
     }
     
     public Vertice getPai(){
             
             return this.pai;
     }

     public void setVizinhos(List<Vertice> vizinhos) {
             
             this.vizinhos.addAll(vizinhos);
                             
     }
     
     public List<Vertice> getVizinhos(){
             
             return this.vizinhos;
     }
     
     public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	public void setArestas(List <Aresta> arestas){
             this.arestas.addAll(arestas);
             
     }
     
     public List<Aresta> getArestas() {
             return arestas;
     }
     
     public String toString()
     {
    	 return conteudo + " (indice = " + indice + ")"; 
     }
     
}
