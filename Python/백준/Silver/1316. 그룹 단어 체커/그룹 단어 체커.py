n = int(input())
cnt = 0
for i in range(n):
    A = []
    s = input()
    A.append(s[0])
    for i in range(1, len(s)):
        if s[i] != A[-1]:
            A.append(s[i])
    if len(A) == len(set(A)):
        cnt += 1
print(cnt)