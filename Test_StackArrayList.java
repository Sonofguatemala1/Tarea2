import static org.junit.Assert.assertEquals;

import org.junit.Test;;
public class Test_StackArrayList {
    Istack<Integer> stack = new StackArrayList<Integer>();

    @Test
    public void test_push(){
        Istack<Integer> stack = new StackArrayList<Integer>();
        stack.push(3);
        int a=stack.peek();
        assertEquals(3,a );
    }

    @Test
    public void test_pop(){
        Istack<Integer> stack = new StackArrayList<Integer>();
        stack.push(3);
        int a=stack.pop();
        assertEquals(3,a );
    }

    @Test
    public void test_size(){
        Istack<Integer> stack = new StackArrayList<Integer>();
        stack.push(3);
        stack.push(2);
        stack.push(1);
        int a=stack.size();
        assertEquals(3,a );
    }

    @Test
    public void test_peek(){
        Istack<Integer> stack = new StackArrayList<Integer>();
        stack.push(3);
        int a=stack.peek();
        assertEquals(3,a );
    }
}

