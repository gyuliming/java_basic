package javabasic_02.day11_12.inheritance.test0806.test01;

public class Movie {
    String Title;
    String Genre;

    public void setTitle(String name) {
        this.Title = name;
    }

    public void setGenre(String genre) {
        this.Genre = genre;
    }

    public void play() {
        System.out.println(Title + "(" + Genre + ")" + " 상영중입니다.");
    }



}
