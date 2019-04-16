"""
出力正しい。しかしWrong Answerで返ってくる
"""
while 1:	
	n = int(input())
	if n == 0: break
	l1 = []
	l2 = []
	w = []
	for i in range(n):
		a,b = list(input().split())
		l1.append(a)
		l2.append(b)
	length = int(input())
	for i in range(length):
		w.append(input())
		for j in range(len(l1)):
			if w[i] == l1[j]:
				w[i] = l2[j]
				break
	print(''.join(w))