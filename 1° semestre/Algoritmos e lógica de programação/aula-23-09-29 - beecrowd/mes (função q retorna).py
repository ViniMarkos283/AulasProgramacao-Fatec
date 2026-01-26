def mes_extenso(num):
    if num == 1:
        return'January'
    elif num == 2:
        return'February'
    elif num == 3:
        return'March'
    elif num == 4:
        return'April'
    elif num == 5:
        return'May'
    elif num == 6:
        return'June'
    elif num == 7:
        return'July'
    elif num == 8:
        return'August'
    elif num == 9:
        return'September'
    elif num == 10:
        return'October'
    elif num == 11:
        return'November'
    elif num == 12:
        return'December'

num = int(input())

print(mes_extenso(num))

