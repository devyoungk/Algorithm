def solution(numbers):
    a = sorted(numbers)
    return max(a[0]*a[1],a[-1]*a[-2])