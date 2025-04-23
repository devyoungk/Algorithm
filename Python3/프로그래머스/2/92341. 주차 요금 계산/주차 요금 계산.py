import math
def solution(fees, records):
    use = {}
    check = {}
    
    for r in records:
        time, num, io = r.split()
        if num not in use:
            use[num] = 0
        if io == "IN":
            h, m = map(int, time.split(':'))
            check[num] = 60*h+m
        elif io == "OUT":
            h, m = map(int, time.split(':'))
            use[num] += 60*h+m - check[num]
            del check[num]
    
    for c in check:
        use[c] += 60*23+59 - check[c]
        
    A = sorted(use.items())
    answer = []
    for a in A:
        cost = fees[1] + math.ceil(max(a[1]-fees[0],0)/fees[2])*fees[3]
        answer.append(cost)
    return answer