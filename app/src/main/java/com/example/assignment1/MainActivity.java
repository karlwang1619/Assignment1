package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
int buttonController = 0;
    public void setTime(View view) {
        if (buttonController == 0) {

            //put in normal time
            Calendar calendarSydney = Calendar.getInstance();
            int hour = calendarSydney.get(Calendar.HOUR);
            if (hour == 0 ) {
                hour = 12;
            }
            int minute = calendarSydney.get(Calendar.MINUTE);
            int second = calendarSydney.get(Calendar.SECOND);
            int timeOfDay = calendarSydney.get(Calendar.AM_PM);
            String amPm= new String();
            if (timeOfDay == 1 ) {
                amPm = "pm";
            }
            else {
                amPm = "am";
            }
            String sydTime = String.format("%02d", hour) + ":" +
                    String.format("%02d", minute) + ":" + String.format("%02d", second) + " " +
                    amPm;
            displaySydney(sydTime);


            Calendar calendarToronto = new GregorianCalendar(TimeZone.getTimeZone("Canada/Eastern"));
            calendarToronto.setTimeInMillis(calendarToronto.getTimeInMillis());
            hour = calendarToronto.get(Calendar.HOUR);
            if ( hour == 0 ) {
                hour = 12;
            }
            minute = calendarToronto.get(Calendar.MINUTE);
            second = calendarToronto.get(Calendar.SECOND);
            timeOfDay = calendarToronto.get(Calendar.AM_PM);
            amPm= new String();
            if (timeOfDay == 1 ) {
                amPm = "pm";
            }
            else {
                amPm = "am";
            }
            String torontoTime = String.format("%02d", hour) + ":" +
                    String.format("%02d", minute) + ":" + String.format("%02d", second) + " "
                    + amPm;
            displayToronto(torontoTime);

            Calendar calendarShanghai = new GregorianCalendar(TimeZone.getTimeZone("Asia/Shanghai"));
            calendarShanghai.setTimeInMillis(calendarShanghai.getTimeInMillis());
            hour = calendarShanghai.get(Calendar.HOUR);
            if ( hour == 0 ) {
                hour = 12;
            }
            minute = calendarShanghai.get(Calendar.MINUTE);
            second = calendarShanghai.get(Calendar.SECOND);
            timeOfDay = calendarShanghai.get(Calendar.AM_PM);
            amPm= new String();
            if (timeOfDay == 1 ) {
                amPm = "pm";
            }
            else {
                amPm = "am";
            }
            String shanghaiTime = String.format("%02d", hour) + ":" +
                    String.format("%02d", minute) + ":" + String.format("%02d", second) + " "
                    + amPm;
            displayShanghai(shanghaiTime);

            Calendar calendarTokyo = new GregorianCalendar(TimeZone.getTimeZone("Japan"));
            calendarTokyo.setTimeInMillis(calendarShanghai.getTimeInMillis());
            hour = calendarTokyo.get(Calendar.HOUR);
            if (hour == 0 ) {
                hour = 12;
            }
            minute = calendarTokyo.get(Calendar.MINUTE);
            second = calendarTokyo.get(Calendar.SECOND);
            timeOfDay = calendarTokyo.get(Calendar.AM_PM);
            amPm= new String();
            if (timeOfDay == 1 ) {
                amPm = "pm";
            }
            else {
                amPm = "am";
            }
            String tokyoTime = String.format("%02d", hour) + ":" +
                    String.format("%02d", minute) + ":" + String.format("%02d", second) + " "
                    +amPm;
            displayTokyo(tokyoTime);

            Calendar calendarHawaii = new GregorianCalendar(TimeZone.getTimeZone("US/Hawaii"));
            calendarHawaii.setTimeInMillis(calendarHawaii.getTimeInMillis());
            hour = calendarHawaii.get(Calendar.HOUR);
            if (hour == 0 ) {
                hour = 12;
            }
            minute = calendarHawaii.get(Calendar.MINUTE);
            second = calendarHawaii.get(Calendar.SECOND);
            timeOfDay = calendarHawaii.get(Calendar.AM_PM);
            amPm= new String();
            if (timeOfDay == 1 ) {
                amPm = "pm";
            }
            else {
                amPm = "am";
            }
            String hawaiiTime = String.format("%02d", hour) + ":" +
                    String.format("%02d", minute) + ":" + String.format("%02d", second) + " " +
                    amPm;
            displayHawaii(hawaiiTime);
            buttonController += 1;
        }

        //what to do if changing to 24hr time?
        else {

            Calendar calendarSydney = Calendar.getInstance();
            int hour = calendarSydney.get(Calendar.HOUR);
            int minute = calendarSydney.get(Calendar.MINUTE);
            int second = calendarSydney.get(Calendar.SECOND);
            int timeOfDay = calendarSydney.get(Calendar.AM_PM);
            if (timeOfDay == 1 ) {
                hour += 12;
            }

            String sydTime = String.format("%02d", hour) + ":" +
                    String.format("%02d", minute) + ":" + String.format("%02d", second);
            displaySydney(sydTime);


            Calendar calendarToronto = new GregorianCalendar(TimeZone.getTimeZone("Canada/Eastern"));
            calendarToronto.setTimeInMillis(calendarToronto.getTimeInMillis());
            hour = calendarToronto.get(Calendar.HOUR);
            minute = calendarToronto.get(Calendar.MINUTE);
            second = calendarToronto.get(Calendar.SECOND);
            timeOfDay = calendarToronto.get(Calendar.AM_PM);
            if (timeOfDay == 1 ) {
                hour += 12;
            }
            String torontoTime = String.format("%02d", hour) + ":" +
                    String.format("%02d", minute) + ":" + String.format("%02d", second);
            displayToronto(torontoTime);

            Calendar calendarShanghai = new GregorianCalendar(TimeZone.getTimeZone("Asia/Shanghai"));
            calendarShanghai.setTimeInMillis(calendarShanghai.getTimeInMillis());
            hour = calendarShanghai.get(Calendar.HOUR);
            minute = calendarShanghai.get(Calendar.MINUTE);
            second = calendarShanghai.get(Calendar.SECOND);
            timeOfDay = calendarShanghai.get(Calendar.AM_PM);
            if (timeOfDay == 1 ) {
                hour += 12;
            }
            String shanghaiTime = String.format("%02d", hour) + ":" +
                    String.format("%02d", minute) + ":" + String.format("%02d", second);
            displayShanghai(shanghaiTime);

            Calendar calendarTokyo = new GregorianCalendar(TimeZone.getTimeZone("Japan"));
            calendarTokyo.setTimeInMillis(calendarShanghai.getTimeInMillis());
            hour = calendarTokyo.get(Calendar.HOUR);
            minute = calendarTokyo.get(Calendar.MINUTE);
            second = calendarTokyo.get(Calendar.SECOND);
            timeOfDay = calendarTokyo.get(Calendar.AM_PM);
            if (timeOfDay == 1 ) {
                hour += 12;
            }
            String tokyoTime = String.format("%02d", hour) + ":" +
                    String.format("%02d", minute) + ":" + String.format("%02d", second);
            displayTokyo(tokyoTime);

            Calendar calendarHawaii = new GregorianCalendar(TimeZone.getTimeZone("US/Hawaii"));
            calendarHawaii.setTimeInMillis(calendarHawaii.getTimeInMillis());
            hour = calendarHawaii.get(Calendar.HOUR);
            minute = calendarHawaii.get(Calendar.MINUTE);
            second = calendarHawaii.get(Calendar.SECOND);
            timeOfDay = calendarHawaii.get(Calendar.AM_PM);
            if (timeOfDay == 1 ) {
                hour += 12;
            }
            String hawaiiTime = String.format("%02d", hour) + ":" +
                    String.format("%02d", minute) + ":" + String.format("%02d", second);
            displayHawaii(hawaiiTime);

            buttonController -= 1;
        }




    }


    private void displaySydney(String time) {
        TextView textView = findViewById(R.id.sydneyTime);
        textView.setText(time);
    }

    private void displayToronto(String time) {
        TextView textView = findViewById(R.id.torontoTime);
        textView.setText(time);
    }

    private void displayShanghai(String time) {
        TextView textView = findViewById(R.id.shanghaiTime);
        textView.setText(time);
    }
    private void displayTokyo(String time) {
        TextView textView = findViewById(R.id.tokyoTime);
        textView.setText(time);
    }

    private void displayHawaii(String time ) {
        TextView textview = findViewById(R.id.hawaiiTime);
        textview.setText(time);
    }
}


