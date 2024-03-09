import java.util.*;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("Иван Иванов", "91111111111");
        phoneBook.addContact("Иван Иванов", "12221111111");
        phoneBook.addContact("Василий Васильев", "88333333333");
        phoneBook.addContact("Петр Петров", "33333333333");
        phoneBook.addContact("Александр Александров", "77777777777");
        phoneBook.addContact("Александр Александров", "22777777777");
        phoneBook.addContact("Александр Александров", "07777777777");
        phoneBook.printBook(); // Вывод всех записей книги
        TreeSet<String> searchedPhones = phoneBook.getPhones("Иван Иванов");
        System.out.println("Телефон, который вы искали" + searchedPhones); // вывод нового контакта  для Ивана Иванова
        phoneBook.removeContact("Иван Иванов", "11111111111");
        TreeSet<String> ivanPhonesAfterDelete = phoneBook.getPhones("Иван Иванов");
        System.out.println("Телефон Ивана Иванова после удаления: " + ivanPhonesAfterDelete); //Вывод контакта для Ивана Иванова после удаления второго телефона
        List<String> sortedContacts = phoneBook. sortContactsByPhones();
        System.out.println("Отсортированный телефонный справочник:");
        for (String contact : sortedContacts) { // Вывод отсортированных записей книги
            System.out.println(contact);    
        }
    }
}