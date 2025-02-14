def solution(data, ext, val_ext, sort_by):
    answer = []
    A = ["code", "date", "maximum", "remain"]
    i = A.index(ext)
    j = A.index(sort_by)
    for a in data:
        if a[i] < val_ext:
            answer.append(a)
            
    answer.sort(key = lambda x:x[j])
    return answer