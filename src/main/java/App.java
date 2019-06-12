import models.PingPong;

import java.io.BufferedReader;
import  java.io.IOException;
import java.util.ArrayList;
import java.io.InputStreamReader;


public class App {
    public static void main (String[] args){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("I am a ping-pong application");
        System.out.println("Eater a number: ");
        try{
            String stringUserNumber = bufferedReader.readLine();
            int intUserNumber = Integer.parseInt(stringUserNumber);
            PingPong pingPong = new PingPong();
            ArrayList<Object> pingPongResult = pingPong.runPingPong(intUserNumber);
            System.out.println((pingPongResult));

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
