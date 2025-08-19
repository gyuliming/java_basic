package java_advanced_01.day17.lambdaEx.lambda03;

public class Button {
    // 정적 멤버 인터페이스
    public static interface ClickListener {
        void onClick();
    }

    private ClickListener clickListener;

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void click() {
        this.clickListener.onClick();
    }

    public static void main(String[] args) {
        Button buttonOk = new Button();
        Button buttonCancel = new Button();

        // Ok 버튼 객체에 람다식 주입
        buttonOk.setClickListener(
                () -> {
                    System.out.println("Ok 버튼 클릭");
                }
        );

        // Cancel 버튼 객체에 람다식 주입
        buttonCancel.setClickListener(
                () -> {
                    System.out.println("Cancel 버튼 클릭");
                }
        );

        // Ok 버튼 클릭
        buttonOk.click();
        // Cancel 버튼 클릭
        buttonCancel.click();

        for (int i = 0; i < 100; i++) {
            buttonCancel.click();
        }

    }
}
