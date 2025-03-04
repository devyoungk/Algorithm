def solution(survey, choices):
    answer = ''
    A = {"RT":0, "TR":0, "FC":0, "CF":0, "MJ":0, "JM":0, "AN":0, "NA":0}
    for i in range(len(survey)):
        if choices[i] < 4:
            A[survey[i]] += (4-choices[i])
        elif choices[i] > 4:
            A[survey[i]] -= (choices[i]-4)
            
    answer += 'R' if A['RT']-A['TR'] >= 0 else 'T'
    answer += 'C' if A['CF']-A['FC'] >= 0 else 'F'
    answer += 'J' if A['JM']-A['MJ'] >= 0 else 'M'
    answer += 'A' if A['AN']-A['NA'] >= 0 else 'N'

    return answer