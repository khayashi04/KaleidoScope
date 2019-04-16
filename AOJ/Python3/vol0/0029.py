import statistics
sentLong = 
sent = list(map(str,input().split(' ')))
for i in range(len(sent)):
	if len(sentLong) < len(sent[i]):
		sentLong = sent[i]
print(statistics.mode(sent), sentLong)