package ball;

public class Dough extends Ball implements Round,Edible {

   private boolean actuallyIsFlat;

   public void roll() {
     System.out.println("your dough is now flat, ready to bake!");
   }

   public void bounce() {
     try {
       tryToBounce();
     } catch(Exception e) {}
   }

   private void tryToBounce() throws ActuallyNotFlatException {
     if(!actuallyIsFlat) {
       System.out.println("wow.. dough doesn't bounce well ... :| ");
     }
     else {
       throw new ActuallyNotFlatException();
     }
   }

   // "Edible" requires this..
   public void eat() {
     System.out.println("I hope this was cooked first.. ok everyone except");
     System.out.println("the person that received this should stop using");
     System.out.println("using this object!");
   }

   //TBD
   //public int radius() 

}
