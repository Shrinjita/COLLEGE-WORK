#BFS
from collections import defaultdict

class Graph:
    def __init__(self):
        self.graph = defaultdict(list)

    def addEdge(self, u, v):
        self.graph[u].append(v)

    def BFS(self, s):
        visited = [False] * (max(self.graph) + 1)
        queue = []
        queue.append(s)
        visited[s] = True

        while queue:
            s = queue.pop(0)
            print(s, end=" ")
            for i in self.graph[s]:
                if not visited[i]:
                    queue.append(i)
                    visited[i] = True

if __name__ == '__main__':
    g = Graph()

    edges = int(input("Enter the number of edges: "))
    for e in range(edges):
        u, v = map(int, input("Enter edge (u v): ").split())
        g.addEdge(u, v)

    start_vertex = int(input("Enter the starting vertex for BFS traversal: "))

    print("Breadth First Traversal:")
    g.BFS(start_vertex)
