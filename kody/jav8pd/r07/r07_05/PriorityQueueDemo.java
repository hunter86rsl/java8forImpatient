package r07.r07_05;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Job> jobs = new PriorityQueue<>();
        jobs.add(new Job(4, "Wyrzuci� �mieci"));
        jobs.add(new Job(9, "Pozamyka� nawiasy"));
        jobs.add(new Job(1, "Naprawi� wycieki pami�ci"));
        
        while (jobs.size() > 0) {
            Job job = jobs.remove(); // Najpilniejsze zadania s� usuwane jako pierwsze
            execute(job);
        } 
    }
    
    public static void execute(Job job) {
        System.out.println(job.getDescription());
    }
}
