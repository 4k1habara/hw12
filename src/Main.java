public class Main {
    public static void main(String[] args) {
        Author aI = new Author("Alexandr", "Ivanov");
        Book theWorld = new Book("The World", aI, 1989);
        Author fG = new Author("Fedor", "Grigoryevich");
        Book redSky = new Book("Red Sky", fG, 1999);
        redSky.setYear(2004);
    }
}