package Agency;

import Agency.Agency.Position;

class Client {

    private String clName;
    private String birthDate;
    private String passNo;
    private String phoneNo;
    
    public Client(String clName, String birthDate, String passNo, String phoneNo) {
        this.clName = clName;
        this.birthDate = birthDate;
        this.passNo = passNo;
        this.phoneNo = phoneNo;
    }

    public Client(String clName, String birthDate, String passNo) {
        this(clName, birthDate, passNo, "");
    }

    public Client(String clName, String birthDate) {
        this(clName, birthDate, "", "");
    }

    public Client(String clName) {
        this(clName, "", "", "");
    }

    public String getClName() {
        return clName;
    }

    public void setName(String clName, Worker worker) {
        if (worker.getPosition() == Position.consultant) {
            System.out.println("Access denied");
            return;
        } else {
            this.clName = clName;
        }
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPassNo(Worker worker) {
        if (worker.getPosition() == Position.consultant && !passNo.isEmpty()) {
            return "...";
        }
        return passNo;
    }

    public void setPassNo(String passNo, Worker worker) {
        if (worker.getPosition() == Position.consultant) {
            System.out.println("Access denied");
            return;
        } else {
            this.passNo = passNo;
        }
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        if (phoneNo.isEmpty()) {
            System.out.println("Необходимо ввести новый номер");
            return;
        } else {
            this.phoneNo = phoneNo;
        }
    }

    @Override
    public String toString() {
        return "Client [age=" + birthDate + ", name=" + clName + ", passNo=" + passNo + ", phoneNo=" + phoneNo + "]";
    }

}
