def solution(babbling):
    answer = 0
    A = ["aya", "ye", "woo", "ma"]
    B = True
    for s in babbling:
        x = ''
        while len(s) > 1:
            for a in A:
                if a == x:
                    continue
                elif s.startswith(a):
                    s = s.replace(a,'',1)
                    x = a
                    break
            else:
                break
        if s == '':
            answer += 1
    return answer