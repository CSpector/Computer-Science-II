/**
 * NoninvertingAmplifier is called from AmplifiersApp and constructs an object
 * This class extends the Amplifier class.
 * @author Cbs262
 * @author ms3442
 * @author mjb629
 */
public class NoninvertingAmplifier extends Amplifier
{
  /**
  * Holds the value of the gain
  */
   static double gain = 0;
   /**
   * Holds the value for Resistance 1
   */
   static double rr1 = 0;
   /**
   * Holds the value for Resistance 2
   */
   static double rr2 = 0;
   public NoninvertingAmplifier(double r1, double r2)
   {
     super(r1,r2);
     rr1 = r1;
     rr2 = r2;
   }
   /**
   * getGain calculates the gain
   * @Override
   * @return The gain
   */
   public double getGain()
   {
     gain = 1 + (rr2/rr1);
     return gain;
   }
   /**
   * @Override
   * @return Description of the Amplifier and its Resistance values
   */
   public String getDescription()
   {
     return "NoninvertingAmplifier: " + "R1 =  " + rr1 + "," + "R2 = " + rr2;
   }
 }
