# AOJ vol0 0002.py
while 1:
    try:
        str_1 = input().split()
        print(len(list(str(int(str_1[0]) + int(str_1[1])))))
    except:
        break