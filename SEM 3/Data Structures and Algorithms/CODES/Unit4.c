//Adjacency Matrix Representation for All Graph Types

#include <stdio.h>

int main() {
    int n, e;
    int directed, weighted;

    printf("Enter number of vertices: ");
    scanf("%d", &n);

    int adj[n][n];

    // Initialize matrix to 0
    for (int i = 0; i < n; i++)
        for (int j = 0; j < n; j++)
            adj[i][j] = 0;

    printf("Enter number of edges: ");
    scanf("%d", &e);

    printf("Is the graph directed? (1 for Yes, 0 for No): ");
    scanf("%d", &directed);

    printf("Is the graph weighted? (1 for Yes, 0 for No): ");
    scanf("%d", &weighted);

    printf("\nEnter the edges:\n");

    for (int i = 0; i < e; i++) {
        int u, v, w = 1;

        if (weighted)
            printf("Edge %d (u v weight): ", i + 1);
        else
            printf("Edge %d (u v): ", i + 1);

        if (weighted)
            scanf("%d %d %d", &u, &v, &w);
        else
            scanf("%d %d", &u, &v);

        adj[u][v] = w;

        if (!directed)
            adj[v][u] = w;  // Mirror edge for undirected graph
    }

    printf("\nAdjacency Matrix:\n");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++)
            printf("%3d ", adj[i][j]);
        printf("\n");
    }

    return 0;
}
