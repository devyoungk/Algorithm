def solution(my_string, overwrite_string, s):
    answer = ''
    my_string = list(my_string)
    for i in range(len(overwrite_string)):
        my_string[s+i] = overwrite_string[i]
    for a in my_string:
        answer += a
    return answer