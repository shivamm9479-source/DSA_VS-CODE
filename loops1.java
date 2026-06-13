public class loops1 {
    public static void main(String args[]){
        int n = 234567;
        while(n > 0){
            int lastdigit = n%10;
            System.out.print(lastdigit);
            n = n/10;
        }
        System.out.println();
    }
    
}
