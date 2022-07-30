package Agency;

enum Status { //хотя правильнее было бы назвать Position - должность
    consultant,
    dptHead,
    director;
}

class Worker {
    private String name;
    private Status status;

    public Worker(String name, Status status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public Status getStatus() {
        return status;
    }

    
}

