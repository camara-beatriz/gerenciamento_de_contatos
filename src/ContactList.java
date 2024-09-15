public class ContactList {
    private Node head;

    public ContactList() {
        this.head = null;
    }

    public void addContact(String name, String phoneNumber, String email) {
        Contact newContact = new Contact(name, phoneNumber, email);
        Node newNode = new Node(newContact);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Contato adicionado com sucesso!");
    }

    public Contact searchContact(String key) {
        Node current = head;
        while (current != null) {
            if (current.contact.getName().equalsIgnoreCase(key) || current.contact.getPhoneNumber().equals(key)) {
                return current.contact;
            }
            current = current.next;
        }
        return null;
    }

    public boolean removeContact(String key) {
        if (head == null) {
            return false;
        }

        if (head.contact.getName().equalsIgnoreCase(key) || head.contact.getPhoneNumber().equals(key)) {
            head = head.next;
            return true;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.contact.getName().equalsIgnoreCase(key) || current.next.contact.getPhoneNumber().equals(key)) {
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }

        return false;
    }

    public void listContacts() {
        if (head == null) {
            System.out.println("Nenhum contato encontrado.");
        } else {
            Node current = head;
            while (current != null) {
                System.out.println(current.contact);
                current = current.next;
            }
        }
    }
}
