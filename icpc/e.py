def min_rearrangement_time(n, m, d, x, slabs):
    # Sort slabs by their leftmost position
    slabs.sort()

    # List to store possible gaps for the new slabstone placement
    possible_positions = []
    
    # Check the gap before the first slabstone
    if slabs[0][0] > x:
        possible_positions.append((0, slabs[0][0] - x))

    # Check gaps between existing slabstones
    for i in range(n - 1):
        left_gap = slabs[i][1] + d
        right_gap = slabs[i + 1][0] - d
        if right_gap - left_gap >= x:
            possible_positions.append((left_gap, right_gap - x))

    # Check the gap after the last slabstone
    if m - slabs[-1][1] > x:
        possible_positions.append((slabs[-1][1] + d, m - x))

    # To find the minimum rearrangement time
    min_time = float('inf')
    
    for start, end in possible_positions:
        # Calculate the time needed to rearrange slabs to make space for the new slabstone
        current_time = 0
        for li, ri in slabs:
            if ri < start or li > end:
                continue
            if li < start:
                current_time += start - li
            if ri > end:
                current_time += ri - end
        
        min_time = min(min_time, current_time)
    
    return min_time if min_time != float('inf') else -1

def main():
    # Read input
    n, m, d, x = map(int, input().split())
    slabs = []
    
    for _ in range(n):
        li, ri = map(int, input().split())
        slabs.append((li, ri))
    
    # Calculate and print the minimum rearrangement time
    result = min_rearrangement_time(n, m, d, x, slabs)
    print(result)

if __name__ == "__main__":
    main()