def gcd(a, b):
    while b != 0:
        a, b = b, a % b
    return a

def list_gcd(A):
    result = A[0]
    for num in A[1:]:
        result = gcd(result, num)
    return result

def solution(arrayA, arrayB):
    answer = 0
    GA = list_gcd(arrayA)
    GB = list_gcd(arrayB)
    
    for i in range(GA, 1, -1):
        if GA%i == 0:
            for b in arrayB:
                if b%i == 0:
                    break
            else:
                answer = i
                break
    
    for i in range(GB, answer, -1):
        if GB%i == 0:
            for a in arrayA:
                if a%i == 0:
                    break
            else:
                answer = i
                break
    return answer