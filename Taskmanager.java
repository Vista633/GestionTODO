package Projetinformation;
import java.util.ArrayList;

public class Taskmanager {
	private ArrayList<String> tasks;

    public void Taskmanager(){
        tasks = new ArrayList<>();

    }
    
    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Tâche ajoutée : " + task);
    }

    public void completeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            String task = tasks.remove(index);
            System.out.println("Tâche terminée et supprimée : " + task);
        } else {
            System.out.println("Index invalide !");
        }
    }

    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Aucune tâche.");
        } else {
            System.out.println("Tâches :");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println(i + ". " + tasks.get(i));
            }
        }
    }
}

