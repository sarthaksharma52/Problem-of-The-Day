### Week 1 Problem Statements

### Day 1
### Sum of dependencies in a graph
Given a directed graph with V nodes and E edges, if there is an edge from u to v, then we will say that u depends on v. Number of Dependencies (NoD) for a node x is the total count of nodes that x depends upon. Find out the sum of number of dependencies of every node.

Input:
V = 4
E = 4
Edges = { {0,2}, {0,3}, {1,3}, {2,3} }

Output : 4

### Day 2
### Euler circuit and Path
An Eulerian Path is a path in graph that visits every edge exactly once and it starts and ends up at different indexes. An Eulerian Circuit is an Eulerian Path which starts and ends on the same vertex. Given an undirected acyclic graph with V nodes, and E edges, with adjacency list adj, return 2 if the graph contains an eulerian circuit, else if the graph contains an eulerian path, return 1, otherwise, return 0.

Input :     0
          /   \
        1       2
Output : 2