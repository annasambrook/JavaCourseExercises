package com.amal.Share_Service.Resource;

import com.amal.Share_Service.entity.Share;
import com.amal.Share_Service.service.ShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
public class ShareResource {
    @Autowired
    private ShareService shareService;

    @GetMapping(path = "/shares/{mid}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Share searchMovieById(@PathVariable("mid") int id) {
        return shareService.searchSharebyId(id);
    }
}
