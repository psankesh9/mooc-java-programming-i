public class Song {
    private String artist;
    private String title;
    private int lengthInSeconds;

    public Song(String artist, String title, int lengthInSeconds) {
        this.artist = artist;
        this.title = title;
        this.lengthInSeconds = lengthInSeconds;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Song)) {
            return false;
        }
        Song other = (Song) obj;
        return this.artist.equals(other.artist) && this.title.equals(other.title) && this.lengthInSeconds == other.lengthInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.title + " (" + this.lengthInSeconds + "s)";
    }

    public static void main(String[] args) {
        Song jackSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);
        Song anotherSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);

        if (jackSparrow.equals(anotherSparrow)) {
            System.out.println("Songs are equal.");
        }

        if (jackSparrow.equals("Another object")) {
            System.out.println("Strange things are afoot.");
        }
    }
}
