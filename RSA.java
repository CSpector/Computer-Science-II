import java.lang.Math;
import java.util.Random;
import java.math.BigInteger;
/** 
	Encrypts and Decrypts a message using RSA encryption
	@author Brandon Salter
	@author Colton Spector	
*/
public class RSA 
{
	/**
		Will be used as the e value when generating the key
	*/
	BigInteger e;
	
	/**
		Will be used as the d value when generating the key
	*/
	BigInteger d;
	
	/**
		Used as something to compare values to when checking for a remainder
	*/
	BigInteger ZERO = new BigInteger("0");
	
	/**
		Will be used as the n value when generating the key
	*/
	BigInteger n;
	
/**
	Generates a randomized key that will be used to encrypt the message
	@param bits The amount of bits to be used when generating a key
*/
  public void GenerateKeys(int bits)
  {
    Random rand = new Random();
    BigInteger randomPrimeQ = BigInteger.probablePrime(bits, rand);
    BigInteger randomPrimeP = BigInteger.probablePrime(bits, rand);
	n = randomPrimeP.multiply(randomPrimeQ);
	BigInteger GCD = randomPrimeP.gcd(randomPrimeQ);
	BigInteger totP = randomPrimeP.subtract(BigInteger.ONE);
	BigInteger totQ = randomPrimeQ.subtract(BigInteger.ONE);
	BigInteger tot = totP.multiply(totQ);
	e = BigInteger.probablePrime(bits, rand);
	boolean firstBool = false;
	boolean secondBool = false;
	boolean thirdBool = false;
	boolean allBool = false;
	while (allBool == false)
	{
	e = new BigInteger(bits,100, rand);
	BigInteger Remainder = e.remainder(tot);
	if (Remainder.compareTo(ZERO) == -1 || Remainder.compareTo(ZERO) == 1)
		{
			thirdBool = true;
		}
	if (e.compareTo(BigInteger.ONE) == 1)
	{
		firstBool = true;
	}
	if (e.compareTo(tot) == -1)
	{
		secondBool = true;
	}

	if (firstBool && secondBool && thirdBool)
	{
		allBool = true;
	}
	d = e.modInverse(tot);
	}
	
	
  }
  
  /**
	Encrypts the message
	@param input The message to be encrypted
	@return The encrypted message
  */
  public BigInteger Encrypt(BigInteger input)
  {
	  if (n == null || d == null)
	  {
		  return null;
	  }
	  BigInteger publicFinal = input.modPow(e, n);
	  return publicFinal;
  }
  
  /**
	Decrypts the message
	@param output The encrypted message that needs to be decrypted
	@return The decrypted message
  */
  public BigInteger Decrypt(BigInteger output)
  {
	  if (n == null || d == null)
	  {
		  return null;
	  }
	  BigInteger privateFinal = output.modPow(d, n);
	  return privateFinal;
  }
}

	

