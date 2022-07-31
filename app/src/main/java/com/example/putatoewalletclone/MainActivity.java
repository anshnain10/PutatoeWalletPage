package com.example.putatoewalletclone;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button Transferbtn;
    private ImageButton addmoneybtn,sendmoneybtn,btnredeem;
    private TextView textView12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Transferbtn=findViewById(R.id.Transferbtn);
        addmoneybtn=findViewById(R.id.addmoneybtn);
        sendmoneybtn=findViewById(R.id.sendmoneybtn);
        btnredeem=findViewById(R.id.btnredeem);
        textView12=findViewById(R.id.textView12);
        Transferbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.custom_dialog,null);
                final EditText txt_input = (EditText)mView.findViewById(R.id.txt_input);
                final EditText Amnt_txt = (EditText)mView.findViewById(R.id.Amnt_txt);
                Button btn_cancel = (Button)mView.findViewById(R.id.btn_cancel);
                Button btn_submit = (Button)mView.findViewById(R.id.btn_submit);
                alert.setView(mView);
                final AlertDialog alertDialog = alert.create();
                alertDialog.setCanceledOnTouchOutside(false);
                btn_cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
                btn_submit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
                alertDialog.show();
            }
        });
        addmoneybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.custom_dialog2,null);
                final EditText nobtn = (EditText)mView.findViewById(R.id.nobtn);
                Button btn_cancel1 = (Button)mView.findViewById(R.id.btn_cancel1);
                Button btn_submit1 = (Button)mView.findViewById(R.id.btn_submit1);
                alert.setView(mView);
                final AlertDialog alertDialog = alert.create();
                alertDialog.setCanceledOnTouchOutside(false);
                btn_cancel1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
                btn_submit1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
                alertDialog.show();

            }
        });
        sendmoneybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.custom_dialog3,null);
                Button buttonadd = (Button)mView.findViewById(R.id.buttonadd);
                alert.setView(mView);
                final AlertDialog alertDialog = alert.create();
                alertDialog.setCanceledOnTouchOutside(false);
                buttonadd.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
                alertDialog.show();

            }
        });
        btnredeem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.custom_dialog4,null);
                final EditText aadharbtn = (EditText)mView.findViewById(R.id.aadharbtn);
                Button btnsubmit3 = (Button)mView.findViewById(R.id.btnsubmit3);
                alert.setView(mView);
                final AlertDialog alertDialog = alert.create();
                alertDialog.setCanceledOnTouchOutside(false);
                btnsubmit3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        textView12.setText("5.1");
                        Toast.makeText(MainActivity.this, "Added Successfully", Toast.LENGTH_SHORT).show();
                        alertDialog.dismiss();

                    }
                });
                alertDialog.show();
            }
        });

    }
}