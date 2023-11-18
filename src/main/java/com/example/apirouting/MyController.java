/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.GetMapping;
 * import org.springframework.web.bind.annotation.RestController;
 * 
 *
 */
package com.example.apirouting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.apirouting.MyService;
import java.util.*;

@RestController
class MyController {
     MyService pages = new MyService();

     @GetMapping("/")
     public String homePage() {
          return pages.getHomePage();
     }

     @GetMapping("/about")
     public String aboutPage() {
          return pages.getAboutPage();
     }
}
