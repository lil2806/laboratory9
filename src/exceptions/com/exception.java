package exceptions.com;

 class exception extends Exception  {
    public exception(String txt) {
        super(txt);
    }}
public class exceptions {
    public static void Method(int z) lessthan1Exception ,greaterthan1Exception ,Equals0Exception{
        if(z<0){
            throw new lessthan1Exception("The number Is Less Than 0");
        }
        else if (z>1){
            throw new greaterthan1Exception("The number Is Greater Than 1");
        }
        else if(z==0){
            throw new Equals0Exception("The number Is equal To 0");
        }
    }
    public static  void main(String[]args) throws greaterthan1Exception, lessthan1Exception, Equals0Exception {
        try {
            Method(0);
        }
        catch (greaterthan1Exception | Equals0Exception |lessthan1Exception e ){
            System.out.println(e);
        }

    }

}
