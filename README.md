# Small-Programs
Short programs I made to solve problems from assignments and competitions in high school

**Meeting.Java Program Purpose and Functionality**
- The program will output a time to schedule a meeting at the earliest instance everyone is free
  1. Takes an integer **numSets** from the data file denoting the data sets
  2. Next take an integer **row** to create a row*16 character matrix
  3. Loops through the strings in the data file to create the matrix
  4. Loops through every row marking instances of "-" which marks free time
  5. Check that index position with the whole column to see if every entry matches "-"
  6. Once it finds that it will schedule the time using Javas **Date and time class**
  7. The last part is just formatting the output correctly on the terminal

**Interview.Java Program Purpose and Functionality**
- Orders given candidates from most likely prospect to least likely prospect
  1. Takes an integer **numSets** from the data file denoting the data sets that follow
  2. Will loop through numSets to continue reading the data file
  3. Takes an integer **size** denoting the number of candidates to be ordered that follow
  4. Creates a **Candidate** object with information scanned in the data file
  5. Will then sort Candidates using the **compareTo()**(whose logic was created manually)
  6. Print the sorted list of candidates for the current set
  - Candidate Class Functionality
    1. Initializes a Candidate object with a **name, experience, problem-solving, and communication scores**.
    2. **getName()** returns name of the candidate
    3. Creates a **compareTo()** by implementing the Comparable interface
    4. Candidates are sorted based on the sum of experience, problem-solving, and communication scores.
        If the total scores are equal, candidates are further sorted by experience, problem-solving, and communication individually.
        If all scores are equal, candidates are finally sorted by name.

**ProductName.Java Program Purpose and Functionality**
- this program reads a set of product names from a file, converts them to lowercase, and checks if the characters in each name are in non-decreasing order. Depending on the result, it prints either an approval or rejection message for each product name
  1. Reads the integer **size** from the file, representing the number of product names to process.
  2. Iterates through each product name based on the value of size.
  3. Reads a product name from the file, converts it to lowercase, and stores it as a character array (**char[]**)
  4. Iterates through each character of the product name.
  5. Compares adjacent characters to check if the name is in non-decreasing order.
  6. If a character is greater than the next one, the product name is rejected, and a message is printed. The loop breaks at this point.
     If the loop completes without rejection, and the last character is less than the one before it, the product name is approved, and a corresponding message is printed.
  7. The program prints either "REJECTED BY COMMITTEE: Back to the drawing board!" or "APPROVED BY COMMITTEE: It's a go!" based on the sorting criteria of the product name.

**SupplyOrder.Java Program Purpose and Functionality**
- The purpose of the provided Java program is to read a supply order from a file, process the information for each supply item, and print a representation of the supply order
  1. Reads the integer **size** from the file, representing the number of supply items in the order.
  2. Initializes two arrays, **num** to store the quantity of each item, and **item** to store the names of the items.
  3. Prints **"ORDER_START"** to indicate the start of the supply order.
  4. Iterates through each line in the file, representing a supply item.
  5. Splits each line into an array of strings using **"x" as the delimiter**, where the first element represents the quantity **(num[i])**, and the second element represents the item name **(item[i])**.
  6. Converts the quantity from string to integer using **Integer.parseInt**.
  7. Prints the item name a number of times equal to its quantity, forming part of the supply order
  8. Prints "ORDER_END" to indicate the end of the supply order
 
**Boss.Java Program Purpose and Functionality**
- process information about a list of names and their hierarchical relationships in a workplace. It reads data from a file, constructs a representation of the hierarchical structure, and performs checks to determine the boss of a specified person.
  1. Reads the integer **size** from the file, representing the number of names.
  2. Initializes an ArrayList **(names)** to store the names
  3. Iterates through each line in the file, adding each name to the ArrayList names.
  4. Reads the integer **checks** from the file, representing the number of checks to be performed.
  5. Iterates through each check.
  6. Reads a person's name from the file.
  7. Searches for the person's name in the names ArrayList.
        If the person is found and is the first in the list (j == 0), it prints "no boss" because there is no boss.
        If the person is found and not the first in the list, it prints the name of the person's boss (names.get(j - 1))
