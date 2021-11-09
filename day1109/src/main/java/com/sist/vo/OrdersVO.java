package com.sist.vo;

import java.util.Date;

public class OrdersVO {

	private int orderid;
	private int custid;
	private int bookid;
	private int saleprice;
	private Date orderdate;
	
	
	//매개변수를 모두 갖는 생성자, 객체를 만들 때 기본 틀 
	public OrdersVO(int orderid, int custid, int bookid, int saleprice, Date orderdate){
		this.orderid = bookid;
		this.custid = custid;
		this.bookid= bookid;
		this.saleprice =saleprice;
		this.orderdate = orderdate;
	}
	
	//사용자가 생성자를 하나라도 만들기 시작하면 자바는 더이상 기본생성자를 만들어주지 않음
	//객체생성시에 매개변수를 모두 받아야만 함 -> 기본생성자도 만들어 주기
	public OrdersVO() {
		super();
		 
	}

	//외부에서 클래서의 멤버에 접근해서 값을 변경하는 setter,값을 읽어오는 getter
	public int getOrderid() {
		return orderid;
	}

	//반환값이 없음 retrun이 숨겨져 있음
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public int getSaleprice() {
		return saleprice;
	}

	public void setSaleprice(int saleprice) {
		this.saleprice = saleprice;
	}

	public Date getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}

	@Override
	public String toString() {
		return "OrdersVO [orderid=" + orderid + ", custid=" + custid + ", bookid=" + bookid + ", saleprice=" + saleprice
				+ ", orderdate=" + orderdate + "]";
	}
	
	
	
}
