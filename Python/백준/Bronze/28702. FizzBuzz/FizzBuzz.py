a = input()
b = input()
c = input()

if a in ['Fizz', 'Buzz', 'FizzBuzz']:
    if b in ['Fizz', 'Buzz', 'FizzBuzz']:
        x = int(c) + 1
    else:
        x = int(b) + 2
else :
    x = int(a) + 3

if x%3 == 0:
    if x%5 == 0:
        print('FizzBuzz')
    else :
        print("Fizz")
elif x%5 == 0:
    print("Buzz")
else:
    print(x)