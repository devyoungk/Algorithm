import math
def solution(fees, records):
    A = {}
    D = {}
    for r in records:
        time, num, io = r.split()
        if num not in A:
            A[num] = 0
        if io == "IN":
            h, m = map(int, time.split(':'))
            D[num] = 60*h+m
        elif io == "OUT":
            h, m = map(int, time.split(':'))
            A[num] += 60*h+m - D[num]
            del D[num]
    for d in D:
        A[d] += 60*23+59 - D[d]
    B = sorted(A.items())
    answer = []
    for b in B:
        cost = fees[1] + math.ceil(max(b[1]-fees[0],0)/fees[2])*fees[3]
        answer.append(cost)
    return answer