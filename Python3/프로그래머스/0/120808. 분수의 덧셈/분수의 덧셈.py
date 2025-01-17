def solution(numer1, denom1, numer2, denom2):
    a = numer1*denom2+numer2*denom1
    b = denom1*denom2
    i = 2
    while i <= a:
        if a%i == b%i == 0:
            a, b = a//i, b//i
        else : i += 1
    answer = [a, b]
    return answer