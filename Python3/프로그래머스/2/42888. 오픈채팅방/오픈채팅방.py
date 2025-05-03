def solution(record):
    answer = []
    D = {}
    for r in record:
        A = r.split()
        if A[0] != 'Leave':
            D[A[1]] = A[2]
    for r in record:
        A = r.split()
        if A[0] == 'Enter':
            answer.append(f'{D[A[1]]}님이 들어왔습니다.')
        elif A[0] == 'Leave':
            answer.append(f'{D[A[1]]}님이 나갔습니다.')   
    return answer