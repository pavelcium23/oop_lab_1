package oop.practice;

public class Display {
    private int width;
    private int height;
    private float ppi;
    private String model;

    public Display(int width, int height, float ppi, String model) {
        this.width = width;
        this.height = height;
        this.ppi = ppi;
        this.model = model;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public float getPpi() {
        return ppi;
    }
    public String getModel() {
        return model;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void setPpi(float ppi) {
        this.ppi = ppi;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public void compareSize(Display m) {
        double Diag_1 = Math.sqrt(width * width + height * height);
        double Diag_2 = Math.sqrt(m.getWidth() * m.getWidth() + m.getHeight()* m.getHeight());
        if (Diag_1 > Diag_2) {
            System.out.println("The size of "+ this.model + "is greater than the size of "+ m.getModel());
        } else if (Diag_1 < Diag_2) {
            System.out.println("The size of "+ m.getModel() + "is greater than the size of "+ this.model);
        } else {
            System.out.println("The size of "+ m.getModel() + "is the same as the size of "+ this.model);
        }
    }
    public void compareSharpness(Display m) {
        if(this.ppi > m.getPpi()) {
            System.out.println("The sharpness of "+ this.model + "is greater than the sharpness of "+ m.getModel());
        } else if (this.ppi < m.getPpi()) {
            System.out.println("The sharpness of "+ m.getModel() + "is greater than the sharpness of "+ this.model);
        } else { System.out.println("The sharpness of "+ this.model + "is the same as the sharpness of "+ m.getModel());
        }
    }
    public void compareWithMonitor(Display m) {
        compareSize(m);
        compareSharpness(m);
    }

}