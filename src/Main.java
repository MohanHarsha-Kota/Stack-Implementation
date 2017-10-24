import java.util.Scanner;
import static java.lang.Boolean.TRUE;
import static java.lang.System.exit;

public class Main {
    static int top = -1;
    static int N;
    static void push(int element, int[] STACK)
    {
        top++;
        if(top == N)
        {
            System.out.println("Stack is Full ");
            top--;
        }
        else
        {
            STACK[top] = element;
        }
    }

    static int pop(int[] STACK)
    {
        int element;
        if(top < 0)
        {
            System.out.println("Stack is Already Empty");
            return 0;
        }
        else
        {
            element = STACK[top];
            STACK[top] = 0;
            top--;
            return element;
        }
    }

    public static void main(String[] args) {
	System.out.println("--- Stack Implementation ---");
	Scanner scan = new Scanner(System.in);
	int id, element;
	System.out.println("Enter Size of stack");
	N = scan.nextInt();
	int[] STACK = new int[N];

	while(TRUE)
    {
        System.out.println("Press \n 1. To Push element into the Stack \n 2. To Pop an element out of Stack \n 3. To View the Stack \n 4. Exit from the Program ");
        System.out.println("Enter your choice");
        id = scan.nextInt();

        switch (id)
        {
            case 1:
                System.out.println("Enter a number");
                element = scan.nextInt();
                push(element, STACK);
                break;
            case 2:
                System.out.println("Removed Element is:  "+pop(STACK));
                break;
            case 3:
                System.out.println("Elements in Stack are:");
                for(int i = 0; i< STACK.length;i++)
                    System.out.print(STACK[i]+ " ");
                System.out.println();
                break;
            case 4:
                exit(0);
            default: System.out.println("Invalid Option");
        }
    }
    }
}
