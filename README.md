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
 




