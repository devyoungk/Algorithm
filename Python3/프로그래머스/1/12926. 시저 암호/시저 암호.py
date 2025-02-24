def solution(s, n):
    answer = ''
    for x in s:
        if x == ' ':
            answer += ' '
            continue
        a = ord(x)
        if (65 < a <= 90 and a+n > 90) or (97 < a <= 122 and a+n > 122):
            a -= 26
        answer += chr(a+n)
    return answer