import org.junit.Assert;
import uk.co.compendiumdev.fizzbuzz.FizzBuzzConverter;
import org.junit.Test;

public class FizzBuzzTest {


    // Write a program that prints the numbers from 1 to 100.
    // But for multiples of three print “Fizz” instead of the number
    // and for the multiples of five print “Buzz”.
    // For numbers which are multiples of both three and five print “FizzBuzz”

    /*
        1 == 1
        2 == 2
        3 == fizz
        4 == 4
        5 == Buzz
        6 == Fizz
        7 == 7
        8 == 8
        9 == Fizz
        10 == Buzz
        ... 12
        15 == FizzBuzz
        100 == Buzz
     */

    /*

        -ve
        0  == ?
        101 == 101

     */

    @Test
    public void checkAcceptanceCriteria(){

        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        Assert.assertEquals("1", fizzBuzz.convert(1));
        Assert.assertEquals("2", fizzBuzz.convert(2));
        Assert.assertEquals("Fizz", fizzBuzz.convert(3));
        Assert.assertEquals("4", fizzBuzz.convert(4));
        Assert.assertEquals("Buzz", fizzBuzz.convert(5));
        Assert.assertEquals("Fizz", fizzBuzz.convert(6));
        Assert.assertEquals("7", fizzBuzz.convert(7));
        Assert.assertEquals("8", fizzBuzz.convert(8));
        Assert.assertEquals("Fizz", fizzBuzz.convert(9));
        Assert.assertEquals("Buzz", fizzBuzz.convert(10));
        Assert.assertEquals("11", fizzBuzz.convert(11));
        Assert.assertEquals("Fizz", fizzBuzz.convert(12));
        Assert.assertEquals("13", fizzBuzz.convert(13));
        Assert.assertEquals("14", fizzBuzz.convert(14));
        Assert.assertEquals("FizzBuzz", fizzBuzz.convert(15));
        Assert.assertEquals("16", fizzBuzz.convert(16));

    }


    @Test
    public void fizzBuzzConvertorLeavesNormalNumbersAlone(){

        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        Assert.assertEquals("1", fizzBuzz.convert(1));
        Assert.assertEquals("2", fizzBuzz.convert(2));

    }

    @Test
    public void fizzBuzzConvertorMultiplesOfThree(){

        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        Assert.assertEquals("Fizz", fizzBuzz.convert(3));

    }

    @Test
    public void fizzBuzzConvertorMultiplesOfFive(){

        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        Assert.assertEquals("Buzz", fizzBuzz.convert(5));

    }

    @Test
    public void multiplesOfBothThreeAndFive(){
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        Assert.assertEquals("FizzBuzz", fizzBuzz.convert(15));
    }


    // Fizz Buzz = 15, 30, 45, 60, 75, 90
    // Buzz 5, 10,
    // Fizz 3, 6, 9, 12

    @Test
    public void checkAllNumbers(){

        boolean isMultipleOfThree=false;
        boolean isMultipleOfFive=false;
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        for(int checkThis=1; checkThis<=100; checkThis++){

            String expectedVal = String.valueOf(checkThis);

            isMultipleOfFive = checkThis%5==0 ? true: false;
            isMultipleOfThree = checkThis%3==0 ? true: false;

            if(isMultipleOfFive && isMultipleOfThree){
                expectedVal="FizzBuzz";
            }else{
                if(isMultipleOfFive){
                    expectedVal="Buzz";
                }else{
                    if(isMultipleOfThree){
                        expectedVal="Fizz";
                    }
                }
            }

            System.out.println(fizzBuzz.convert(checkThis));
            Assert.assertEquals(expectedVal, fizzBuzz.convert(checkThis));

        }

    }





}
