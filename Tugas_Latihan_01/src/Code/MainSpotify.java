package Code;

import java.util.ArrayList;
import java.util.List;

public class MainSpotify {
    public static void main(String[] args) {
        List<MediaAudio> playlist = new ArrayList<>();
        playlist.add(new Lagu("Perfect", 263, "Ed Sheeran"));
        playlist.add(new Podcast("Teknologi Hari Ini", 1800, "Rina"));
        playlist.add(new Lagu("Hati-Hati di Jalan", 246, "Tulus"));

        for (MediaAudio m : playlist) {
            m.putarAudio();
        }
    }
}