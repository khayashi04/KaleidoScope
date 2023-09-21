tate = int(input())
yoko = int(input())

list_tate = [i + 1 for i in range(tate)]

for i in range(yoko):
    x, y = map(int, input().split(","))
    list_tate[x-1], list_tate[y-1] = list_tate[y-1], list_tate[x-1]

for i in range(len(list_tate)):
    print(list_tate[i])