package com.xworkz.tarun.internal;

class Food {
    String describe() {
        return "Food";
    }
}

class Snack extends Food {
    String describe() {
        return "Snack is a " + super.describe();
    }
}

class Biscuit extends Snack {
    String describe() {
        return "Biscuit is a " + super.describe();
    }
}

class GoodDayBiscuit extends Biscuit {
    String describe() {
        return "GoodDayBiscuit is a " + super.describe();
    }
}

