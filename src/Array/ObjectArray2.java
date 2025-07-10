package Array;

public class ObjectArray2 {
    public static void main(String[] args) {

        Employee1[] arr=new Employee1[5];
        arr[0]=new Employee1(1, "900648105", "noida1", "vivek1", 22);
        arr[1]=new Employee1(1, "900648105", "noida2", "vivek2", 23);
        arr[2]=new Employee1(1, "90071258105", "noida3", "vivek3", 24);
        arr[3]=new Employee1(1, "9006481505", "noida4", "vivek4", 25);
        arr[4]=new Employee1(1, "900648105", "noida5", "vivek5", 26);

                //this is linear search

        for (int i=0; i<arr.length; i++){
            if(arr[i].getID()==25)
            System.out.println(arr[i].toString());
        }
    }

}

class Employee1 {
    private int ID;
    private String name;
    private String address;
    private String mobileNo;
    private int age;

    public Employee1(int age, String mobileNo, String address, String name, int ID) {
        this.age = age;
        this.mobileNo = mobileNo;
        this.address = address;
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name + ID;
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
        return ID;
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