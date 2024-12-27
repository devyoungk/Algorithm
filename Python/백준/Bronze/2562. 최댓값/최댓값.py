i = 1
Max = int(input())
count = 1
while True :
    try :
        X = int(input())
        i += 1
        if X > Max :
            Max = X
            count = i
    except :
        break

print(Max)
print(count)
