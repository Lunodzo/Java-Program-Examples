public class Date{
    int date, month, day, year;
    public Date(int m, int d, int y){
        month = m;
        day = d;
        year = y;
    };
    public void setDate(){

        if ( studentGrade >= 90 )
            System.out.println( "A" );
        else if ( studentGrade >= 80 )
            System.out.println( "B" );
        else if ( studentGrade >= 70 )
            System.out.println( "C" );
        else if ( studentGrade >= 60 )
            System.out.println( "D" );
        else
            System.out.println( "F" );
    }

    public void getDate(){

    }

    public void displayDate(){
        Sytsem.out.printf("The Date is %d/%d/%d:", date, month, year);
    }
}