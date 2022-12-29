class Main {
    public static void main(String[] args) {
        Enemy hewan = new Enemy();
        Darat singa = new Darat();
        Laut hiu = new Laut();
        Udara garuda = new Udara();
        
        hewan.attack();
        singa.walk();
        hiu.swim();
        garuda.fly();
    }
}

class Enemy {
    String name;
    int hp;
    int attackPoin;

    void attack(){
        System.out.println("Serang!");
    }
}

class Darat extends Enemy {
    void walk(){
        System.out.println("Berlari");
    }
}

class Laut extends Enemy {
    void swim(){
        System.out.println("Berenang");
    }
}

class Udara extends Enemy {
    void fly(){
        System.out.println("Terbang");
    }
}
