
# Creating a dictionary
from operator import le


person = {"name": "divyanshu",
          "fav_color": "brown"}
print (person)
print (person["name"])
print (person["fav_color"])
print(len(person))
#replacing value
person["fav_color"] ="red"
print (person["fav_color"])
#adding new key
person["age"] = 20
print (person["age"])
