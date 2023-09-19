# AOJ vol0 0005.py
import math
while 1:
    try:
        num = list(map(int, input().split()))
        print(f'{math.gcd(num[0], num[1])} {math.lcm(num[0], num[1])}')
    except:
        break