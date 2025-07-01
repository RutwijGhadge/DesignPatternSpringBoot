package com.example.demo.Service.Abstract;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

public class Application {
  private final Button button;
  private final CheckBox checkBox;

    public Application(GUIFactory factory) {
       button= factory.createButton();
       checkBox=factory.createCheckBox();
    }

    public void RenderCompleteUI(){
        button.Paint();
        checkBox.render();
    }
}
