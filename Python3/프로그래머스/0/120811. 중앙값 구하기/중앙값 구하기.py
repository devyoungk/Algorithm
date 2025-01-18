def solution(array):
    array.sort()
    n = len(array)
    answer = array[n//2]
    return answer