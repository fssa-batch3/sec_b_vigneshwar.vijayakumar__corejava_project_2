package in.fssa.globalfuncity.model;

public abstract class RoomEntity implements Comparable<RoomEntity> {

	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public int getNoOfBeds() {
		return noOfBeds;
	}
	public void setNoOfBeds(int noOfBeds) {
		this.noOfBeds = noOfBeds;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isActiveRoom() {
		return isActiveRoom;
	}
	public void setActiveRoom(boolean isActiveRoom) {
		this.isActiveRoom = isActiveRoom;
	}
	
	@Override
	public String toString() {
		return "RoomEntity [roomId=" + roomId + ", hotelName=" + hotelName + ", roomName=" + roomName + ", noOfBeds="
				+ noOfBeds + ", price=" + price + ", isActiveRoom=" + isActiveRoom + "]";
	}
	
	private int roomId;
    private String hotelName;
    private String roomName;
    private int noOfBeds;
    private int price;
    private boolean isActiveRoom = true;
	


}