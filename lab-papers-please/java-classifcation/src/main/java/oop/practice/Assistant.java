package oop.practice;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Assistant {
    private String assistantName;
    private List<Display> assignedDisplays;

    public Assistant(String assistantName) {
        this.assistantName = assistantName;
        this.assignedDisplays = new ArrayList<>();
    }

    public void assignDisplay(Display d) {
        assignedDisplays.add(d);
        System.out.println("Display" + d.getModel() + "that is assigned to assitant" + assistantName);
    }

    public void assist(){
        for (int i = 0; i < assignedDisplays.size(); i++) {
            Display display1 = assignedDisplays.get(i);
            for (int j = i + 1; j < assignedDisplays.size(); j++) {
                Display display2 = assignedDisplays.get(j);
                System.out.println("\nComparing " + display1.getModel() + " with " + display2.getModel() + ":");
                display1.compareWithMonitor(display2);
            }
        }
    }
    public Display buyDisplay(Display d) {
        if (assignedDisplays.remove(d)) {
            System.out.println("\nDisplay " + d.getModel() + " purchased and removed from the assistant's list.");
            return d;
        }
        System.out.println("Display " + d.getModel() + " not found in the assistant's list.");
        return null;
    }
}
