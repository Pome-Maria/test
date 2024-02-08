public class Color {
    public static void main(String args[]) {
        String a = "синий";

        if (a == "красный") {
            System.out.println("остановиться");
        } else if (a == "желтый") {
            System.out.println("подождать");
        } else if (a == "зеленый") {
            System.out.println("ехать");
        } else {
            System.out.println("такой цвет есть в светофоре?");;
        }
    }
}