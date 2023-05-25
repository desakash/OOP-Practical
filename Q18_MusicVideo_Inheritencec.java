package hello;

 class VideoTape {
     String title;
    protected int length;
    protected String format;

    public VideoTape(String title, int length, String format) {
        this.title = title;
        this.length = length;
        this.format = format;
    }
}

 class Movie extends VideoTape {
     String rating;

    public Movie(String title, int length, String format, String rating) {
        super(title, length, format);
        this.rating = rating;
    }
}

 class MusicVideo extends VideoTape {
    String artist;

    public MusicVideo(String title, int length, String format, String artist) {
        super(title, length, format);
        this.artist = artist;
    }
}
public class Q18
{
	public static void main(String[] args) {
	VideoTape tape = new VideoTape("The Godfather", 175, "VHS");
	System.out.println(tape.title);  // The Godfather
	System.out.println(tape.length);  // 175
	System.out.println(tape.format);  // VHS

	Movie movie = new Movie("The Godfather", 175, "VHS", "R");
	System.out.println(movie.title);  // The Godfather
	System.out.println(movie.length);  // 175
	System.out.println(movie.format);  // VHS
	System.out.println(movie.rating);  // R

	MusicVideo musicVideo = new MusicVideo("Thriller", 13, "VHS", "Michael Jackson");
	System.out.println(musicVideo.title);  // Thriller
	System.out.println(musicVideo.length);  // 13
	System.out.println(musicVideo.format);  // VHS
	System.out.println(musicVideo.artist);  // Michael Jackson

	
}}