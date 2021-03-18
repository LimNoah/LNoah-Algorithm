package Practice.Graph;
import java.util.*;

class Vertex {
    public int value;
    List<Integer> adjList;

    public Vertex(int value, List<Integer> adjList) {
        this.value = value;
        this.adjList = adjList;
    }
}

class Graph {
    List<Vertex> vertexList = new ArrayList<>();
    boolean[] visitedVertex;
    boolean isFound;

    public void insert(int value, int [] adjVertices) {
        int vInd = vertexList.size();
        List<Integer> adjList = new ArrayList<>();

        for (int idx: adjVertices) {
            adjList.add(idx);
        }
        Vertex v = new Vertex(value, adjList);

        for (int adjV: v.adjList) {
            vertexList.get(adjV).adjList.add(vInd);
        }

        vertexList.add(v);
    }

    public boolean bfs(int ind, int value) {
        visitedVertex = new boolean[vertexList.size()];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(ind);

        while(!queue.isEmpty()){
            int curIdx = queue.poll();
            if(visitedVertex[curIdx]) {
                continue;
            }
            visitedVertex[curIdx] = true;
            Vertex v = vertexList.get(curIdx);
            if(v.value == value){
                return true;
            }

            for (int adjListIdx: v.adjList){
                if(!visitedVertex[adjListIdx]){
                    queue.add(adjListIdx);
                }
            }
        }
        return false;
    }

    public boolean dfsStack(int ind, int value) {
        visitedVertex = new boolean[vertexList.size()];
        Stack<Integer> stack = new Stack<>();
        stack.push(ind);

        while(!stack.isEmpty()){
            int curIdx = stack.pop();
            if(visitedVertex[curIdx]){
                continue;
            }
            visitedVertex[curIdx] = true;
            Vertex v = vertexList.get(curIdx);
            if(v.value == value){
                return true;
            }

            for (int i = v.adjList.size() - 1; i >= 0; i--){    //이부분을 배열 뒤부터 반복문돌아서 push해줘야하나요?
                if(!visitedVertex[v.adjList.get(i)]){
                    stack.push(v.adjList.get(i));
                }
            }
        }
        return false;
    }

    public boolean dfsRecursive(int ind, int value) {
        isFound = false;
        visitedVertex = new boolean[vertexList.size()];
        dfsHelper(ind, value);
        return isFound;
    }

    private void dfsHelper(int ind, int value){
        if(visitedVertex[ind]){
            return;
        }
        visitedVertex[ind] = true;
        Vertex v = vertexList.get(ind);
        if(v.value == value){
            isFound = true;
            return;
        }
        for(int adjIdx : v.adjList){
            if(!visitedVertex[adjIdx]){
                dfsHelper(adjIdx, value);
            }
        }
    }
}

public class AdjacencyListGraphTest {
    public static void main(String[] args) {
        Graph g = new Graph();

        int [] array1 = {};
        g.insert(0, array1);

        int [] array2 = {0};
        g.insert(1, array2);

        int [] array3 = {1};
        g.insert(2, array3);

        int [] array4 = {0, 2};
        g.insert(3, array4);

        int [] array5 = {3};
        g.insert(4, array5);

        System.out.println(g.bfs(0, 2));
        System.out.println(g.bfs(0, 6));
        System.out.println(g.dfsStack(0, 2));
        System.out.println(g.dfsStack(0, 6));
        System.out.println(g.dfsRecursive(0, 2));
        System.out.println(g.dfsRecursive(0, 6));
    }
}
