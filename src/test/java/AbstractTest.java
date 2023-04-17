import org.example.abstracttest.MediaFile;
import org.example.abstracttest.MusicFile;
import org.example.abstracttest.VideoFile;
import org.junit.jupiter.api.Test;

public class AbstractTest {
    @Test
    public void testMusicFile() {
        MediaFile file = new MusicFile();
        checkFileType(file);
    }
    @Test
    public void testVideoFile() {
        MediaFile file = new VideoFile();
        checkFileType(file);
    }

    private void checkFileType(MediaFile file) {
        if (file instanceof MusicFile musicFile) {
            musicFile.play(100);
        } else if (file instanceof VideoFile videoFile) {
            videoFile.play();
        }
    }

}
