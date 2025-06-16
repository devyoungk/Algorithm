N = int(input())
In = [input() for _ in range(N)]
Out = [input() for _ in range(N)]

cnt = 0

for i in range(1,N):
    for j in range(i):
        if Out.index(In[i]) < Out.index(In[j]):
            cnt += 1
            break

print(cnt)