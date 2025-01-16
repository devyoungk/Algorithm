def solution(k, m, score):
    score.sort(reverse=True)
    answer = 0
    i = m
    while i <= len(score):
        answer += m*min(score[i-m:i])
        i += m
    return answer