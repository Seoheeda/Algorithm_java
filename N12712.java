// T = int(input())

// def find1(n, m, i, j, sums1):
//     for k in range(1, m):
//         if i + k < n:
//             sums1 += arrays[i + k][j]
//         if i - k >= 0:
//             sums1 += arrays[i - k][j]
//         if j + k < n:
//             sums1 += arrays[i][j + k]
//         if j - k >= 0:
//             sums1 += arrays[i][j - k]
//     return sums1


// def find2(n, m, i, j, sums2):
//     for k in range(1, m):
//         if i + k < n and j + k < n:
//             sums2 += arrays[i + k][j + k]
//         if i + k < n and j - k >= 0:
//             sums2 += arrays[i + k][j - k]
//         if i - k >= 0 and j + k < n:
//             sums2 += arrays[i - k][j + k]
//         if i - k >= 0 and j - k >= 0:
//             sums2 += arrays[i - k][j - k]
//     return sums2


// for t in range(1, T + 1):
//     arrays = []
//     n, m = map(int, input().split())

//     for _ in range(n):
//         array = list(map(int, input().split()))
//         arrays.append(array)

//     max_sum = 0

//     for i in range(n):
//         for j in range(n):
//             sums1 = 0
//             sums1 += arrays[i][j]
//             sums2 = 0
//             sums2 += arrays[i][j]
//             max_sum = max(max_sum, find1(n, m, i, j, sums1), find2(n, m, i, j, sums2))
    
//     print("#%d %d" %(t, max_sum))

            
                

