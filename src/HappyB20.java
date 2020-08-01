public class HappyB20 {
    public static void main(String[] args) {
        System.out.println("I am happy with my instructor");
        happyMethod(178000);
    }
    public static void happyMethod(int salary){
        boolean isHappy=(salary>150000)?true:false;
        System.out.println(isHappy);
    }
}
