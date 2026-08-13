class Solution {
   /* int [] parent;
    private int find(int x){
        if(parent[x]=x){
            return x;
        }
        return parent[x]=find(parent[x]);
    }
    private boolean union(int x, int y){
        int pa=find(x);
        int pb=find(y);
        if(pa!=pb){
            parent[a]=pb;
            return true;
        }else{
            return false;
        }
    }*/
    private void dfs(int room,List<List<Integer>> rooms, boolean [] visited){
        if(visited[room]){
            return ;
        }
        visited[room]=true;
        for( int key:rooms.get(room)){
            dfs(key,rooms,visited);
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        /*
        parent = new int [n];
        for(int i=0;i<n;i++){
            parent[i]=i;
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if()
            }
        }
        ====== ### i failed here !!! ### =====
        */
        
        boolean [] visited= new boolean[n];
        dfs(0,rooms,visited);
        for(boolean room:visited){
            if(!room){
                return false;
            }
        }
        return true;
    }
}