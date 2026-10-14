package com.encore.server.listing;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@RestController 
public class ListingController {
    @GetMapping("/listing")
    public Listing getListing() {
        Listing jacket = new Listing("Ralph Lauren leather jacket", 10.00, "M", "black");
        return jacket;
    }
}
