A = []
for i in range(100, 301):
    if not (i%2 or (i//10)%2 or (i//100)%2):
        A.append(str(i))
print(','.join(A))