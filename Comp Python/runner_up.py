if __name__ == '__main__':
    n = int(input())
    min=[]
    a=[]
    arr = ([input().split() for _ in range(n)],int)
    print(arr)
    for i in range(n):
        a.append(min(arr))
    print(a)
    