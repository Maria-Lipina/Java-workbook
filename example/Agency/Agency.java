package example.Agency;


/**
 * Agency - класс, представляющий некую организацию, в которой есть (представлены подклассами)
 * Worker - сотрудники
 * Position (интерфейс?) - должности сотрудников
 * Status (интерфейс?) - статусы выполнения задач и оказания услуг (для внутреннего пользования)
 * Service - услуги от сотрудников для клиентов
 * Task - задачи, которые разные сотрудники могут назначить друг другу
 * Client - клиенты в базе организации
 * AccessRights - у разных сотрудников, в зависимости от их должности, разные права на получение и редактирование той или иной информации о клиенте, а так же на другие действия
 */
public class Agency {
    
    enum Position { //здесь Position - должность
        consultant,
        dptHead,
        director;
    }

    protected enum Status {
        done,
        in_process,
        to_be_done;
    }

    public class Service {

        private String sName;
        private String deliveryTerm; //дата или срок оказания услуги
        private Client client;
        private Worker worker;
        private Status servStatus;
        private int price;

        public Service(String sName, String deliveryTerm, Client client, Worker worker, int price) {
            this.sName = sName;
            this.deliveryTerm = deliveryTerm;
            this.client = client;
            this.worker = worker;
            this.servStatus = Status.to_be_done;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Service [client=" + client + ", deliveryTerm=" + deliveryTerm + ", price=" + price + ", sName="
                    + sName + ", servStatus=" + servStatus + ", worker=" + worker + "]";
        }

        public String getsName() {
            return sName;
        }

        public void setsName(String sName) {
            this.sName = sName;
        }

        public String getDeliveryTerm() {
            return deliveryTerm;
        }

        public void setDeliveryTerm(String deliveryTerm) {
            this.deliveryTerm = deliveryTerm;
        }

        public Client getClient() {
            return client;
        }

        public void setClient(Client client) {
            this.client = client;
        }

        public Worker getWorker() {
            return worker;
        }

        public void setWorker(Worker worker) {
            this.worker = worker;
        }

        public Status getServStatus() {
            return servStatus;
        }

        public void setServStatus(Status servStatus) {
            this.servStatus = servStatus;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }
    }

    protected class Task{
         
        private String tName;
        private String fulfillTerm; //дата или срок выполнения задачи
        private Worker assignedTo;
        private Worker assignedBy;
        private Status taskStatus;
        
        public Task(String tName, String fulfillTerm, Worker assignedTo, Worker assignedBy) {
            this.tName = tName;
            this.fulfillTerm = fulfillTerm;
            this.assignedTo = assignedTo;
            this.assignedBy = assignedBy;
            this.taskStatus = Status.to_be_done;
        }

        @Override
        public String toString() {
            return "Task [assignedBy=" + assignedBy + ", assignedTo=" + assignedTo + ", fulfillTerm=" + fulfillTerm
                    + ", tName=" + tName + ", taskStatus=" + taskStatus + "]";
        }
        //По хорошему, на все эти задачи должны работать права доступа
        public String gettName() {
            return tName;
        }

        public void settName(String tName) {
            this.tName = tName;
        }

        public String getFulfillTerm() {
            return fulfillTerm;
        }

        public void setFulfillTerm(String fulfillTerm) {
            this.fulfillTerm = fulfillTerm;
        }

        public Worker getAssignedTo() {
            return assignedTo;
        }

        public void setAssignedTo(Worker assignedTo) {
            this.assignedTo = assignedTo;
        }

        public Worker getAssignedBy() {
            return assignedBy;
        }

        public void setAssignedBy(Worker assignedBy) {
            this.assignedBy = assignedBy;
        }

        public Status getTaskStatus() {
            return taskStatus;
        }

        public void setTaskStatus(Status taskStatus) {
            this.taskStatus = taskStatus;
        }

        

    }

    


}
