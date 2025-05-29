def solution(m, musicinfos):
    re = [['A#','H'], ['B#','I'],['C#','J'],['D#','K'],['E#','L'],['F#','M'],['G#','N']]
    for r in re:
        m = m.replace(r[0],r[1])
    answer = "(None)"
    answer_len = 0
    answer_time = 0
    for music in musicinfos:
        s, e, title, melody = music.split(',')
        for r in re:
            melody = melody.replace(r[0],r[1])
        sh, sm = map(int, s.split(":"))
        eh, em = map(int, e.split(":"))
        time = 60*(eh-sh)+(em-sm)
        x = (melody * ((time // len(melody)) + 1))[:time]
        i = 0
        l = len(melody)
        if m in x:
            if time > answer_time:
                answer = title
                answer_len = len(answer)
                answer_time = time
    return answer