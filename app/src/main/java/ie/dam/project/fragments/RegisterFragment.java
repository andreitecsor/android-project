package ie.dam.project.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import ie.dam.project.R;
import ie.dam.project.BeginActivity;

public class RegisterFragment extends Fragment {
    private Button loginNowButton;

    public RegisterFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_register, container, false);
        initialiseComponents(view);
        loginNowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BeginActivity beginActivity = (BeginActivity) getContext(); //poate returna null. WATCH OUT!!!
                if (beginActivity != null) {
                    beginActivity.getSupportFragmentManager().beginTransaction().replace(R.id.act_begin_frame_layout,
                            new LoginFragment()).commit();
                }
            }
        });
        return view;
    }

    private void initialiseComponents(View view) {
        loginNowButton = view.findViewById(R.id.frg_register_button_login);
    }
}