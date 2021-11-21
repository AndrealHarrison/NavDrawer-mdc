package com.zybooks.navdrawerfragments.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.NavHostFragment;

import com.zybooks.navdrawerfragments.R;
import com.zybooks.navdrawerfragments.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {


    Button mGallery1;
    Button mGallery2;
    Button mGallery3;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home,container,false);
        mGallery1 = (Button) root.findViewById(R.id.button1);
        mGallery2 = (Button) root.findViewById(R.id.button2);
        mGallery3 = (Button) root.findViewById(R.id.button3);

        mGallery1.setOnClickListener(v -> {
            galleryItemButtonClick(v, 1);
        });
        mGallery2.setOnClickListener(v -> {
            galleryItemButtonClick(v, 2);
        });
        mGallery3.setOnClickListener(v -> {
            galleryItemButtonClick(v, 3);
        });

        return root;
    }

    public void galleryItemButtonClick(View view, int item){
        HomeFragmentDirections.ActionNavHomeToNavGallery action = HomeFragmentDirections.actionNavHomeToNavGallery();
        action.setGalleryItemId(item);
        NavHostFragment.findNavController(HomeFragment.this).navigate(action);

    }

}