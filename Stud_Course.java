public class Stud_Course extends student {
        void course_dett()
    {
        String[] subjects = {"DevOps", "Machine Learning", "C#"};
        int[][] marks = {
            {50, 30, 60}, 
            {70, 45, 55}, 
            {35, 40, 50}  
        };
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                if (marks[i][j] < 40) {
                    System.out.println("Student " + (i + 1) + " scored less than 40 in " + subjects[j]);
                }
            }
        }

    }
    public static void main(String args[])
    {
        Stud_Course s1 = new Stud_Course();
        s1.stud_dett();
        s1.course_dett();
}
}
