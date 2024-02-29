class MobileStore
{
	String make;
	String model;
	String category;
	double price;
	double discount;
	double netPrice;
	MobileStore()
	{
		this.make="Samsung";
		this.model="Glaxy s21";
		this.category="Smart phone";
		this.price=80099.99;
		this.discount=0.15;
	}
	MobileStore(String make,String model,String category,double price,double discount)
	{
		this.make=make;
		this.model=model;
		this.category=category;
		this.price=price;
		this.discount=discount;
	}
	MobileStore(MobileStore obj,MobileStore obj1,MobileStore obj2)
	{
		make=obj.make;
		model=obj1.model;
		category=obj2.category;
		price=obj.price;
		discount=obj2.discount;
	}
	boolean getDetails(){
		System.out.println("**");
		System.out.println("Comapany name:"+make);
		System.out.println("model:"+model);
		System.out.println("category"+category);
		System.out.println("price:"+price);
		System.out.println("discount:"+discount);
		System.out.println("net price:"+CalculateNetPrice());
		return true;
	}
	double CalculateNetPrice()
	{
		netPrice=price-(price*discount);
		return netPrice;
	}

	public static void main(String args[])
	{
		MobileStore mobile1=new MobileStore();
		mobile1.getDetails();
		MobileStore iphone=new MobileStore("Apple","iphone12","smartphone",99999.99,0.1);
		iphone.getDetails();
		MobileStore Samsung=new MobileStore("Samsung","galaxy s21","smartphone",88899.99,0.5);
		Samsung.getDetails();
		MobileStore Google=new MobileStore("Google","pixel5","smartphone",69999.99,0.2);
		Google.getDetails();
		MobileStore mobile2=new MobileStore(iphone,Samsung,Google);
		mobile2.getDetails();
	}
}