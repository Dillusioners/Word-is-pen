#Author - Jayspray
#Team - Dillusioners
#Word - finish
#Info - This program finishes any directory


import os
directory = ""
while True:
    #Getting directory
    directory = input("Enter the directory : \nElse press enter to exit : ")
    #Exiting if user gives ""
    if directory == "":
        print("Bye!")
        exit()
    #Asking for input again if directory is non-existant
    elif os.path.exists(directory) == False:
        print("Please enter valid directory")
    #Else deleting directory or file
    else:
        #Handling PermissionError
        try:
            print("Ok finishing directory :>")
            os.remove(directory)
            break
        except PermissionError as e:
            print("Access Denied :(")
            break
print("Program has ended")

    