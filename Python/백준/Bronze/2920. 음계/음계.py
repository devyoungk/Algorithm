X = list(map(int, input().split()))
if X == sorted(X):
    print('ascending')
elif X == sorted(X, reverse=True):
    print('descending')
else :
    print('mixed')