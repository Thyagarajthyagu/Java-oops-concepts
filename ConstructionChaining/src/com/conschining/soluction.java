package com.conschining;
class Mobile{
	String name;
	double price;
	Mobile(String name,double price){
		this(price);
		this.name=name;
		this.price=price;
		System.out.println(name+price);
	}
	Mobile(double price){
		this.price=price;
		System.out.println(4500);
	}
}
	class Shop extends Mobile{
		int id;
		Shop(String name,double price,int id){
			super(name,price);
			this.id=id;
			System.out.println(id);
		}
	}
	class soluction {
		public static void main(String[] args) {
			Shop s=new Shop("raj",4544,23);
		}
	}

