while 1:
	n = int(input())
	x = 0; y = 0; e=[]; sa=[]
	if n == 0: break
	h = [list(map(int,input().split())) for i in range(n)]
	for i in range(len(h)):
		for j in range(len(h)):
			x += h[i][j]
			y += h[j][i]
		h[i].append(x)
		e.append(y)
		x = 0; y = 0
	e.append(sum(e))
	h.append(e)
	for z in range(len(h)):
		for k in range(len(h)):
			h[z][k] = str(h[z][k]).rjust(5)
	print(h)
"""
右詰めわからん。あとプログラム頭悪すぎ
わざわざintにしたのに右詰めを行うためにstr型に戻すという所業
"""