n = int(input())
bound = 1
count = 1
while n > bound:
    bound += 6*count
    count += 1
print(count)