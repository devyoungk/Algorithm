S = str(input())
for i in range(len(S)):
    if S[i].islower():
        print(S[i].upper(),end="")
    else: print(S[i].lower(),end="")