def solution(numbers, k):
    n = len(numbers)
    return numbers[(k-1)*2%n]