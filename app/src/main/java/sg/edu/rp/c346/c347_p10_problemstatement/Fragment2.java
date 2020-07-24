package sg.edu.rp.c346.c347_p10_problemstatement;

import android.media.Image;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class Fragment2 extends Fragment
{
  ImageView iv;

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_2, container, false);

    iv = view.findViewById(R.id.iv);

    String imageUrl = "https://www.wtffunfact.com/wp-content/uploads/2020/06/WTF-Fun-Fact-Amazon-Always-For-Customers-.png";
    Picasso.with(this.getContext()).load(imageUrl).into(iv);

    return view;
  }

}