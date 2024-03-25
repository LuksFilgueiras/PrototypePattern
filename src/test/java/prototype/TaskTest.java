package prototype;

import org.example.prototype.Task;
import org.example.prototype.Owner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskTest {
    @Test
    void testClone() throws CloneNotSupportedException {
        Task task = new Task("Task 01", "Content here", false, new Owner("John Doe"));

        Task taskClone = task.clone();
        taskClone.setComplete(true);
        taskClone.setTitle("Task 02");
        taskClone.setUser(new Owner("Arnold"));

        assertEquals("Owner name: John Doe\nTask 01\nContent here\nfalse", task.toString());
        assertEquals("Owner name: Arnold\nTask 02\nContent here\ntrue", taskClone.toString());
    }
}
