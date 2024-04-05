package prog2.samcis;

/**
 Name/s of programmer: Malasan, Edison M.
 Class Code and Schedule: 9322A/B = A = 12:30PM - 1:30PM / B = 3:00PM - 4:30PM
 Date: 4/5/2024
 */
// 1. Let NumberConverter be an interface. What must replace the blank?
public interface NumberConverter {
public int binaryToDecimal(String b) throws Exception;
public int hexadecimalToDecimal(String h);
public int octalToDecimal(String n);
}
