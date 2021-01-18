package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("home")
public class ConvertController {
    @GetMapping
    public String showForm(){
        return "index";
    }

    @PostMapping
    public String changeMoney(@RequestParam("change") String change,@RequestParam("value1") String money1, Model model){
        double money=0;
        String erro="";
        try{
            money=Double.parseDouble(money1);
        }catch (Exception e){
            money=0;
            erro="Hay nhap dung gia tri";
            model.addAttribute("erro",erro);
        }
        double money2=0;
        String dv="";
        if(change.equals("1")){
            money2=money/23000;
            dv="USD";
        }
        if(change.equals("2")){
            money2=money*23000;
            dv="VND";
        }
        model.addAttribute("money2",money2);
        model.addAttribute("dv",dv);

        return "index";

    }
}
