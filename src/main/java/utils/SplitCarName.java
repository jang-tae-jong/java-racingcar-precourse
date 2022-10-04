package utils;

public class SplitCarName {

    private String inputName;
    private String[] carName;

    public SplitCarName(String inputName) {
        this.inputName = inputName;
    }

    public String[] getCarName(){
        return inputName.split(",");
    }
}
