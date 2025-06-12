def solution(video_len, pos, op_start, op_end, commands):
    h,m = map(int,video_len.split(':'))
    vl = h*60+m
    h,m = map(int,pos.split(':'))
    p = h*60+m
    h,m = map(int,op_start.split(':'))
    os = h*60+m
    h,m = map(int,op_end.split(':'))
    oe = h*60+m
    if os <= p <= oe:
            p = oe
    for c in commands:
        if c == 'next':
            p += 10
            if p > vl:
                p = vl
        else:
            p -= 10
            if p < 0:
                p = 0
        if os <= p <= oe:
            p = oe
    h = p//60
    m = p%60
    
    return f"{h:02d}:{m:02d}"