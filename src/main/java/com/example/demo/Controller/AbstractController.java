package com.example.demo.Controller;

import com.example.demo.Service.Abstract.Application;
import com.example.demo.Service.Abstract.GUIFactory;
import com.example.demo.Service.Abstract.MACGUIFactory;
import com.example.demo.Service.Abstract.WindowsGUIFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/UI")
public class AbstractController {

    @PostMapping("/{OperatingSystem}")
    public ResponseEntity<String>getApplicationUI(@PathVariable String OperatingSystem){
        GUIFactory guiFactory;
        try{
            if(OperatingSystem.equalsIgnoreCase("Windows")){
                guiFactory=new WindowsGUIFactory();
                Application application = new Application(guiFactory);
                application.RenderCompleteUI();
                return ResponseEntity.ok("UI has Successfully Completed for : "+OperatingSystem);
            }else if(OperatingSystem.equalsIgnoreCase("MAC")){
                guiFactory = new MACGUIFactory();
                Application application = new Application(guiFactory);
                application.RenderCompleteUI();
                return ResponseEntity.ok("UI has Successfully Completed for : " + OperatingSystem);
            }else{
                return ResponseEntity.ok("UI hasn't Been Created" );
            }

        }catch (Exception e){
            return ResponseEntity.badRequest().body("Error : "+e.getMessage());
        }
    }
}
