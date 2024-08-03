public class Money {
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        if (cents >= 100) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money addition) {
        int newEuros = this.euros + addition.euros();
        int newCents = this.cents + addition.cents();
        if (newCents >= 100) {
            newEuros++;
            newCents -= 100;
        }
        return new Money(newEuros, newCents);
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        }
        if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        }
        return false;
    }

    public Money minus(Money decreaser) {
        int newEuros = this.euros - decreaser.euros();
        int newCents = this.cents - decreaser.cents();
        if (newCents < 0) {
            newEuros--;
            newCents += 100;
        }
        if (newEuros < 0) {
            return new Money(0, 0);
        }
        return new Money(newEuros, newCents);
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public static void main(String[] args) {
        Money a = new Money(10, 0);
        Money b = new Money(3, 50);

        Money c = a.minus(b);

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);  // 6.50e

        c = c.minus(a); // 0.00e

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);  // 0.00e

        Money firstMoneyObject = new Money(7, 50);
        Money secondMoneyObject = new Money(1, 60);
        Money firstPlusSecond = firstMoneyObject.plus(secondMoneyObject);
        System.out.println(firstPlusSecond); // expected: 9.10e
    }
}
