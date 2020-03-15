package pojo;

public class Record {
    private String name;
    private String id;
    private String tel;
    private int maskNumber;
    private int reservationNumber;
    private int turn;
    private int status;
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getMaskNumber() {
        return maskNumber;
    }

    public void setMaskNumber(int maskNumber) {
        this.maskNumber = maskNumber;
    }
    
    public int getReservationNumber() {
    	return reservationNumber;
    }
    
    public void setReservationNumber(int reservationNumber) {
        this.reservationNumber = reservationNumber;
    }
    
    public int getTurn() {
    	return turn;
    }
    
    public void setTurn(int turn) {
        this.turn = turn;
    }
    
    public int getStatus() {
    	return status;
    }
    
    public void setStatus(int status) {
        this.status = status;
    }
}

 