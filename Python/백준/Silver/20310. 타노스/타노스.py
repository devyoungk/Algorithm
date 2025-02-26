S = list(input())

print('0' * (S.count('0')//2) + '1' * ((len(S)-S.count('0'))//2))