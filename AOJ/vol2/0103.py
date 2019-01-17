for i in range(int(input())):
	b1 = b2 = b3 = out = score = 0
	while 1:
		n = input()
		if n == "HIT":
			if b3 > 0 : 
				score += 1;
			b3 = b2;
			b2 = b1;
			b1 = 1;
		elif n == "HOMERUN":
			score += b1 + b2 + b3 + 1;
			b1 = b2 = b3 = 0
		elif n == "OUT":
			out += 1;
			if out >=3: break
	print(score)