package r07.r07_05;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Job> jobs = new PriorityQueue<>();
        jobs.add(new Job(4, "Wyrzuciæ œmieci"));
        jobs.add(new Job(9, "Pozamykaæ nawiasy"));
        jobs.add(new Job(1, "Naprawiæ wycieki pamiêci"));
        
        while (jobs.size() > 0) {
            Job job = jobs.remove(); // Najpilniejsze zadania s¹ usuwane jako pierwsze
            execute(job);
        } 
    }
    
    public static void execute(Job job) {
        System.out.println(job.getDescription());
    }
}
