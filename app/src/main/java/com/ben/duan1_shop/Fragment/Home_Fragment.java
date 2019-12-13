package com.ben.duan1_shop.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toolbar;
import android.widget.ViewFlipper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ben.duan1_shop.R;

import static android.R.anim.slide_out_right;

public class Home_Fragment extends Fragment {
    ListView listView;
    //QC
    ViewFlipper viewFlipper;

    int image[]=new int[]{R.drawable.hinh1,R.drawable.hinh2,R.drawable.hinh3,R.drawable.hinh4};


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.home_fragment,container,false);

        viewFlipper = (ViewFlipper)view.findViewById(R.id.viewflip);
        listView = view.findViewById(R.id.Lv);


        for(int i=0; i<image.length; i++){
            // This will create dynamic image views and add them to the ViewFlipper.
            setFlipperImage(image[i]);
        }


        return view;
    }

    private void setFlipperImage(int res) {
        Log.i("Set Filpper Called", res+"");
        ImageView image = new ImageView(getContext());
        image.setBackgroundResource(res);
        viewFlipper.addView(image);
        viewFlipper.setFlipInterval(4000);
        viewFlipper.setAutoStart(true);
    } // end QC


}
