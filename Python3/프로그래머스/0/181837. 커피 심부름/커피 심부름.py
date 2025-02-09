def solution(order):
    answer = 0
    for s in order:
        if "americano" in s or s == "anything":
            answer += 4500
        else:
            answer += 5000
    return answer