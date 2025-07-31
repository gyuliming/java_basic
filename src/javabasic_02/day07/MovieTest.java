package javabasic_02.day07;

public class MovieTest {
    public static void main(String[] args) {
        Movie Avatar = new Movie();
        Avatar.title = "아바타";
        Avatar.releaseDate = "2022.12.14";
        Avatar.hero = "제이크 설리";
        Avatar.genre = "액션";
        Avatar.runningTime = 192;
        Avatar.age = "12세";

        System.out.printf("""
                영화제목 : %s
                개봉일 : %s
                주인공 : %s
                장르 : %s
                러닝타임 : %d
                등급 : %s
                """,
                Avatar.title, Avatar.releaseDate, Avatar.hero, Avatar.genre, Avatar.runningTime, Avatar.age);

        System.out.println("==============================");

        // Movie 클래스 타입으로 영화 3편을 배열 movieList에 저장
        // 저장한 영화의 제목을 iter 방법으로 출력

        Movie[] movieList = new Movie[3];
        Movie movie1 = new Movie();
        movie1.title = "신과함께";
        Movie movie2 = new Movie();
        movie2.title = "좀비딸";
        Movie movie3 = new Movie();
        movie3.title = "범죄도시";

        movieList[0] = movie1;
        movieList[1] = movie2;
        movieList[2] = movie3;

        for (Movie movie : movieList) {
            System.out.print(movie.title + " ");
        }

    }
}
