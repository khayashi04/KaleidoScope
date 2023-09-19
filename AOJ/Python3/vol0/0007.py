# AOJ vol0 0007.py
import math
num = 100000
for i in range(int(input())):
    num = (math.ceil(num * 1.05 / 1000)) * 1000
print(num)