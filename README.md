OSAMAH KHALED AL_BATATI
ST10477069


🎵 Playlist App
A simple Android application built using Kotlin and ConstraintLayout. It allows users to navigate between a welcome screen and a song playlist screen, with functionality to view songs, artists, and their comments.

🏗️ Project Structure
MainActivity: Displays a welcome message and two buttons:

"Click To Playlist" navigates to the playlist screen.

"Exit" closes the application.

MainScreen: Displays:

Song name

Artist name

Comments

"Next" button to cycle through songs

"Playlist" button to return to MainActivity and send song data

📄 Layout Files
activity_main.xml
Background color: #658899

Components:

TextView: "Welcome To Playlist"

Button: "Click To Playlist"

Button: "Exit"

activity_main_screen.xml
Background color: #8C5050

Components:

TextView: Song name

TextView: Artist name

TextView: Comments

TextView: "Playerlist" label

Button: "Next"

Button: "Playlist" (expected but missing in layout, referenced in code)

🧠 Features
Welcome Screen:

Entry point for the user

Navigation to playlist view or app exit

Playlist Screen:

Cycles through predefined song details

Sends a formatted list of all songs and metadata to MainActivity (for future use)

⚠️ Known Issues
The playlistButton is referenced in MainScreen.kt but is not defined in activity_main_screen.xml. You should add this button to the layout for it to function correctly:

xml
Copy
Edit
<Button
    android:id="@+id/playlistButton"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Playlist"
    app:layout_constraintTop_toBottomOf="@+id/nextButton"
    app:layout_constraintStart_toStartOf="parent"
    app:layout_constraintEnd_toEndOf="parent" />
🚀 How to Run
Clone the repository or import it into Android Studio.

Make sure the required dependencies for AndroidX and Kotlin are installed.

Run the app on an emulator or device.

Explore song info by clicking Next and navigate with Playlist or Exit.

📦 Future Improvements
Add a real database or backend for dynamic playlists.

Enable playback of songs.

Improve UI with animations or media controls.

Fix missing constraints in layout (tools:ignore="MissingConstraints" is a temporary workaround).

📁 Packages
vcmsa.ci.scenario: Contains both MainActivity and MainScreen Kotlin files.
