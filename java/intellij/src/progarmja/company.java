package progarmja;
    class Employee{
        private  int empid;

        public void setempid(int eid) {
            empid = eid;
        }
        public int getempid(){
            return empid;
        }
    }
public class company {
    public static void main(String[] args) {
        Employee obj=new Employee();
        obj.setempid(10);
        System.out.println(obj.getempid());

    }

}
