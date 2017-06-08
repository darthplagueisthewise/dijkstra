class Graph
{
  Node[] nodesInGraph; 
  Node sourceNode;
  Node targetNode;
  
  static void Main(string Args[])
  {
    Graph D_Graph = new Graph();
    
    D_Graph.nodesInGraph[0] = new Node("starter");
