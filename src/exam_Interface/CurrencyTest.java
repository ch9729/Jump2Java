package exam_Interface;

class Currency {
     double amount;
     String notation;

    public Currency(double amount, String notation) {
        this.amount = amount;
        this.notation = notation;
    }

    public String toString() {
        return String.format("currency: %.2f %s", amount , notation);
    }
}

class KRW extends Currency {
    public KRW(double amount, String notation) {
        super(amount, notation);
    }

    @Override
    public String toString() {
        return String.format("KRW: %.2f %s", amount , notation);
    }
}

class USD extends Currency {
    public USD(double amount, String notation) {
        super(amount, notation);
    }

    @Override
    public String toString() {
        return String.format("USD: %.2f %s", amount , notation);
    }
}

class EUR extends Currency {
    public EUR(double amount, String notation) {
        super(amount, notation);
    }

    @Override
    public String toString() {
        return String.format("EUR: %.2f %s", amount , notation);
    }
}

class JPY extends Currency {
    public JPY(double amount, String notation) {
        super(amount, notation);
    }

    @Override
    public String toString() {
        return String.format("JPY: %.2f %s", amount , notation);
    }
}

public class CurrencyTest {

    public static void main(String[] args) {
        KRW krw = new KRW(1500,"원");
        USD usd = new USD(1500,"달러");
        EUR eur = new EUR(1500,"유로");
        JPY jpy = new JPY(1500,"엔");

        Currency[] c = new Currency[] {krw, usd, eur, jpy};

        for (Currency currency : c) {
            System.out.println(currency.toString());
        }
    }
}
