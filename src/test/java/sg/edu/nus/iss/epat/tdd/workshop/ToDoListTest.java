package sg.edu.nus.iss.epat.tdd.workshop;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class ToDoListTest  {
    // Define Test Fixtures

    private final String DESC1 = "desc 1";
    private final String DESC2 = "desc 2";
    private final String DESC3 = "desc 3";
    private Task task1;
    private Task task2;
    private Task task3;
    private ToDoList todoList;

    public ToDoListTest() {
        super();
    }

    @Before
    public void setUp() throws Exception {
        // Initialise Test Fixtures
        task1 = new Task(DESC1);
        task2 = new Task(DESC2);
        task3 = new Task(DESC3);
        
        todoList = new ToDoList();
    }

    @After
    public void tearDown() throws Exception {
        // Uninitialise test Fixtures
    }

    @Test
    public void testAddTask() {
        todoList.addTask(task1);
        assertEquals(1,todoList.getAllTasks().size());
    }

    @Test
    public void testGetStatus() {

        todoList.addTask(task1);
        assertEquals(false, todoList.getStatus(DESC1));
        todoList.completeTask(DESC1);
        assertEquals(true, todoList.getStatus(DESC1));
        //fail("Not implemented yet");
    }

    @Test
    public void testRemoveTask() {
        //fail("Not implemented yet");
    }

    @Test
    public void testGetCompletedTasks() {
        //fail("Not implemented yet");
    }
}