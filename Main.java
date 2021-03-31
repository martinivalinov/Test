public class Main {

    public static void main(String[] args) {
        int a,b,h,result;
        if(args.length != 3){
            System.out.println("Invalid arguments");
        }

        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        h = Integer.parseInt(args[2]);

        result = ((a+b)*h)/2;
        System.out.println("Area: " + result);
    }
}
