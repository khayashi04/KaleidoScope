"""
for文が多いので改良の必要あり。
解決方法が不明
"""
y1 = []; y2 = []; 
s1 = []; s2 = [];
n = list(i+1 for i in range(2*int(input())))
l = int(len(n)/2)
for i in range(l):
	y1.append(n[i])
	y2.append(n[i+l])
for j in range(int(input())):
	b = int(input())
	if b == 0:
		for 
		