T = int(input())
for i in range(1, T+1):
    s = ''
    n = int(input())
    for _ in range(n):
    	alpa, num = input().split()
    	s += alpa * int(num)
    print(f'#{i}')
    for j in range(0,len(s),10):
          print(s[j:j+10])