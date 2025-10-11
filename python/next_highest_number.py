def find_next_highest(n):
    """
    Finds the next highest number for the same set of digits.

    Args:
        n (int): The input number.

    Returns:
        int or None: The next highest number, or None if no such number exists.
    """
    digits = list(str(n))
    
    pivot = -1
    for i in range(len(digits) - 2, -1, -1):
        if digits[i] < digits[i+1]:
            pivot = i
            break
            
    if pivot == -1:
        return None
        
    swap_index = -1
    for j in range(len(digits) - 1, pivot, -1):
        if digits[j] > digits[pivot]:
            swap_index = j
            break
            
    digits[pivot], digits[swap_index] = digits[swap_index], digits[pivot]
    
    left_part = digits[:pivot+1]
    right_part = digits[pivot+1:]
    right_part.reverse()
    
    result_digits = left_part + right_part
    
    return int("".join(result_digits))

def get_user_input():
    while True:
        try:
            user_input = input("Enter a number to find the next highest number: ")
            # Check for negative numbers, as the code assumes positive numbers
            if int(user_input) <= 0:
                print("Please enter a positive number.")
                continue
            return int(user_input)
        except ValueError:
            print("Invalid input! Please enter a number.")

if __name__ == "__main__":
    number = get_user_input()
    next_highest = find_next_highest(number)
    
    if next_highest:
        print(f"The next highest number for {number} is {next_highest}")
    else:
        print(f"No higher number can be formed with the digits of {number}")

