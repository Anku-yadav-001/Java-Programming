public class StringFunctions {
    public static void main(String[] args) {

    //COncatination(+)
        String fname="aman";
        String lname="Yadav";
        String fullname=fname+" "+lname;
        System.out.println(fullname);

    //Length(.length())
        System.out.println(fullname.length());
    
    //charAt
        for(int i=0;i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }
    }
}
