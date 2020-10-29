# Assessment
JDK version - 1.8.0

Problem statement -
Given a collection of 5-digit ZIP code ranges 
(each range includes both their upper and lower bounds), provide an 
algorithm that produces the minimum number of ranges required to represent 
the same restrictions as the input.


Input criteria: 
format - [lowerBound, upperBound] [lowerBound, upperBound] .......
validation - input should not be empty 

Exception Handling : Main class throws exception when input is empty


Running the JAR file
C:\Users\harsh>java -jar C:\Users\harsh\Desktop\range_reducer.jar
Enter Input String :
[94133,94133] [94200,94299] [94600,94699]
94133, 94133 | 94200, 94299 | 94600, 94699 |
C:\Users\harsh>java -jar C:\Users\harsh\Desktop\range_reducer.jar
Enter Input String :
[94133,94133] [94200,94299] [94226,94399]
94133, 94133 | 94200, 94399 | 
