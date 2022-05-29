class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println("I am running this from terminal \n");

        World w = new World("Earth");
        w.sayName();
    }

}

class World {
    static String universeName = "my-universe";
    String name;

    World(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.println("From world main method");
    }

    void sayName(){
        System.out.println("I am from universe: "+ universeName);
        System.out.println("My planet is: "+ name);
    }
}