/*
 * В некоторой организации следующая иерархия: консультант, начальник отдела, директор. Необходимо разработать программу взаимодействия с клиентами, в которой можно посмотреть данные клиента (ФИО, дата рождения, номер паспорта, номер телефона)
 * Консультант не имеет доступа к просмотру номера паспорта, не может изменить ФИО.
 * Консультант может изменить номер телефона, но при этом поле всегда должно быть заполнено.
 * 
 * TODO: Создать иерархию классов, отражающую иерархию этой организации
 */

package Agency;

public class Program {

public static void main(String[] args) {
    Client vanya = new Client("Иванов Иван Иванович", "01.01.1234", "12 34 434554", "908 654 12 43");
    Worker vasya = new Worker("Василий Петрович", Status.consultant);
    System.out.println(vanya.getName());
    vanya.setName("Петров", vasya);
    
    System.out.println(vanya.getBirthDate());
    vanya.setBirthDate("12.12.4321");
    System.out.println(vanya.getBirthDate() + " после изменения");
    System.out.println(vanya.getPassNo(vasya));
    vanya.setPassNo("1234567890", vasya);
    System.out.println(vanya.getPhoneNo());
    vanya.setPhoneNo("");
}
}
