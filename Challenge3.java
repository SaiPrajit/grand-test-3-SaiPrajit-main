import java.util.*;

class Publications {
  String title;
  double price;
  double copies_sold;
  Scanner s = new Scanner(System.in);
}

class Books extends Publications {
  String author;
  int copies;

  void book_details() {
    System.out.println("Enter title of book:");
    title = s.nextLine();
    System.out.println("Enter the author of book:");
    author = s.nextLine();
    System.out.println("Enter price of book:");
    price = s.nextDouble();
    System.out.println("Enter the copies sold:");
    copies_sold = s.nextDouble();
    System.out.println("Enter the copies ordered:");
    copies = s.nextInt();
  }

  void salesofPublications() {
    double totalbill = price * copies_sold;
    System.out.println("The sales of a publication is:" + totalbill);
  }
}

class Magazine extends Publications {
  int orderQty;
  String currentIssue;

  void magazineDetails() {
    System.out.println("Enter the order quantity:");
    orderQty = s.nextInt();
    System.out.println("Order quantity is:" + orderQty);
    System.out.println("Enter the current issue:");
    currentIssue = s.nextLine();
    System.out.println("Current issue is:" + currentIssue);
  }
}

class Challenge3 {
  public static void main(String[] args) {
    Books b = new Books();
    b.book_details();
    b.salesofPublications();
    Magazine m = new Magazine();
    m.magazineDetails();
  }
}