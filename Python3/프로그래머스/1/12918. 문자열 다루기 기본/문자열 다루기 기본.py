def solution(s):
    while len(s) in [4, 6]:
        try:
            s = int(s)
            return True
        except:
            return False
    return False