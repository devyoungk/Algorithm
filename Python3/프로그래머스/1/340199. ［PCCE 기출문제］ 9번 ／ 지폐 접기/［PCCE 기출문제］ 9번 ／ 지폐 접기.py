def solution(wallet, bill):
    answer = 0
    while True:
        if min(bill) <= min(wallet) and max(bill) <= max(wallet):
            return answer
        bill = [min(bill), max(bill)//2]
        answer += 1