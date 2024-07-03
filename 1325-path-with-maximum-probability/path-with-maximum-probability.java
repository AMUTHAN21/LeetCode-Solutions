class Solution 
{
    static class NodeProbability 
    {
        int node;
        double probability;

        NodeProbability(int node, double probability) 
        {
            this.node = node;
            this.probability = probability;
        }
    }
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) 
    {
        Map<Integer, List<NodeProbability>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) 
        {
            graph.put(i, new ArrayList<>());
        }
        for (int i = 0; i < edges.length; i++) 
        {
            int a = edges[i][0];
            int b = edges[i][1];
            double prob = succProb[i];
            graph.get(a).add(new NodeProbability(b, prob));
            graph.get(b).add(new NodeProbability(a, prob));
        }

        // Step 2: BFS setup
        Queue<NodeProbability> queue = new LinkedList<>();
        double[] probabilities = new double[n];
        probabilities[start_node] = 1.0;
        queue.offer(new NodeProbability(start_node, 1.0));

        while (!queue.isEmpty()) 
        {
            NodeProbability current = queue.poll();
            int node = current.node;
            double prob = current.probability;
            for (NodeProbability neighbor : graph.get(node)) 
            {
                double newProb = prob * neighbor.probability;
                // Only consider this new path if it improves the probability
                if (newProb > probabilities[neighbor.node]) 
                {
                    probabilities[neighbor.node] = newProb;
                    queue.offer(new NodeProbability(neighbor.node, newProb));
                }
            }
        }

        // Return the maximum probability to reach the end node
        return probabilities[end_node];
    }
}