/*
Other Operators
Exercise: Other operators
Define a testing class where you:

define an int variable called a and initialise it with the value 15
add 5 to a without repeating the a variable (e.g. a = a + 5 is not accepted)
then subtract 4 to a without repeating the a variable
assign the value of a to int b and increment b by one without using a or int b = b + 1
check and prints if both the following statements are true:
statement 1: check if b is an odd number
statement 2: check if the result of (b multiplied for b + 1) is a multiple of 3

 */
public class Main {
    public static void main(String[] args) {
        int a=15;
        a+=5;
        a-=4;

        int b=a;
        b+=1;

        System.out.println("b is an odd number: " + (b%2!=0));
        System.out.println("the result of (b multiplied for b + 1) is a multiple of 3: "+(((b*=b+1)%3==0)));
    }
}
