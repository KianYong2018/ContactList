package sg.edu.rp.c346.contactlist;

/**
 * Created by 16038975 on 23/7/2018.
 */

public class Contact {
    private String name;
    private int code;
    private int num;

    public Contact(String name, int code, int num) {
        this.name = name;
        this.code = code;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
