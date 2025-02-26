def solution(a, b):
    A = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30]
    b += sum(A[:a-1])
    B = ['THU','FRI','SAT','SUN','MON','TUE','WED']
    return B[b%7]