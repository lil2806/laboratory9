package nullpointerexpextion.com;

class example {
     public static String generateException(){
         String spider=null;
         return spider;



     }





}
public class pointer{
     public static void main(String [] args){
          try{

               String Lady =example.generateException();
               Lady.toString();


          }
          catch(java.lang.ArithmeticException e){
               System.out.println("values here of spider");
               e.printStackTrace();



          }
     }

}
