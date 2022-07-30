package Agency;

class Client {

    private String name;
    private String birthDate;
    private String passNo;
    private String phoneNo;
    
    public Client(String name, String birthDate, String passNo, String phoneNo) {
        this.name = name;
        this.birthDate = birthDate;
        this.passNo = passNo;
        this.phoneNo = phoneNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name, Worker worker) {
        if (worker.getStatus() == Status.consultant) {
            System.out.println("Access denied");
            return;
        } else {
            this.name = name;
        }
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPassNo(Worker worker) {
        if (worker.getStatus() == Status.consultant && !passNo.isEmpty()) {
            return "...";
        }
        return passNo;
    }

    public void setPassNo(String passNo, Worker worker) {
        if (worker.getStatus() == Status.consultant) {
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
        return "Client [age=" + birthDate + ", name=" + name + ", passNo=" + passNo + ", phoneNo=" + phoneNo + "]";
    }

}
