def primelist(m, n):  # m 이상 n 이하의 소수를 담은 리스트 정의
    A = [True] * (n+1) # index n까지
    A[0] = A[1] = False  # 0과 1은 소수가 아님
    for i in range(2,int(n**0.5)+1):
    	if A[i] : # i가 소수일 때
            for j in range(i*i, n+1, i): # i의 배수 제외하는 과정정
                A[j] = False  # 소수가 아님을 나타낸다.
    return [i for i in range(m, n+1) if A[i]]  # 소수만 포함하는 리스트

a, b = map(int,input().split())
primes = primelist(a, b)
for n in primes:
    print(n)