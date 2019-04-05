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
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.rengwuxian.materialedittext.MaterialEditText;

//import org.w3c.dom.Text;

public class loginpage extends AppCompatActivity {
    Button btnlogin,btnregister;
    EditText edtphone,edtpassword;
    //private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);

        btnlogin=(Button)findViewById(R.id.btnlogin);
        btnregister=(Button)findViewById(R.id.btnregister);
        edtphone=(MaterialEditText)findViewById(R.id.phone);
        edtpassword=(MaterialEditText)findViewById(R.id.password);

        //init firebase
        //FirebaseDatabase database=FirebaseDatabase.getInstance();
       // DatabaseReference root_reference=database.getReference();
       // final DatabaseReference table_user= root_reference.child("Users");


        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final ProgressDialog mDialog = new ProgressDialog(loginpage.this);
                mDialog.setMessage("Please wait...");
                mDialog.show();
                /*table_user.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        //check if user doesn't exist in database

                        if (dataSnapshot.child(edtphone.getText().toString()).exists()) {
                            //get user information
                            mDialog.dismiss();
                            user user1 = dataSnapshot.child(edtphone.getText().toString()).getValue(user.class);
                            if (user1.getPassword().equals(edtpassword.getText().toString())) {
                                Toast.makeText(loginpage.this, "Login successfull", Toast.LENGTH_SHORT).show();

                            }
                            else {
                                Toast.makeText(loginpage.this, "login failed!!try again", Toast.LENGTH_SHORT).show();
                            }

                        }
                        else {
                            mDialog.dismiss();
                            Toast.makeText(loginpage.this, "user not registered. Please Register", Toast.LENGTH_SHORT).show();
                        }
                    }
                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });*/
            }
        });

        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerpage = new Intent(loginpage.this,registrationpage.class);
                startActivity(registerpage);
            }
        });


    }
}
