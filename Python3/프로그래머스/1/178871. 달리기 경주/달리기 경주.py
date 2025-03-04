def solution(players, callings):
    A = {name:rank for rank, name in enumerate(players)}
    
    for c in callings:
        n = A[c]
        players[n], players[n-1] = players[n-1], players[n]
        A[players[n]], A[players[n-1]] = A[players[n-1]], A[players[n]]
    
    return players