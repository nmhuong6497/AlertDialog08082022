package com.huong.alertdialog08082022;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnAlertDialog, btnDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAlertDialog = findViewById(R.id.button_alert_dialog);
        btnDialog = findViewById(R.id.button_dialog);

        btnAlertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Thông báo");
                builder.setMessage("Đã có bản cập nhật mới");
                builder.setIcon(android.R.drawable.star_on);
                builder.setCancelable(false);

                builder.setPositiveButton("Cập nhật", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });

                builder.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });

                builder.show();
            }
        });

        btnDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dialog = new Dialog(MainActivity.this);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.layout_picker_color_dialog);

                Window window = dialog.getWindow();

                if (window != null) {
                    window.setGravity(Gravity.BOTTOM);
                    window.setLayout(ConstraintLayout.LayoutParams.MATCH_PARENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
                }

                dialog.show();
            }
        });
    }
}