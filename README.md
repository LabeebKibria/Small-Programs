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
