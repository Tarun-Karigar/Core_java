public class String_01 {
    public static void main(String[] args) {
     String name="Tarun";
     int n=name.length();
        System.out.println(n);
        for(int i=0;i<n;i++){
//        System.out.println("The reverse of the name is "+name.charAt(n-1)+name.charAt(n-2)+name.charAt(n-3)+name.charAt(n-4)+name.charAt(0 ));
            System.out.print(name.charAt(n-i));
    }
}
}