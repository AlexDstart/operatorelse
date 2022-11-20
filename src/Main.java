public class Main {
    public static void main(String[] args) {
        System.out.println(" Задание 1 ");
        int age = 22;
        if (age >= 18) {
            System.out.println(" Поздравляем с совершеннолетием ");
        }else{
            System.out.println(" Взраст соверщеннолетия еще не наступил нужно подождать ");
        }
        System.out.println(" Задание 2 ");
        if (age >= 7 && age < 18) {
            System.out.println(" Ребенок ходит в школу ");
        }
        else if (age >= 18 && age < 24) {
            System.out.println(" Человек ходит в университет ");
        }
        else if (age>= 24){
            System.out.println(" Человек ходит на работу ");
        }


        int cappacity = 102;
        int seatsCount = 60;
        int standingCount = cappacity - seatsCount;
        int seatsUsed = 60;
        int standingUsed = 33;
        if (seatsUsed < seatsCount) {

            System.out.println(" Есть еще " + (seatsCount - seatsUsed) + " сидячих мест ");
        } else  {

            System.out.println(" Есть еще " + (standingCount - standingUsed) + " Стоячих мест ");
        }
        if (standingUsed == standingCount) {
            System.out.println(" Стоячих мест нет ");
        } else  {
            System.out.println(" Сидячих мест нет ");
        }
    }
}