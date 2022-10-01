n=input("Enter: ")

kw=["break","case","continue","default","defer","else","for","func","goto","if","map","range","return","struct","type","var"]
if n in kw:
    print(n,"is a keyword")
else:
    print(n,"is not a keyword")
