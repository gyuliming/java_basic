package boardTest;

public class BoardMain {
    public static void main(String[] args) {
        // 생성자 주입 방식 => Loose Coupling
        BoardManager boardManager = new BoardManager();
        BoardExample boards = new BoardExample(boardManager);
        boards.run();
    }
}
