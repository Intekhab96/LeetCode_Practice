class Solution {
    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {

        if (graph == null || graph.length == 0)
            return result;
        List<Integer> currentPath = new ArrayList<>();
        currentPath.add(0);
        dfs(graph, graph[0], currentPath);
        return result;
    }

    private void dfs(int[][] graph, int[] adjList, List<Integer> currentPath) {

        // for(int i=0;i<adjList.length;i++){
        // System.out.print(adjList[i]+" ");
        // }
        // System.out.print("\nCurrrentPath\n");
        // for(int j=0;j<currentPath.size();j++){
        // System.out.print(currentPath.get(j)+" ");
        // }
        // System.out.print("\n");

        for (int i = 0; i < adjList.length; i++) {

            currentPath.add(adjList[i]);
            if (adjList[i] == graph.length - 1) {
                result.add(new ArrayList<>(currentPath));
                // currentPath.remove(currentPath.size()-1);
                // return;
            }
            dfs(graph, graph[adjList[i]], currentPath);
            // if(currentPath.size() > 0)
            currentPath.remove(currentPath.size() - 1);
        }
    }
}