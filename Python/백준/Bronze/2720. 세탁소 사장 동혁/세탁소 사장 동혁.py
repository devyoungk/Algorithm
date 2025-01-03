T = int(input())
A = [25, 10, 5, 1]
for _ in range (T):
    C = int(input())
    for i in range (4):
        print(C//A[i], end=" ")
        C = C%A[i]
    print()