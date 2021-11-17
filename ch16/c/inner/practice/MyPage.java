public class MyPage {
    static InputBox input;
    public static void main(String[] args) {
        MyPage myPage = new MyPage();
        myPage.setUI();
        myPage.pressKey();
    }

    public void setUI() {
        input = new InputBox();
        KeyEventListener keyEventListener = new KeyEventListener () {
            public void onKeyDown() {
                System.out.println("Key Down");
            }
            public void onKeyDown() {
                System.out.println("Key Up");
            }
        };

        input.setKeyListener(keyEventListener);
    }

    public void pressKey() {
        input.listenerCalled(InputBox.KEY_DOWN);
        input.listenerCalled(InputBox.KEY_UP);
    }
}