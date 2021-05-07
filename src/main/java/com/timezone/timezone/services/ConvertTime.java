package com.timezone.timezone.services;

import com.timezone.timezone.dto.Input;
import com.timezone.timezone.dto.Response;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.TimeZone;

@Service
public class ConvertTime {

    public Response convertTimezone(Input inputDto) throws ParseException {
        Response response = new Response();
        SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");
        Date now = formatter.parse(inputDto.getHour());
        TimeZone.setDefault( TimeZone.getTimeZone("UTC"));
        Time time = new Time(now.getTime());
        LocalTime localDate = time.toLocalTime();
        String hours = localDate.getHour() < 10 ? "0" + localDate.getHour() : String.valueOf(localDate.getHour());
        String minutes = localDate.getMinute() < 10 ? "0" + localDate.getMinute() : String.valueOf(localDate.getMinute()) ;
        String seconds = localDate.getSecond() < 10 ? "0" + localDate.getSecond() : String.valueOf(localDate.getSecond()) ;
        String hourUTC = hours + ":" + minutes + ":" + seconds;
        response.setHour(hourUTC);
        response.setTimezone(TimeZone.getDefault().getDisplayName());
        return response;
    }
}
