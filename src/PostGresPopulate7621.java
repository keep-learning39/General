/**
 * Created by puranisu on 6/23/2016.
 */
public class PostGresPopulate7621
{
    public static void main(String[] args)
    {
        String template_String = "INSERT INTO \"Replicate7587\".\"TableReplicate7587\" ( id, dateoftest) VALUES (";

        int dateVal = 1 , monthValue = 1 ;

        // 1,000,000

        for (int i = 1; i <=300; i++)
        {
            if(dateVal==28)
            {
                dateVal = 1;
                monthValue ++;
            }
            System.out.println(template_String + i + " , \'2016-"+monthValue+"-"+dateVal+"\');");
            dateVal++;
        }

    }
}


//111,'2016-01-01');