interface MediaPlayer {
    void play();
    void pause();
    void stop();
}

class AudioPlayer implements MediaPlayer {
    public void play() {
        System.out.println("Playing audio (MP3)...");
    }
    
    public void pause() {
        System.out.println("Audio paused.");
    }
    
    public void stop() {
        System.out.println("Audio stopped.");
    }
}

class VideoPlayer implements MediaPlayer {
    public void play() {
        System.out.println("Playing video (MP4)...");
    }
    
    public void pause() {
        System.out.println("Video paused.");
    }
    
    public void stop() {
        System.out.println("Video stopped.");
    }
}

class StreamingPlayer implements MediaPlayer {
    public void play() {
        System.out.println("Playing streaming content...");
    }
    
    public void pause() {
        System.out.println("Streaming paused.");
    }
    
    public void stop() {
        System.out.println("Streaming stopped.");
    }
}

public class Main {
    public static void main(String[] args) {
        MediaPlayer audioPlayer = new AudioPlayer();
        MediaPlayer videoPlayer = new VideoPlayer();
        MediaPlayer streamingPlayer = new StreamingPlayer();
        System.out.println("AudioPlayer Demo:");
        audioPlayer.play();
        audioPlayer.pause();
        audioPlayer.stop();
        System.out.println();
        System.out.println("VideoPlayer Demo:");
        videoPlayer.play();
        videoPlayer.pause();
        videoPlayer.stop();
        System.out.println();
        System.out.println("StreamingPlayer Demo:");
        streamingPlayer.play();
        streamingPlayer.pause();
        streamingPlayer.stop();
    }
}
