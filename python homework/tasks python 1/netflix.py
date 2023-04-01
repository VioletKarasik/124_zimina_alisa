def cost_n(x,y,z,cost):
    if (abs((x+y)-cost) < abs((x+z)-cost)) and (abs((x+y)-cost) < abs((z+y)-cost)):
        return "Alice and Bob can afford the subscription to Netflix"
    elif (abs((x+z)-cost) < abs((y+z)-cost)) and (abs((x+z)-cost) < abs((x+y)-cost)):
        return "Alice and Charlie can afford the subscription to Netflix"
    elif (abs((z+y)-cost) < abs((x+y)-cost)) and (abs((z+y)-cost) < abs((z+x)-cost)):
        return "Charlie and Bob can afford the subscription to Netflix"
    else:
        return "None of them can afford the subscription"

x = int(input("Enter Alice's amount of money: "))
y = int(input("Enter Bob's amount of money: "))
z = int(input("Enter Charlie's amount of money: "))
cost = int(input("Enter the cost of Netflix subscription: "))

print(cost_n(x,y,z,cost))