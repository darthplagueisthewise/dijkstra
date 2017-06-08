class Node
{  
  public Node[] unVisited_neighborList;
  public String Node_name;
  public boolean Visited;
  public int dis_from_Source;
  
  Node() {
    foreach (Node in unVisited_neighborList)
      Node = new Node(null, null, 0);
      
    Node_name = "";
    Visited = false;
    dis_from_Source = MAX_VALUE;
  }
  
  Node(String)
  {
    foreach (Node in unVisited_neighborList) 
      Node = new Node(null, null, 0);
    
    Node_name = String;
    Visited = false;
    dis_from_source = MAX_VALUE;
  }
}
