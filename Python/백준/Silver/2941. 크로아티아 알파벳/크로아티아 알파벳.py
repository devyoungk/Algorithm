CA = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']
s = input()
for a in CA:
    while s.find(a) > -1:
        s = s.replace(a,'@')
print(len(s))