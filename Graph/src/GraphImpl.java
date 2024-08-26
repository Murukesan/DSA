public class GraphImpl {
    private int[][] AM;
    private char[] c;
    private int size;

    public GraphImpl(int size){
        this.size=size;
        this.AM=new int[size][size];
        this.c=new char[size];
    }
    public void Addvertex(int index,char data){
        if(index>=0 && index<size){
            c[index]=data;
        }
    }
    public void Addedge(int i,int j){
        if(i>=0 && i<size && j>=0 && j<size){
            AM[i][j]=1;
            AM[j][i]=1;
        }
    }
    public void AddWeight(int i,int j,int w){
        if(i>=0 && i<size && j>=0 && j<size){
            AM[i][j]=1;
            AM[j][i]=1;
        }
    }
    public void printGraph(){
        System.out.println("Vertex Data :");
        for (int i=0;i<size;i++){
            System.out.print(c[i]+" ");
        }
        System.out.println();
        System.out.println("Adjacencty Matrix");
        for (int[] row:AM){
            for (int data:row){
                System.out.print(data+" ");
            }
            System.out.println();
        }
    }

    public void dfs(char c1) {
        boolean[] visited=new boolean[size];
        int vertex=new String(c).indexOf(c1);
        System.out.println(vertex);
        dfsImpl(vertex,visited);
    }

    private void dfsImpl(int vertex, boolean[] visited) {
        visited[vertex]=true;
        System.out.print(c[vertex]+" ");
        for (int i=0;i<size;i++){
            if(AM[vertex][i]==1 && !visited[i]){
                dfsImpl(i,visited);
            }
        }
    }
    public void bfs(char startVertexData) {
        boolean[] visited = new boolean[size];
        int[] queue = new int[size];
        int queueStart = 0;
        int queueEnd = 0;

        int startVertex = new String(c).indexOf(startVertexData);
        queue[queueEnd++] = startVertex;
        visited[startVertex] = true;

        while (queueStart < queueEnd) {
            int currentVertex = queue[queueStart++];
            System.out.print(c[currentVertex] + " ");

            for (int i = 0; i < size; i++) {
                if (AM[currentVertex][i] == 1 && !visited[i]) {
                    queue[queueEnd++] = i;
                    visited[i] = true;
                }
            }
        }
    }
}
