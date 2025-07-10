package Array;

public class ObjectsArray {
    public static void main(String[] args) {
        Object a=new Object();

        Employee obj=new Employee();
        obj.setID(1);
        obj.setName("vivek");
        obj.setAddress("noida");
        obj.setAge(22);
        obj.setMobileNo("9006485105");
        System.out.println(obj.getID());
        System.out.println(obj.getAddress());
        System.out.println(obj.getMobileNo());
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
        System.out.println(obj.toString());
    }

}
class Employee{
    private int ID;
    private String name;
    private String address;
    private String mobileNo;
    private int age;

    public String getName() {
        return name+ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getID() {
        return ID*2;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", age=" + age +
                '}';
    }
}