import java.util.ArrayList;
import java.util.HashMap;

public class Atm {

    private int fifty = 50;
    private int hundred = 100;
    private int fiveHundred = 500;
    private int thousand = 1000;
    private int fiveThousand = 5000;
    private HashMap<Integer, Integer> banknotes;
    //конструктор
    Atm() {
        banknotes = new HashMap<Integer, Integer>();
        banknotes.put(fifty, 0);
        banknotes.put(hundred, 0);
        banknotes.put(fiveHundred, 0);
        banknotes.put(thousand, 0);
        banknotes.put(fiveThousand, 0);
    }

    //методы
    public int getFifty() {
        return banknotes.get(fifty);
    }
    public int getHundred() {
        return banknotes.get(hundred);
    }
    public int getFiveHundred() {
        return banknotes.get(fiveHundred);
    }
    public int getThousand() {
        return banknotes.get(thousand);
    }
    public int getFiveThousand() {
        return banknotes.get(fiveThousand);
    }

    public void load(int fiftyCount, int hundredCount, int fiveHundredCount, int thousandCount, int fiveThousandCount) {
        banknotes.put(fifty, banknotes.get(fifty) + fiftyCount);
        banknotes.put(hundred, banknotes.get(hundred) + hundredCount);
        banknotes.put(fiveHundred, banknotes.get(fiveHundred) + fiveHundredCount);
        banknotes.put(thousand, banknotes.get(thousand) + thousandCount);
        banknotes.put(fiveThousand, banknotes.get(fiveThousand) + fiveThousandCount);
    }
    public boolean give(int sum) {
        int fiftyCount = this.getFifty();
        int hundredCount = this.getHundred();
        int fiveHundredCount = this.getFiveHundred();
        int thousandCount = this.getThousand();
        int fiveThousandCount = this.getFiveThousand();

        ArrayList<Integer> banknotesForSum = new ArrayList<Integer>();

        while (sum >= fiveThousand & fiveThousandCount > 0) {
            sum -= fiveThousand;
            fiveThousandCount--;
            banknotesForSum.add(fiveThousand);
        }

        while (sum >= thousand & thousandCount > 0) {
            sum -= thousand;
            thousandCount--;
            banknotesForSum.add(thousand);
        }

        while (sum >= fiveHundred & fiveHundredCount > 0) {
            sum -= fiveHundred;
            fiveHundredCount--;
            banknotesForSum.add(fiveHundred);
        }

        while (sum >= hundred & hundredCount > 0) {
            sum -= hundred;
            hundredCount--;
            banknotesForSum.add(hundred);
        }

        while (sum >= fifty & fiftyCount > 0) {
            sum -= fifty;
            fiftyCount--;
            banknotesForSum.add(fifty);
        }

        if (sum == 0) {
            banknotes.put(fifty, fiftyCount);
            banknotes.put(hundred, hundredCount);
            banknotes.put(fiveHundred, fiveHundredCount);
            banknotes.put(thousand, thousandCount);
            banknotes.put(fiveThousand, fiveThousandCount);
            return true;
        }
        return false;
    }
}