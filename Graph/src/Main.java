//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] Vertex={"A","B","C","D"};
        int[][] adjacencyMatrix = {
                {0, 1, 1, 1}, // Edges for A
                {1, 0, 1, 0}, // Edges for B
                {1, 1, 0, 0}, // Edges for C
                {1, 0, 0, 0}  // Edges for D
        };

        for (String s:Vertex){
            System.out.print(s+ " ");
        }
        System.out.println();
        System.out.println("Adjacency Matrix");
        for (int[] row:adjacencyMatrix){
            for(int data:row){
                System.out.print(data+ " ");
            }
            System.out.println();
        }
        System.out.println("Vertex List:");
        for (int i=0;i<Vertex.length;i++){
            System.out.print(Vertex[i]+ ": ");
            for(int j=0;j<Vertex.length;j++){
                if(adjacencyMatrix[i][j]==1){
                    System.out.print(Vertex[j]+ " ");
                }
            }
            System.out.println();
        }
        GraphImpl GI=new GraphImpl(4);
        GI.Addvertex(0,'A');
        GI.Addvertex(1,'B');
        GI.Addvertex(2,'C');
        GI.Addvertex(3,'D');
        GI.Addedge(0,1);
        GI.Addedge(0,2);
        GI.Addedge(0,3);
       // GI.AddWeight(0,1,3);
        GI.printGraph();
        GI.dfs('C');
        GI.bfs('C');
    }

}