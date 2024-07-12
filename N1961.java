# T = int(input())

# def rotate_90(matrix):
#     N = len(matrix)
#     return [[matrix[N - j - 1][i] for j in range(N)] for i in range(N)]

# def rotate_180(matrix):
#     return rotate_90(rotate_90(matrix))

# def rotate_270(matrix):
#     return rotate_90(rotate_180(matrix))

# def print_matrix(matrix):
#     for row in matrix:
#         print(''.join(map(str, row)), end=' ')

# for t in range(1, T+1):
#     N = int(input())
#     matrix = [list(map(int, input().split())) for _ in range(N)]
    
#     rotated_90 = rotate_90(matrix)
#     rotated_180 = rotate_180(matrix)
#     rotated_270 = rotate_270(matrix)
    
#     print('#%d' %(t))
#     for i in range(N):
#         print(''.join(map(str, rotated_90[i])), ''.join(map(str, rotated_180[i])), ''.join(map(str, rotated_270[i])))
