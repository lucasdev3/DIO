idade = input("Digite a idade: ")

while idade < 0:
    print("Idade invalida")
    idade = input("Digite a idade: ")

if idade <= 5:
    print("Ola mundo 1")
elif idade <= 10:
    print("Ola mundo 2")
elif idade <= 14:
    print("Ola mundo 3")
else:
    print("Ola mundo 4")