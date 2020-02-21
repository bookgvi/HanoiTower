package Alogoritm;

import Execute.Execute;

public class HanoiTower implements Execute<Object> {
    private int discNum;
    private long iterCount = 0;

    public HanoiTower(int discNum) {
        this.discNum = discNum;
    }

    private void makeHanoi(int discNum, String from, String inter, String to) {
        this.iterCount++;
        if (discNum == 1) {
//            System.out.println("Disc 1 from " + from + " to " + to); // from --> to
            return;
        }
        makeHanoi(discNum - 1, from, to, inter); // from --> inter
//        System.out.println("Disk " + discNum + " from " + from + " to " + to);

        makeHanoi(discNum - 1, inter, from, to);  // inter --> to
    }

    /**
     * Запуск алгоритма для расчетов
     *
     * @return -  возвращает массив
     */
    @Override
    public Object execute() {
        final String to = "C";
        final String inter = "B";
        final String from = "A";
        this.makeHanoi(this.discNum, from, inter, to);
        return this.iterCount;
    }
}
