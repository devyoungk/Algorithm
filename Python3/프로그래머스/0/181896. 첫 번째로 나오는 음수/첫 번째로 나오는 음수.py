def solution(num_list):
    for n in num_list:
        if n < 0:
            return num_list.index(n)
    return -1