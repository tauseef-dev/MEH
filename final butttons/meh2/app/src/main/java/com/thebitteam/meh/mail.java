package com.thebitteam.meh;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;


public class mail extends Fragment {
    ImageView button;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View V= inflater.inflate(R.layout.fragment_mail,container,false);
        button= (ImageView) V.findViewById(R.id.mail);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=null, chooser=null;
                intent=new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("mailto:"));
                String[] to={"shktauseef9892@gmail.com"};
                intent.putExtra(Intent.EXTRA_EMAIL,to);
                intent.putExtra(Intent.EXTRA_SUBJECT,"REGARDING MENTAL HEALTH ISSUE!");
                intent.setType("message/rfc822");
                chooser=Intent.createChooser(intent,"Send Email");
                startActivity(chooser);

            }
        });
        return V;
    }

}
