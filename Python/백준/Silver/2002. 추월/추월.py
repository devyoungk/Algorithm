N = int(input())
In = [input() for _ in range(N)]
Out = {input():i for i in range(N)}

cnt = 0

for i in range(N):
    for j in range(i):
        if Out[In[i]] < Out[In[j]]:
            cnt += 1
            break

print(cnt)