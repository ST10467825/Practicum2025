# Music Playlist Manager 
A simple Android app for managine song playlists. 

Song addition to playlist

![image](https://github.com/user-attachments/assets/fd6c98a6-017e-422a-a645-72406f5fb5f2)


## Features ✨
- Add up to 4 songs with details:
  - Song Title
  - Artist name
  - Rating (0-5)
  - Comments
- View complete playlist with all details
- Calculate average rating of all songs
- Simple and intuitive UI
- Robust error handling with user-friendly messages


## Installation 📲
### Prerequisites
- Android Studio (latest version recommended)
- Android device or emulater (API 26+)

### Steps
1. Clone the repository: ![Repository](https://github.com/ST10467825/Practicum2025)
2. Open the project in Android Studio
3. Build the project (Build > Make Project)
4. Run on emulator or physical device:
     - Click the "Run" button (green arrow)
     - Select your preferred device


### Usage Guide
1. Main Screen:
   - Fill in song details
   - Click "Add to playlist"
   - Repeat until playlist is full (max 4 songs)
2. View playlist
   - Click "View playlist" to see all added songs
   - Each entry shows title, artist, rating, and comment
3. Average Rating
   - In playlist view, click "Calculate Average Rating"
   - Toast message will display the average
4. Exit App
   - Click "Exit app" to close the application
  
## FAQ❓
### Q: Why can I only add 4 songs?
A: This was specifically done to keep the playlist small and light on system resources

### Q: My ratings aren't being accepted. Why?
A: Ratings must be numbers between 0 and 5 (inclusive). Decimals are allowed (e.g., 4.5).

### Q: Where is the data stored?
A: The app uses in-memory storage (parallel arrays) during runtime. Data is not persisted between app restarts.

### Q: How do I clear the playlist? 
A: Currently, you need to restart the app to clear the playlist. Future versions may include a clear button.

------------------------------------------------------------------------------------------------------------

*Developed by Kgomotso Mbele for HAW1 IMAD5112 - 2025*


## Screenshots






View the playlist and calculate average rating

![Playlist View](https://github.com/user-attachments/assets/07850d39-dd50-43b1-a50f-9dc96b473c85)


Full Android studio with Bluestacks emulating phone
Android Studio emulator was not working so I used Bluestacks to emulate my application and conduct testing

![image](https://github.com/user-attachments/assets/62885bb6-ef60-42e3-bc2d-ddb45f9b3641)


Some of the code to add songs to the playlist
Firstly, the code checks to see if there is even any input from the user and puts out an error toast if it is empty.
Once that check is complete, then it proceedes with accepting input and handling it, adding user input into the arrays and handling potential error.s

![image](https://github.com/user-attachments/assets/eb759f0b-2572-4930-a0d6-bcd748995617)


Some of the code for displaying the playlist
Here, the code first checks if the global arrays where the content would be is empty, if empty, displays toast, if not, populates what is in them.
From there, the average rating can be calculated and displayed

![image](https://github.com/user-attachments/assets/115425e5-8b48-4f4b-9083-fa58dfd08080)

