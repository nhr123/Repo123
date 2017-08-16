#Findig largest and second largest digit in a number

n=int(input("enter any number\n"))
big=0
sbig=0
while(n!=0):
    rem=n%10
    if rem>big:
        if sbig<big:
            sbig=big
        big=rem
    elif (big>rem)&(sbig<rem):
        sbig=rem
    n=n//10
print("First maximum=",big)
print("Second maximum=",sbig)
