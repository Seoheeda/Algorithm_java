import sys
input = sys.stdin.readline

dwarfs = []
all = 0

for _ in range(9):
    dwarf = int(input())
    dwarfs.append(dwarf)
    all += dwarf

dwarfs.sort()

left = all - 100
fake1 = 0
fake2 = 0

for i in range(9):
    for j in range(i + 1, 9):
        if dwarfs[i] + dwarfs[j] == left:
            fake1 = i
            fake2 = j
            break

for i in range(9):
    if i != fake1 and i != fake2:
        print(dwarfs[i])

