T = int(input())
while True :
    try :
        H, W, N =map(int,input().split())
        target_floor = N % H
        target_room = N // H + 1
        if target_floor == 0 :
            target_floor = H
            target_room -= 1
        print(target_floor * 100 + target_room)
    except :
        break

