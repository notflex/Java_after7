class Student{
    private String name;
    private String group;
    private int course;
    private float lessons_count;
    private float[] marks;
    Student(String name, String group, int course, int lessons, float[] marks){
        this.marks = marks;
    }
    public int KickOrNot(){
        float a = 0;
        marks = new float[(int) lessons_count];
        for (int i = 0; i < lessons_count; i++){
            a+=marks[i];
        }
        if((a/lessons_count) <3 ){
            return 0;
        }
        else{
            return 1;
        }

    }
}
