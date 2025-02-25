def solution(cards1, cards2, goal):
    answer = ''
    for s in goal:
        if cards1 and s == cards1[0]:
            cards1.pop(0)
        elif cards2 and s == cards2[0]:
            cards2.pop(0)
        else:
            return "No"
    return "Yes"