package lab2.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Declare buttons
        final Button buttonUserPass = findViewById(R.id.userPassButton);
        final Button buttonUsername = findViewById(R.id.usernameButton);
        final Button buttonPassword = findViewById(R.id.passwordButton);

        // Set listener on first button
        buttonUsername.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText user = findViewById(R.id.usernameID);
                buttonUsername.setText(user.getText().toString());
            }
        });

        // Set listener on second button
        buttonPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText pass = findViewById(R.id.passwordID);
                buttonPassword.setText(pass.getText().toString());
            }
        });

        // Set listener on third button
        buttonUserPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText buttonUserPass1 = findViewById(R.id.usernameID);
                EditText buttonUserPass2 = findViewById(R.id.passwordID);
                buttonUserPass.setText(buttonUserPass1.getText().toString() + '-' + buttonUserPass2.getText().toString());
            }
        });
    }
}
