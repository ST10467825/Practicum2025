# Music Playlist Manager 
A simple Android app for managine song playlists. 

![image](https://github.com/user-attachments/assets/68285451-b2eb-4c29-9645-f594df315672)

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







![Playlist View](https://github.com/user-attachments/assets/07850d39-dd50-43b1-a50f-9dc96b473c85)

