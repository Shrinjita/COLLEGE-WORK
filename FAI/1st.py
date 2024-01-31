def get_input():
    x = int(input('1 = '))
    y = int(input('2 = '))
    return x,y

def sum(x, y):
    return x + y

def sub(x, y):
    return x - y if x > y else y - x

def mul(x, y):
    return x * y

def div(x, y):
    return x / y if x > y else y / x

x,y= get_input()

print(f"The sum is {sum(x, y)}")
print(f"The difference is {sub(x, y)}")
print(f"The product is {mul(x, y)}")
print(f"The quotient is {div(x, y)}")
