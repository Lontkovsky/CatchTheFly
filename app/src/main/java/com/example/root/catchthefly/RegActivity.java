package com.example.root.catchthefly;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RegActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);


    }

    public void register (View view) {


        EditText etName = (EditText) findViewById(R.id.name);
        etName.getText();
        EditText etPhone = (EditText) findViewById(R.id.phone);
        etPhone.getText();
        EditText etCardNumber = (EditText) findViewById(R.id.cardNumber);
        etCardNumber.getText();
        EditText etEmail = (EditText) findViewById(R.id.email);
        etEmail.getText();

        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                "mailto","catchtheflyapp@gmail.com", null));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
        emailIntent.putExtra(Intent.EXTRA_TEXT,
                "\nName: " + etName.getText()
                + "\nPhone:" + etPhone.getText()
                + "\nEmail:" + etEmail.getText()
                        + "\nCardNumber"+ etCardNumber.getText());
        startActivity(Intent.createChooser(emailIntent, "Send email..."));


    }
}
