package friend.snru.ac.th.emercall.fragrament;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import friend.snru.ac.th.emercall.R;

/**
 * Created by Admin on 20/2/2561.
 */

public class MainFragment extends Fragment{

//    Explicit
    private String tag = "MyTagV1"
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //        For Station 1
        ImageView station1ImageView = getView().findViewById(R.id.ImageViewStation1);
        station1ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d(tag, "You Click Image Station1");




            }
        });

        //        For Station 2



        //        For Station 3


        //        For Station 4



    }  //Main Method

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_police, container, false);

        return view;
    }

}   //Main Class
