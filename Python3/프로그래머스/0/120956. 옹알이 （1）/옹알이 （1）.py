def solution(babbling):
    answer = 0
    for s in babbling:
        for _ in range(4):
            if s.endswith("aya"):
                s = s.replace("aya", "")
            elif s.endswith("ye"):
                s = s.replace("ye", "")
            elif s.endswith("woo"):
                s = s.replace("woo", "")
            elif s.endswith("ma"):
                s = s.replace("ma", "")
        if s == "":
            answer += 1
    return answer