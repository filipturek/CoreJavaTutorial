public class LearnStrings {
    static void main(String[] args) {
        String fruit = "apple";
        String anotherFruit = "apple";
        String vegetable = new String("broccoli");
        String anotherVegetable = new String("broccoli");
        System.out.println(fruit.equals(anotherFruit));
        System.out.println(fruit.contentEquals(anotherFruit));
        System.out.println(fruit == anotherFruit);
        System.out.println(vegetable.equals(anotherVegetable));
        System.out.println(vegetable.contentEquals(anotherVegetable));
        System.out.println(vegetable == anotherVegetable);

    }
}
