public class Demo {
    public static void main(String[] args) {
        System.out.println("First creation");
        methodAd(3,5);
        swap(3,4);
    }
    public static void methodAd(int a, int b){
        int result=a+b;
    }
    public static void swap(int a, int b){
        int temp=0;
        temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
    }
}
