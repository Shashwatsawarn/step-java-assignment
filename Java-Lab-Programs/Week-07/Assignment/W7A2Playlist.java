import java.util.Arrays;
public class W7A2Playlist {
    static class Playlist {
        private final String[] songs;
        private int count = 0;
        Playlist(int size) { songs = new String[size]; }
        void addSong(String song) { if (count < songs.length) songs[count++] = song; }
        String[] getSongs() { return Arrays.copyOf(songs, count); }
        int getSongCount() { return count; }
    }
    public static void main(String[] args) {
        Playlist p = new Playlist(10);
        p.addSong("Song A"); p.addSong("Song B");
        String[] copy = p.getSongs(); copy[0] = "Hacked";
        System.out.println(Arrays.toString(p.getSongs()));
        System.out.println(p.getSongCount());
    }
}
