# quotes
DESCRIPTION
This application makes a request to a star wars api and gets back a random quote and displays it to the user. If the api doesnt return anything it reads a json file that contains popular quotes and generates a random quote and outputs it. This is done by:
First reading the json file using BufferedReader. 
Then using Gson to convert that BufferedReader of JSON data into an array of quote class instances.
Then passing that newly created array into a random quote generator function, that uses java Random class to generate a random index between 0 and the size of the array exclusively. then returning the quote instance at that index.

Running the program:
on your command line type "run ./gradlew run" to run the application
