class Solution {
    int [] parent;
    private int find(int x){
        if(parent[x]==x){
            return x;
        }
        return parent[x]=find(parent[x]);
    }
    private void union(int x,int y){
        int pa=find(x);
        int pb=find(y);
        if(pa!=pb){
            parent[pa]=pb;
        }
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        parent = new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
        }
        for(int [] edge : edges){
            union(edge[0],edge[1]);
        }
        return find(source)==find(destination);
    }
}