public enum Meal {
    Burger(200),
    Rols(400),
    Pizza(300),
    Shawarma(120),
    Shashlik(150);
    private int price;

    Meal(int price) {
        this.price = price;
    }


    public int compareTo(int i) {
        return +price;
    }
    }

