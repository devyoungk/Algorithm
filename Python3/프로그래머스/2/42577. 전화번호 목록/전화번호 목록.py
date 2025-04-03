def solution(phone_book):
    P = sorted(phone_book)
    for i in range(len(P)-1):
        if P[i+1].startswith(P[i]):
            return False
    return True