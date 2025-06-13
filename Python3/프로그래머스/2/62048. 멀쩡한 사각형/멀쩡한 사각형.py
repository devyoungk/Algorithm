def solution(w,h):
    x, y = w, h
    while y>0:
        x, y = y, x%y
    g = x
    x, y = w//g, h//g
    return w*h - (x+y-1)*g