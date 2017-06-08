class Node
{
  struct Edge {
    Node node1;
    Node node2;
    int egdeLength;
    
    Edge(Node n1, Node n2, int) {
      node1 = n1;
      node2 = n2;
      edgeLength = int;
    }
  }
  
  public Edge[] unVisited_neighborList;
  public string Node_name;
  public boolean Visited;
  public int dis_from_Source;
  
  Node() {
    foreach (Edge in neighborList)
      Edge = new Edge(null, null, 0);
      
    Node_name = "";
    Visited = false;
    dis_from_Source = MAX_VALUE;
  }
}
