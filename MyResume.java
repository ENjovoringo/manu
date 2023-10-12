public class MyResume {
    public static void main(String[] args) {
        String myName = "Emmanuel Njovoringo";
        String[] skills = {"Java", "Problem Solving", "Teamwork", "Creativity"};
        String[] interests = {"Web Development", "Machine Learning", "Game Development"};

        System.out.println("Hello, employers!");
        System.out.println("I'm " + myName + ", and I'm here to charm you with my Java skills and passion for coding.");
        System.out.println("Here's why you should hire me:");

        System.out.println("Skills:");
        for (String skill : skills) {
            System.out.println("- " + skill);
        }

        System.out.println("Interests:");
        for (String interest : interests) {
            System.out.println("- " + interest);
        }

        System.out.println("Let's create something amazing together!");
    }
}
