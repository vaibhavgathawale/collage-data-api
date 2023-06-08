package com.collagedataapi;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/collage")
public class CollageController {
    @GetMapping("/{collageId}")
    public ResponseEntity<Collage> getCollageDetails(@PathVariable ("collageId") Long collageId){

        Collage c1 = new Collage();
        c1.setCollageId(1L);
        c1.setCollageName("SRTMUN");
        c1.setAddress("Nanded");

        return new ResponseEntity<Collage>(c1,HttpStatus.OK);

    }
}
