package com.example.justfood;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.justfood.model.user;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class registrationpage extends AppCompatActivity {
    EditText Rmobile,Rname,Remail,Raddress,Rpassword;
    Button register1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrationpage);

        Rmobile=(EditText)findViewById(R.id.Rmobile);
        Rname=(EditText)findViewById(R.id.Rname);
        Remail=(EditText)findViewById(R.id.Remail);
        Raddress=(EditText)findViewById(R.id.Raddress);
        Rpassword=(EditText)findViewById(R.id.Rpassword);

        register1=(Button)findViewById(R.id.register1);


        //init firebase
        //final FirebaseDatabase database=FirebaseDatabase.getInstance();
       // final DatabaseReference table_user=database.getReference("Users");

        register1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ProgressDialog mDialog = new ProgressDialog(registrationpage.this);
                mDialog.setMessage("Please wait...");
                mDialog.show();

                /*table_user.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        //check if user phone number exists
                        if(dataSnapshot.child(Rmobile.getText().toString()).exists())
                        {
                            mDialog.dismiss();
                            Toast.makeText(registrationpage.this,"User mobile number already exists",Toast.LENGTH_SHORT).show();
                        }
                        else
                        {
                            mDialog.dismiss();
                            user Ruser = new user(Raddress.getText().toString(),Remail.getText().toString(),Rname.getText().toString(),Rpassword.getText().toString());
                            table_user.child(Rmobile.getText().toString()).setValue(Ruser);
                            Toast.makeText(registrationpage.this,"REgistration successfull!! happy ordering",Toast.LENGTH_SHORT).show();
                            finish();
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });*/

                Intent Lpage = new Intent(registrationpage.this,loginpage.class);
                startActivity(Lpage);




            }
        });
    }
}
