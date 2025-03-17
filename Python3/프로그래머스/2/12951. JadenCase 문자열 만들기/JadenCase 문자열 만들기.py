def solution(s):
    s = s.lower()
    answer = ''
    for i in range (len(s)):
        if s[i] == ' ':
            answer += s[i]
        else:
            if i == 0 or s[i-1] == ' ':
                answer += s[i].upper()
            else:
                answer += s[i]
    return answer