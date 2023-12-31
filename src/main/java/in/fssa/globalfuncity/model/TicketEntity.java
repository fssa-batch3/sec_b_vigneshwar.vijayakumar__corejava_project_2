package in.fssa.globalfuncity.model;

import java.sql.Timestamp;

public class TicketEntity {
	
	private int ticketId;
    private String fromDate;
    private String toDate;
    private int noOfAdult;
    private int noOfChildren;
    private int noOfDays;
    private int noOfNights;
	private int createdBy;
    private int adultPrice;
    private int childrenPrice;
    private int totalPrice;
    private Timestamp createdAt;

	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	public int getNoOfAdult() {
		return noOfAdult;
	}
	public void setNoOfAdult(int noOfAdult) {
		this.noOfAdult = noOfAdult;
	}
	public int getNoOfChildren() {
		return noOfChildren;
	}
	public void setNoOfChildren(int noOfChildren) {
		this.noOfChildren = noOfChildren;
	}
	public int getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}
	public int getNoOfNights() {
		return noOfNights;
	}
	public void setNoOfNights(int noOfNights) {
		this.noOfNights = noOfNights;
	}
	public int getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	public int getAdultPrice() {
		return adultPrice;
	}
	public void setAdultPrice(int adultPrice) {
		this.adultPrice = adultPrice;
	}
	public int getChildrenPrice() {
		return childrenPrice;
	}
	public void setChildrenPrice(int childrenPrice) {
		this.childrenPrice = childrenPrice;
	}
    public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	
	@Override
	public String toString() {
		return "TicketEntity [ticketId=" + ticketId + ", fromDate=" + fromDate + ", toDate=" + toDate + ", noOfAdult="
				+ noOfAdult + ", noOfChildren=" + noOfChildren + ", noOfDays=" + noOfDays + ", noOfNights=" + noOfNights
				+ ", createdBy=" + createdBy + ", adultPrice=" + adultPrice + ", childrenPrice=" + childrenPrice
				+ ", totalPrice=" + totalPrice + ", createdAt=" + createdAt + "]";
	}

	 public int compareTo(TicketEntity other) {
			return Integer.compare(this.ticketId, other.getTicketId());
	    }
	
}
