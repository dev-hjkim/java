public class ControlWhile {
    public static void main(String[] args) {
        ControlWhile controlWhile = new ControlWhile();
//        controlWhile.whileLoop1();
//        controlWhile.whileBreak();
//        controlWhile.whileContinue();
        controlWhile.doWhile();
    }

    public void whileLoop1() {
        ControlSwitch control = new ControlSwitch();
        int loop = 0;
        while (loop < 12) {
            loop++;
            control.switchCalendar(loop);
        }
    }

    public void whileBreak() {
        ControlSwitch control = new ControlSwitch();
        int loop = 0;
        while (loop < 12) {
            loop++;
            control.switchCalendar(loop);
            if (loop == 6) break;
        }
    }

    public void whileContinue() {
        ControlSwitch control = new ControlSwitch();
        int loop = 0;
        while (loop < 12) {
            loop++;
            if (loop == 6) continue;
            control.switchCalendar(loop);
        }
    }

    public void doWhile() {
        ControlSwitch control = new ControlSwitch();
        int loop = 0;
        do {
            loop++;
            control.switchCalendar(loop);
        } while(loop < 12);
    }

}