def solution(str_list):
    answer = []
    if str_list.count('l') == 0 and str_list.count('r')== 0:
        return answer
    elif str_list.count('l') == 0:
        return str_list[str_list.index('r')+1::]
    elif str_list.count('r') == 0:
        return str_list[:str_list.index('l'):]
    elif str_list.index('l') > str_list.index('r'):
        return str_list[str_list.index('r')+1::]
    else:
        return str_list[:str_list.index('l'):]