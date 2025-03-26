def solution(n, words):
    x = y = 0
    l = words[0][0]
    for i in range(len(words)):
        if words[i][0] != l or words[i] in words[:i]:
            x = (i+1)%n
            if x == 0:
                x += n
            y = i//n+1
            return x, y
        l = words[i][-1]    
    return 0, 0