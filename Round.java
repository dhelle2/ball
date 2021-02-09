package ball;

public interface Round {

   // this should really throw ActuallyNotFlatException :|
   // (see Dough.java)
   // but then it would take longer to get the Soccer Ball working!!
   // hmmph
   public void roll();

   public void bounce();

   //TBD
   //public float radius();

}
