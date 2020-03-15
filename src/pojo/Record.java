package pojo;

public class Record {
    private String name;
    private String id;
    private String tel;
    private int mask_number;
    private int reservation_number;
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

    public int getMask_number() {
        return mask_number;
    }

    public void setMask_number(int mask_number) {
        this.mask_number = mask_number;
    }
    
    public int getReservation_number() {
    	return reservation_number;
    }
    
    public void setReservation_number(int reservation_number) {
        this.reservation_number = reservation_number;
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

 