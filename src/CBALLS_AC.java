/**
 * Created by puranisu on 1/12/2016.
 */
//package janLong2016;

        import java.io.BufferedReader;
        import java.util.StringTokenizer;
        import java.io.*;

public class CBALLS_AC {


    static int counter=0,oddCounter=0;
    public static void main(String[] args){

        try{

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            int t=Integer.parseInt(br.readLine());

            while(t-->0){


                int n=Integer.parseInt(br.readLine());

                if(n==1){

                    int a = Integer.parseInt(br.readLine());

                    if(a==1)System.out.println(1);
                    else System.out.println(0);

                }else{

                    counter=0;
                    oddCounter=0;
                    int arr[] = new int[n];
                    StringTokenizer str=new StringTokenizer(br.readLine());

                    int length = str.countTokens()-1;

                    int a=Integer.parseInt(str.nextToken()),b=0,i=1;

                    if(a%2!=0)oddCounter++;

                    int value=a;

                    arr[0]=a;


                    while(length-->0){

                        b=Integer.parseInt(str.nextToken());

                        if(a>b){
                            // if prev number is greater than the current number ---
                            // make them both equal


                            counter=counter+(a-b);
                            b=b+(a-b);
                        }

                        arr[i++]=b;

                        if(b%2!=0)oddCounter++;

                        a=b;

                    }

                    int min=oddCounter,temp=0;

                    int k=3;i=0;
                    //value--;

                    while(k<=value){

                        n=arr.length;temp=0;i=0;

                        while(n-->0){




                            if(arr[i]%k!=0){

                                temp=temp+((k*((arr[i]/k)+1))-arr[i]);

                                if(temp>min)break;

                            }
                            i++;

                        }


                        if(temp<min)min=temp;

                        //System.out.println("temp= "+temp);

                        k++;
                    }

                    //System.out.println("counter= "+counter+"  min = "+min);

                    System.out.println(min+counter);

                }

            }

        }catch(Exception e){

            //System.out.println(e);
            return;

        }

    }


}