package com.example.songr.web;

import com.example.songr.domain.Album;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Controller
public class HelloController {

    @GetMapping("/hello")
   String hello(){
        return "hello";
    }
    @GetMapping("/capitalize/{name}")
    String capitalize(@PathVariable (name="name",required = false)String name,Model model){
      name=name.toUpperCase(Locale.ROOT);
        model.addAttribute("name",name);
        return "capitalize";
    }
    @ResponseBody
    @GetMapping("/albums")
    List<Album> albums(){
        List<Album> albums=new ArrayList<>();
        albums.add(new Album("Sale el Sol","Shakira",2,193,"https://www.bing.com/images/blob?bcid=qAbo8lEwJPoDyQKP0509tDMFQlEA.....1E"));
        albums.add(new Album("Goodbye Lullaby"," Avril Lavigne",4,226,"https://upload.wikimedia.org/wikipedia/en/thumb/9/94/Goodbye_Lullaby.png/220px-Goodbye_Lullaby.png"));
        return albums;
    }
}
