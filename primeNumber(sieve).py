n=20
l = [1]*n
for i in range(2,n):
    if l[i] == 1:
        print(i)
        for j in range(i*i,n,i):
            l[j]=0
