package Demos;

import Demos.CutsomException.*; // User Defined Exception

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExceptionHandling {
    public static void main(String[] args) throws Exception {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());

            if(n > 5 && n < 10){
                throw new MyException("Greater than 5");
            }else if(n > 10 && n < 15){
                throw new YourException("Lesser than 10");
            }

            System.out.println(n);
        }
        catch (MyException e){
            System.err.println(e.getMessage());
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
        finally {
            br.close();
        }
    }
}
