/**
 * This class contructs the object called from the AmplifiersApp and contains
 * the abstract methods the child classes will overwrite.
 * Parent class to InvertingAmplifier, NoninvertingAmplifier, and VdivAmplifier.
 * @author Cbs262
 * @author ms3442
 * @author mjb629
 */
public abstract class Amplifier
{
  /**
  * Holds the value for Resistance 1
  */
  static double rr1 = 0;
  /**
  * Holds the value for Resistance 2
  */
  static double rr2 = 0;
  /**
  * Contsructs the Amplifier object
  * @param r1 Resistance 1
  * @param r2 Resistance 2
  */
  public Amplifier(double r1, double r2)
  {
    rr1 = r1;
    rr2 = r2;
  }
  /**
  * Abstract method for child classes
  */
  abstract double getGain();
  /**
  * Abstract method for child classes
  */
  abstract String getDescription();
}
