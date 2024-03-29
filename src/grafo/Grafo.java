package grafo;
import java.util.Iterator;

public interface Grafo {

	public Vertice adicionarVertice(Vertice v);

	public void adicionarAresta(Vertice origem, Vertice destino);

	@SuppressWarnings("rawtypes")
	public Iterator iteradorVertice();

	@SuppressWarnings("rawtypes")
	// através de arestas incidentes em um vértice
	public Iterator iteradorAresta(Vertice u);

	@SuppressWarnings("rawtypes")
	// u é o índice do vértice no qual as arestas incidem
	public Iterator iteradorAresta(int u);

	public int getCardinalidadeVertice();

	public int getCardinalidadeAresta();

	public boolean ehDirecionado();

	Vertice adicionarVertice(String conteudo, int id);

	Vertice getVertice(int id);

}
