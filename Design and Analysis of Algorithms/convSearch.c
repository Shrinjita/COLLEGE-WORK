#include <stdio.h>
#include <stdlib.h>
#include <math.h>

// Structure to represent a point in 2D space
struct Point {
    int x, y;
};

// Function prototypes
int orientation(struct Point, struct Point, struct Point);
int onSegment(struct Point, struct Point, struct Point);
int doIntersect(struct Point, struct Point, struct Point, struct Point);
int isInside(struct Point[], int, struct Point);

// Function to find orientation of triplet (p, q, r)
int orientation(struct Point p, struct Point q, struct Point r) {
    int val = (q.y - p.y) * (r.x - q.x) - (q.x - p.x) * (r.y - q.y);
    if (val == 0) return 0;  // colinear
    return (val > 0) ? 1 : 2; // clock or counterclockwise
}

// Function to check if a point lies on the line segment 'pq'
int onSegment(struct Point p, struct Point q, struct Point r) {
    if (r.x <= fmax(p.x, q.x) && r.x >= fmin(p.x, q.x) &&
        r.y <= fmax(p.y, q.y) && r.y >= fmin(p.y, q.y))
        return 1;
    return 0;
}

// Function to check if two line segments intersect
int doIntersect(struct Point p1, struct Point q1, struct Point p2, struct Point q2) {
    int o1 = orientation(p1, q1, p2);
    int o2 = orientation(p1, q1, q2);
    int o3 = orientation(p2, q2, p1);
    int o4 = orientation(p2, q2, q1);

    if (o1 != o2 && o3 != o4)
        return 1;

    if (o1 == 0 && onSegment(p1, q1, p2)) return 1;
    if (o2 == 0 && onSegment(p1, q1, q2)) return 1;
    if (o3 == 0 && onSegment(p2, q2, p1)) return 1;
    if (o4 == 0 && onSegment(p2, q2, q1)) return 1;

    return 0; // Doesn't intersect
}

// Function to check if a point lies inside the convex hull
int isInside(struct Point polygon[], int n, struct Point p) {
    // There must be at least 3 vertices in polygon[]
    if (n < 3) return 0;

    // Create a point for line segment from p to infinite
    struct Point extreme = {10000, p.y};

    // Count intersections of the above line with sides of polygon
    int count = 0, i = 0;
    do {
        int next = (i + 1) % n;

        // Check if the line segment from 'p' to 'extreme' intersects
        // with the line segment from 'polygon[i]' to 'polygon[next]'
        if (doIntersect(polygon[i], polygon[next], p, extreme)) {
            // If the point 'p' is colinear with line segment 'i-next',
            // then check if it lies on segment. If it lies, return true,
            // otherwise false
            if (orientation(polygon[i], p, polygon[next]) == 0)
                return onSegment(polygon[i], p, polygon[next]);

            count++;
        }
        i = next;
    } while (i != 0);

    // Return true if count is odd, false otherwise
    return count % 2; // Same as (count%2 == 1)
}

int main() {
    // Example of points forming a convex hull
    struct Point polygon[] = {{0, 0}, {5, 10}, {10, 0}, {5, 5}, {15, 15}};
    int n = sizeof(polygon) / sizeof(polygon[0]);

    // Take input for the point from the user
    struct Point p;
    printf("Enter the coordinates of the point: ");
    scanf("%d %d", &p.x, &p.y);

    // Check if the point lies inside the convex hull
    if (isInside(polygon, n, p))
        printf("The point lies inside the convex hull.\n");
    else
        printf("The point does not lie inside the convex hull.\n");

    return 0;
}
