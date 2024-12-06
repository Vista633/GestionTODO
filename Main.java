package Projetinformation;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Taskmanager taskManager = new Taskmanager();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Ajouter une tâche");
            System.out.println("2. Terminer une tâche");
            System.out.println("3. Lister les tâches");
            System.out.println("4. Quitter");
            System.out.print("Choix : ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consomme la nouvelle ligne

            if (choice == 1) {
                System.out.print("Nom de la tâche : ");
                String task = scanner.nextLine();
                taskManager.addTask(task);
            } else if (choice == 2) {
                System.out.print("Index de la tâche à terminer : ");
                int index = scanner.nextInt();
                taskManager.completeTask(index);
            } else if (choice == 3) {
                taskManager.listTasks();
            } else if (choice == 4) {
                System.out.println("Au revoir !");
                break;
            } else {
                System.out.println("Choix invalide !");
            }
        }

        scanner.close();
    }
}



