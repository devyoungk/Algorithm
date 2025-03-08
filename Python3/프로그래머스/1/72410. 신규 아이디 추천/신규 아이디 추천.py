def solution(new_id):

    new_id = new_id.lower()
    
    A = ''
    for n in new_id:
        if n.isalnum() or n in ('-','_','.'):
            A += n
    
    x = ''
    B = ''
    for a in A:
        if a == x =='.':
            continue
        x = a
        B += a
    
    if B[0] == '.':
        B = B[1:]
    elif B[-1] == '.':
        B = B[:-1]

    if B == '':
        B = 'a'
    
    if len(B) >= 16:
        B = B[:15]
    if B[0] == '.':
        B = B[1:]
    elif B[-1] == '.':
        B = B[:-1]
    
    while len(B) <= 2:
        B += B[-1]
    
    return B