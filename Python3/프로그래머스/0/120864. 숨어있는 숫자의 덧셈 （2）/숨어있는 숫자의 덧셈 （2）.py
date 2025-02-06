def solution(my_string):
    answer = 0
    a = ''
    for s in my_string:
        if s.isdigit():
            a += s
        elif a:
            answer += int(a)
            a = ''
    if a:
        answer += int(a)
    return answer