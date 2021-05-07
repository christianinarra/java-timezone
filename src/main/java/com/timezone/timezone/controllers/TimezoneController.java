package com.timezone.timezone.controllers;

import com.timezone.timezone.dto.Input;
import com.timezone.timezone.dto.Response;
import com.timezone.timezone.services.ConvertTime;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;

@RestController
@RequestMapping("timezone")
public class TimezoneController {

    private final ConvertTime convertTimeService = new ConvertTime();

    @PostMapping("/convert")
    public ResponseEntity<Response> convert(@RequestBody Input inputDto) throws ParseException {
        Response response = convertTimeService.convertTimezone(inputDto);
        return new ResponseEntity<Response>(response, HttpStatus.OK);
    }
}
