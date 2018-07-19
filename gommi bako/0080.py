import math
value = []
i = 1
while True:
  z = int(input())
  if z == -1: break
  value.append(z)
for x in range(1,len(value)+1):
  li = []
  i = 1
  li.append(value[x-1] / 2)
  while True:
    li.append(li[i-1] - ((li[i-1]**3 - value[x-1]) / (3 * li[i-1]**2)))
    if math.fab(li[i]**3 - value[x-1]) < 0.00001*value[x-1]:
      break
    i += 1
  print(min(li))