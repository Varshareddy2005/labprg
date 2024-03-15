class Employe
{
String empName;
int empNo;
float salary;
String empDesig;
byte expYrs;
void setEmployee(String name,int No,float Sal,String Des,byte Ex)
{
empName=name;
empNo=No;
salary=Sal;
empDesig=Des;
expYrs=Ex;
}
void getEmploye()
{
System.out.println(empName+"\t"+empNo+"\t"+salary+"\t"+empDesig+"\t"+expYrs+"\n");
}
}
class DemoEmploye
{
public static void main(String args[])
{
Employee rahul=new Employe();
rahul.setEmploye("Rahul",128966,99999.0f,"PM",(byte)20);
System.out.println("empName\t empNo\t salary \t empDesig\t expYrs\n");
rahul.getEmploye();
Employee rakesh=new Employe();
rakesh.setEmploye("Rakesh",128969,98765.4f,"Project lead",(byte)10);
rakesh.getEmploye();
}
}