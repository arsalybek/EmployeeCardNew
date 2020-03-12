package com.example.employeecard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class LoginFragment extends Fragment  {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login,container,false);

        Button login = view.findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchToList();
            }
        });
        return view;
    }
    public void switchToList(){
        EmpListFragment listFragment = new EmpListFragment();
        FragmentTransaction loginFragment = getFragmentManager().beginTransaction();
        loginFragment.replace(R.id.fragment_container,listFragment);
        loginFragment.addToBackStack(null);
        loginFragment.commit();
    }
}
