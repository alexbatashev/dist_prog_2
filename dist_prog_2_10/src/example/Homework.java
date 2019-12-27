package example;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@WebService()
public class Homework {
    class Sortbymarks implements Comparator<Task> {
        // Used for sorting in ascending order of
        // roll number
        public int compare(Task a, Task b) {
            return b.marks.size() - a.marks.size();
        }
    }

    private int lastId = 0;
    private ConcurrentHashMap<Integer, Task> tasks = new ConcurrentHashMap<>();

    @WebMethod
    public int uploadWork(String name, byte[] data) {
        Task t = new Task();
        t.id = ++lastId;
        t.submitter = name;
        t.data = data;
        t.marks = new ArrayList<>();
        tasks.put(lastId, t);
        return lastId;
    }

    @WebMethod
    public byte[] downloadWork(int id) {
        if (tasks.containsKey(id)) {
            return tasks.get(id).data;
        }
        return null;
    }

    @WebMethod
    public void setMark(int id, String name, int mark) {
        Mark m = new Mark(name, mark);
        tasks.get(id).marks.add(m);
    }

    @WebMethod
    public float getAvgMark(int id) {

        float avg = 0f;

        for (int i = 0; i < tasks.get(id).marks.size(); i++) {
            avg += tasks.get(id).marks.get(i).mark;
        }
        return avg / tasks.get(id).marks.size();
    }

    @WebMethod
    public int[] getWorksForVerification() {

        ArrayList<Task> values = new ArrayList<>(tasks.values());
        values.sort(new Sortbymarks());
        int[] ids = new int[Math.min(3, values.size())];
        for (int i = 0; i < Math.min(3, values.size()); i++) {
            ids[i] = values.get(i).id;
        }
        return ids;
    }

    @WebMethod
    public ArrayList<Task> getWorks() {
        return new ArrayList<>(tasks.values());
    }

    @WebMethod
    public ArrayList<Mark> getMarks(int id) {
        return tasks.get(id).marks;
    }
}
