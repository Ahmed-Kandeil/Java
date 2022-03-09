package hello.world;

/**
 * @author Ahmed Kandil
 * @since 4-3-2022
 * @version 1.0
 */
public class SwitchStatements {
    public static void main(String[] args) {
        char theChar = 'A';
        switch (theChar)
        {
            case 'A':
                System.out.println("Value Is A");
                break;
            case 'B':
                System.out.println("Value Is B");
                break;
            default:
                System.out.println("Unknown Value");
                break;
        }
    }
}
