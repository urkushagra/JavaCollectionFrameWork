import java.util.Vector;

public class MusicPlaylist {
    public static void main(String[] args) {
        Vector<String> playlist = new Vector<>();

        playlist.add("Shape of You");
        playlist.add("Blinding Lights");
        playlist.add("Levitating");

        System.out.println("🎶 Playlist: " + playlist);

        playlist.add("Calm Down");
        System.out.println("Added new song: " + playlist);

        // Play songs one by one
        for (String song : playlist) {
            System.out.println("Now Playing: " + song);
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }

        // Remove a song
        playlist.remove("Levitating");
        System.out.println("Updated Playlist: " + playlist);
    }
}
