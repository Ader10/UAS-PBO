class Main {
    public static void main(String[] args) {
        // Create objects
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();
        // call all methods
        d.eat();
        d.play();
        d.walk();
        c.play();
        c.walk();
        c.eat();
        System.out.println("Cat name: " + d.getNaame());
        a.eat();
        a.walk();
        System.out.println("Number of Legs(Fish): " + a.legs);
        e.eat();
        e.walk();
        System.out.println("Number of Legs(Spider): " + e.legs);
        p.play();
        p.setName("Ponnu");
        System.out.println("Cat Name: " + p.getNaame());
        // Casting objects
        Fish fish = (Fish) a;
        Spider spider = (Spider) e;
        Cat cat = (Cat) p;
        fish.play();
        fish.eat();
        spider.eat();
        cat.eat();
    }
}

abstract class Animal {
    protected int legs;
    /**
     * constructor
     */
    protected Animal(int legs) {
        super();
        this.legs = legs;
    }
    /**
     * default constructor
     */
    protected Animal() {
        this.legs = 0;
    }
    // abstract method
    public abstract void eat();
    // walk method
    public void walk() {
        System.out.println("Animal is walking using " + legs + " legs");
    }
}

class Spider extends Animal {
    /**
     * default constructor
     */
    protected Spider() {
        super(8);
    }
    @Override
    public void eat() {
        System.out.println("Spider eating");
    }
}

interface Pet {
    public String getNaame();
    public void setName(String name);
    public void play();
}

class Cat extends Animal implements Pet {
    public String name;
    /**
     * constructor
     * 
     * @param name
     */
    protected Cat(String name) {
        super(4);
        this.name = name;
    }
    /**
     * default constructor
     */
    protected Cat() {
        this("");
    }
    @Override
    public String getNaame() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void play() {
        System.out.println("Playing cat");
    }
    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }
}

class Fish extends Animal implements Pet {
    @Override
    public String getNaame() {
        return "Fish";
    }
    @Override
    public void setName(String name) {
    }
    @Override
    public void play() {
        System.out.println("Fish is playing.");
    }
    @Override
    public void eat() {
        System.out.println("Fish is eating...");
    }
    public void walk() {
        System.out.println("Fish can't walk...and don't have legs");
    }
}
