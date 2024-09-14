import random
user_win =0
computer_win =0
options = ["Snake","Gun", "Water"]
while True:
    user_pick = input("Choose one from any of them Snake/Gun/Water or q for quit ")
    if user_pick == "q":
        print("Thank you")
        break
    if user_pick not in options:
        break
    random_number = random.choice(options)
    computer_pick= random_number
    print("Computer pick",computer_pick+".")
    if user_pick=="Snake" and computer_pick == "Water":
        print("You won")
        user_win +=1
    elif user_pick == "Water" and computer_pick == "Gun":
        print("YOu won")
        user_win +=1
    elif user_pick == "Gun" and computer_pick == "Snake":
        print ("You won")
        user_win +=1
    
    else:
        print("Computer win")
        computer_win +=1
    
print("You won",user_win,"times")
print("Computer won",computer_win,"times")
print("Goodbye")
