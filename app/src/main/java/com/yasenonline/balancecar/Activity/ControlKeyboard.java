package com.yasenonline.balancecar.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.yasenonline.balancecar.R;

public class ControlKeyboard extends AppCompatActivity implements View.OnClickListener {

    Button btn_forward;
    Button btn_Back;
    Button btn_Left;
    Button btn_Right;
    Button btn_Menu;

    private void Initial(){
        btn_forward = findViewById(R.id.btn_forward_keyboard);
        btn_Back    = findViewById(R.id.btn_back_keyboard);
        btn_Left    = findViewById(R.id.btn_left_keyboard);
        btn_Right   = findViewById(R.id.btn_right_keyboard);
        btn_Menu    = findViewById(R.id.btn_menu_keyboard);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_keyboard);

        Initial();


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_forward_keyboard:
                goForward();
                break;
            case R.id.btn_back_keyboard:
                goBack();
                break;
            case R.id.btn_right_keyboard:
                turnRight();
                break;
            case R.id.btn_left_keyboard:
                turnLeft();
                break;
            case R.id.btn_menu_keyboard:
                GoActivityMenu();
                break;
            default:
                Toast.makeText(this, "Button Click not catch!", Toast.LENGTH_SHORT).show();
        }
    }

    private void GoActivityMenu() {
        //TODO: Bluetooth
    }

    private void turnLeft() {
        //TODO: Bluetooth
    }

    private void turnRight() {
        //TODO: Bluetooth
    }

    private void goBack() {
        //TODO: Bluetooth
    }

    private void goForward(){
        //TODO: Bluetooth
    }


}
