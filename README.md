# 2-5-7-Writing-Methods

- Create a Movie class so you can add another type of media to your library.  
-- Movies should have a title, a duration (for example 1.75 hours), and a rating.  
-- It should implement the same methods as your Book class.  
- Modify MediaLib to store and display a movie.  
-- Create a new private instance variable Movie movie.  
-- Add a new method addMovie.  
-- Modify the toString method to also show any movie that has been defined.  
- Finally, add a movie to your library in the runner class. Confirm that the equals and toString methods work for your new class.  


# 2-5-8 Static Variables and Methods

- Similar to Book and Movie, create a Song class so you can store music in your library.  
--Songs should have a title and a rating.  
--The class should implement the same methods as the Book and Movie classes.  
- Modify your MediaLib class so it can store and display a song.  
--Create a private instance variable to store the song.  
--Create a method to add a song.  
--Modify the toString method to show a song in addition to a book and movie.  
- Finally, add a song to your library. Confirm that the equals and toString methods work for your new class. Pay particular attention to the static methods and variables you added in this activity.  
- Tally Individual Items  
--In addition to tracking the total items, individually track the number of books, the number of movies, and the number of songs that you have added to all of your libraries.  

# 2-5-9 Scope and Access

- Design and implement a class to handle dates. 
--Import the Calendar library. 
```
import java.util.Calendar;
```
--Use the following algorithm in a static method of your new class:
```
Calendar cal = Calendar.getInstance();
String dateTimeStr = cal.getTime().toString();
```
- Return dateTimeStr which contains the current date and time.
