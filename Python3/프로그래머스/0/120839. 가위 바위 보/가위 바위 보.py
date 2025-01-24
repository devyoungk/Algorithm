def solution(rsp):
    g = {'2':'0', '0':'5', '5':'2'}
    answer = ''
    for x in rsp:
        answer += g[x]
    return answer