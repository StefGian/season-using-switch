package season;

public class Season {

    public static void main(String[] args) {
        String month = "April";
        
        switch (month){
            case "January":
            case "February":
            case "December":
                System.out.println("Winter");
                break;
            case "March":
            case "May":
            case "April":
                System.out.println("Spring");
                break;
            case "June":
            case "July":
            case "August":
                System.out.println("Summer");
                break;
            case "September":
            case "October":
            case "November":
                System.out.println("Autumn");
                break;
        
        
        }
    }
    
}
