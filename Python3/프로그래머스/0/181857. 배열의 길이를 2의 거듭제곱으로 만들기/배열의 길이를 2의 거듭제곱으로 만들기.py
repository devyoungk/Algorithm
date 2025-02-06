import math

def solution(arr):
    n = math.ceil(math.log2(len(arr)))
    while len(arr) < 2**n:
        arr.append(0)
    return arr