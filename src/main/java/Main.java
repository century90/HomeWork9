public class Main {

    public static void main(String[] args) {

        Post post = new Post();

        post.name = "Elena";
        post.passportId = "1111 № 111111";
        post.patronymic = "Vladimirovna";
        post.phone = "8123456789";
        post.surname = "Martemyanova";
        post.subscription = true;

        System.out.println(post.name);
        System.out.println(post.passportId);
        System.out.println(post.patronymic);
        System.out.println(post.phone);
        System.out.println(post.surname);
        System.out.println(post.subscription);

        post.birthday = new FormDate();

        post.birthday.theData = 1;
        post.birthday.month = "june";
        post.birthday.year = 1990;

        System.out.println(post.birthday.theData + " " + post.birthday.month + " " + post.birthday.year);


    }


}
