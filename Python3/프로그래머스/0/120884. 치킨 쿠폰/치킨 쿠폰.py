def solution(chicken):
    coupon = chicken
    answer = 0
    while coupon >= 10:
        use = coupon//10
        coupon -= 9*use
        answer += use     
    return answer