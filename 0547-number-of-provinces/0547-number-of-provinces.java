class Solution {
    int [] parent;
    private int find(int x){
        if(parent[x]==x){
            return x;
        }
        return parent[x]=find(parent[x]);
    }
    private boolean union(int x,int y){
        int pa=find(x);
        int pb=find(y);
        if(pa!=pb){
            parent[pa]=pb;
            return true;
        }else{
            return false;
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        parent = new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
        }
        int prov=n;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(isConnected[i][j]==1){
                    if(union(i,j)){
                        prov--;
                    }
                }
            }
        }
        return prov;
    }
}