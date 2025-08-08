package javabasic_02.day11.polymorphism_assignment2;

public class Video extends Content {
    String genre;

    Video() {}

    Video(String title, String genre) {
        super(title);
        this.genre = genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public void totalPrice() {
        switch(this.genre) {
            case "new" -> setPrice(2000);
            case "comic" -> setPrice(1500);
            case "child" -> setPrice(1000);
            default -> setPrice(500);
        }
    }
}
