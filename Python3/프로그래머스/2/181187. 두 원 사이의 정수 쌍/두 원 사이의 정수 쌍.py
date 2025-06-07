def solution(r1, r2):
    answer = 0
    for x in range(1, r1):
        miny = (r1*r1-x*x)**0.5
        maxy = (r2*r2-x*x)**0.5
        answer += int(maxy)-int(miny)
        if miny == int(miny):
            answer += 1
    for x in range(r1, r2+1):
        maxy = (r2*r2-x*x)**0.5
        answer += int(maxy)+1
    return 4*answer