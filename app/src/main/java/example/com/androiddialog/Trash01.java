package example.com.androiddialog;

import android.app.AlertDialog;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/*
public class Trash01 {

    AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
    //View dialogView = getLayoutInflater().inflate(R.layout.dialog_content, null, false);
    //builder.setView(dialogView);

        builder.setView(R.layout.dialog_content);

    final AlertDialog dialog = builder.show();

    final EditText etUserName = (EditText) dialog.findViewById(R.id.etUserName);
    final EditText etPassword = (EditText) dialog.findViewById(R.id.etPassword);

    final Button btnCalcel = (Button) dialog.findViewById(R.id.btnCancel);
    final Button btnSignIn = (Button) dialog.findViewById(R.id.btnSignIn);

        btnCalcel.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            dialog.dismiss();
        }
    });

        btnSignIn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            CharSequence userName = etUserName.getText();
            if (userName.length() <= 3){
                etUserName.setError("Must be at least 3 characters");
                return;
            }
            Toast.makeText(MainActivity.this, "User " + etUserName.getText() + " With password " + etPassword.getText(), Toast.LENGTH_SHORT).show();
            dialog.dismiss();
        }
    });

}
*/