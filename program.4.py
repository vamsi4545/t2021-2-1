list=list(map(int,input().split()))
a=[1,2,3,4,5,6,7,8,9]
dis={}

for i in a:
   count=0;
   for k in list:
      if(k%i==0):
         count+=1
   dis[i]=count
        
print(dis)
   
