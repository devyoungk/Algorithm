n = int(input())
Hash = 0
S = input()
for i in range(n):
    Hash += (ord(S[i]) - 96)*31**i

print(Hash)