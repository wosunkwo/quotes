# quotes
DESCRIPTION
This application reads a json file that contains popular quotes and generates a random quote and outputs it. This is done by:
First reading the json file using Scanner.
Then parsing the file into a StringBuilder variable. 
Then using Gson to convert that string of JSON data into an array of quote class instances.
Then passing that newly created array into a random quote generator function, that uses java Random class to generate a random index between 0 and the size of the array exclusively. then returning the quote instance at that index.
