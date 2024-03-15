import java.util.*;
public class demosingleresponsibility 
{
	public static void main(String args[])
	{
		student sony=new student();
		sony.setname("sony mathew");
		sony.setregisterNo("119CS20001");
		requestBook rb=new requestBook();
		rb.setbookName("java programming");
		rb.setduration(2);
		rb.setstudent(sony);
		rb.searchBook();
		IssueBook ibOrder=new IssueBook(rb);
		ibOrder.issuebook();
	}
}
class student
{
	private String name;
	private String registerNo; 
	public String getName(){return name;}
	public void setname(String name) {this.name=name;}
	public String getregisterNo() {return registerNo;}
	public void setregisterNo(String rno)
	{
		this.registerNo=rno;
	}
}
class requestBook
{
	private student student;
	private String requestId;
	private String bookName;
	private int duration;
	public student getstudent(){return student;}
  public void setbookName(String string) {
		// TODO Auto-generated method stub
		
	}
public void setstudent(student student)
  {
	this.student=student;
  }
  public String getrequestid() {return requestId;}
  public void setrequestId(String bookName)
  {
	  Random random=new Random();
	  this.requestId=(bookName+"-"+ random.nextInt(500));
  }
  public String getbookName() {return bookName;}
  {
	  this.bookName=bookName;
	  setrequestId(bookName);
  }
  public int getduration() {return duration;}
  public void setduration(int duration)
  {
	  this.duration=duration;
  }
  public void searchBook()
  {
	  System.out.println("searching book for student_"+this.getstudent().getName()+"who has requested"+this.getbookName());
  }
}
class IssueBook
{
	private requestBook rb;
	public IssueBook(requestBook rb) {this.rb=rb;}
	public void issuebook()
	{
		System.out.println("issueing the book");
		System.out.println("with request id as"+this.rb.getrequestid()+"being issued to"+this.rb.getstudent().getName());
		System.out.println("book is to be delivered to"+this.rb.getstudent().getregisterNo());
	}
}