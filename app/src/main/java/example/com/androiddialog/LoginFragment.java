package example.com.androiddialog;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginFragment extends DialogFragment {

    Button btnSignIn, btnCancel;
    EditText etUserName, etPassword;


    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.dialog_content, container, false);
        setCancelable(false);
        return v;
    }

    @Override
    public void onViewCreated(View v, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(v, savedInstanceState);
        etUserName = (EditText) v.findViewById(R.id.etUserName);
        etPassword = (EditText) v.findViewById(R.id.etPassword);
        btnCancel = (Button) v.findViewById(R.id.btnCancel);
        btnSignIn = (Button) v.findViewById(R.id.btnSignIn);

        btnCancel.setOnClickListener(cancelListener);
        btnSignIn.setOnClickListener(signInListener);
    }

    View.OnClickListener cancelListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            dismiss();
        }
    };

    View.OnClickListener signInListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (etUserName.getText().length() <= 3){
                etUserName.setError("Must be at least 3 characters");
                return;
            }
            Toast.makeText(getActivity(), etUserName.getText(), Toast.LENGTH_SHORT).show();
            dismiss();
        }
    };
}
