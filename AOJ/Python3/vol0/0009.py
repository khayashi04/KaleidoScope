# AOJ vol0 0009.py
def prime_num(num):
    cnt = 1
    for i in range(2, num + 1):
        for j in range(2, i):
            if i % j == 0:
                break
            elif i % j != 0 and j == i - 1:
                cnt+=1

while 1:
    try:
        print(prime_num(int(input())))
    except EOFError:
        break