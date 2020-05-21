package May18_StackProjects;

public class StackDemo {


    public static void main(String[] args) {
        String usage = "Usage: StackDemo a/l count";
        if (args.length != 2) {
            System.out.println(usage);
            return;
        }
        Stack<Integer> stack;
        if (args[0].equals("a")) {
            stack = new ArrayStack<>();
        } else if (args[0].equals("l")) {
            stack = new LinkedStack<>();
        } else {
            System.out.println(usage);
            return;
        }

        int count;

        try {
            count = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println(usage);
            System.out.println("count must be a number");
            return;
        }
        if (count < 0) {
            System.out.println(usage);
            System.out.println("count must be positive");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println("Pushing element " + i);
            stack.push(i);
        }

        System.out.println("Current stack size is " + stack.size());

        while (!stack.isEmpty()) {
            int x = stack.pop();
            System.out.println("Popped element is " + x);
        }
    }
}
