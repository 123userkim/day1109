package com.sist.vo;

import java.util.Date;

public class OrdersVO {

	private int orderid;
	private int custid;
	private int bookid;
	private int saleprice;
	private Date orderdate;
	
	
	//�Ű������� ��� ���� ������, ��ü�� ���� �� �⺻ Ʋ 
	public OrdersVO(int orderid, int custid, int bookid, int saleprice, Date orderdate){
		this.orderid = bookid;
		this.custid = custid;
		this.bookid= bookid;
		this.saleprice =saleprice;
		this.orderdate = orderdate;
	}
	
	//����ڰ� �����ڸ� �ϳ��� ����� �����ϸ� �ڹٴ� ���̻� �⺻�����ڸ� ��������� ����
	//��ü�����ÿ� �Ű������� ��� �޾ƾ߸� �� -> �⺻�����ڵ� ����� �ֱ�
	public OrdersVO() {
		super();
		 
	}

	//�ܺο��� Ŭ������ ����� �����ؼ� ���� �����ϴ� setter,���� �о���� getter
	public int getOrderid() {
		return orderid;
	}

	//��ȯ���� ���� retrun�� ������ ����
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
