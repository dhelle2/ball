package ball;

public class Soccer extends Ball implements Round {

   private boolean isTornUp;

   public void roll() {
     if(!isTornUp) {
       System.out.println("roll...");
     }
     else {
       System.out.println("too mishapen to roll.. maybe try bounding instead");
     }
   }

   public void bounce() {
     System.out.println("bounce!");
   }

   // TBD
   //public int radius() {}

}
