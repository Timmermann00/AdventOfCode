def calculate_total_distance(left_list, right_list):
    left_list_sorted = sorted(left_list)
    right_list_sorted = sorted(right_list)
    
    total_distance = sum(abs(l-r) for l,r in zip(left_list_sorted, right_list_sorted))
    
    return total_distance

f = open("01\data.txt", "r")
line1 = []
line2 = []

for lines in f:
    splitted_list = lines.split("  ")
    line1.append(int(splitted_list[0]))
    line2.append(int(splitted_list[1]))
    
total_distance = calculate_total_distance(line1, line2)
print("Total disctance:", total_distance)