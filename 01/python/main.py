def read_data(filename):
    line1 = []
    line2 = []

    with open(filename, 'r') as file:
        for line in file:
            values = line.strip().split()
            if len(values) >= 2:
                line1.append(int(values[0]))
                line2.append(int(values[1]))
        line1.sort()
        line2.sort()

    return line1, line2

line1, line2 = read_data('../data.txt')

print("Line1 is:", line1)
print("Line2 is:", line2)