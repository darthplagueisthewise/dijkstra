class Graph
{
  int graphSize;
  Node[] nodesInGraph; 
  Node sourceNode;
  Node targetNode;
  
  Graph(int, Node st, Node tg)
  {
    if (int > 1)
    {
      graphSize = int;
      nodesInGraph = new Node[int]();
      sourceNode = st;
      targetNode = tg;
      Node[0] = sourceNode;
      Node[1] = targetNode;
    }
  }
  
  struct Edge 
  {
    Node n1,n2;
    int length;
    
    Edge(Node n1, Node n2, int)
    {
      this.n1 = n1;
      this.n2 = n2;
      length = int;
    }
  }
  
  static void Main(String args[])
  {
    Node starterNode = new Node("starter");
    Node endNode = new Node("target");
    
    Graph dGraph = new Graph(8, starterNode, endNode);
    
    
