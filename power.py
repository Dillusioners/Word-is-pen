#Importing OS package

import os

print("**********GYM TRAINER**********")
print("In physics, power is the amount of energy transferred by time. The unit of power is the watt, equal to one joule per second.")
#Checking if user is 18
age = int(input("Enter your age:- "))  # type: ignore
if age < 18:
  print("You are not even 18!! No need to go to gym.")
else:
  cal = int(input("Enter the amount of calorie you want to lose in a day:- "))
  time = int(input("Enter your practice time for each day in hours:- "))
  #Check if user is too energetic
  while time >= 6 and time < 0:
    time = int(input("Enter your practice time for each day in hours[MUST BE LESS THAN 6 AND MORE THAN 0]:- "))
  time *= 60 * 60
  power = cal/time
  #Calculating Money
  money = power * 100
  print("SO YOU NEED A TOTAL OF " , power , " POWER EACH DAY AND A TOTAL OF $", money , " EACH DAY.")

