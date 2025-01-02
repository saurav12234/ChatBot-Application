package chatbotapplication.controller;

import org.springframework.web.bind.annotation.*;

@RestController

public class Controller {


    @GetMapping("/m1")
    public String getResponse(@RequestBody String userMessage) {
        return processMessage(userMessage);
    }

    private String processMessage(String message) {

        try {


            if (message.toLowerCase().contains("hello")) {
                return "ky be gandu";
            } else if (message.toLowerCase().contains("hi")) {
                return "Pay lagu darling";
            } else if (message.toLowerCase().contains("bye")) {
                return "Gand marun ghe na tikdach";
            }
        }

     catch (Exception e){
            e.printStackTrace();

    }
        return " neet type kar be zhayta";
}


}
