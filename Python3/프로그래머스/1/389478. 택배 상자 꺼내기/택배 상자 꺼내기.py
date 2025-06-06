def solution(n, w, num):
    answer = 0
    A = [[] for _ in range(w)]
    for i in range(1,n+1):
        if ((i-1)//w)%2 == 0:
            A[i%w-1].append(i)
        else:
            A[(w-i%w)%w].append(i)
    for a in A:
        if num in a:
            answer = len(a)-a.index(num)
            break
    return answer