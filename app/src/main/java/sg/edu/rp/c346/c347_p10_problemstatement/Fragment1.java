package sg.edu.rp.c346.c347_p10_problemstatement;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

public class Fragment1 extends Fragment
{
  Button btnAddText;
  TextView tvFrag1;
  Button btnChangeColor;
  LinearLayout linearLayout;

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_1, container, false);

    tvFrag1 = view.findViewById(R.id.tv);
    btnChangeColor =  view.findViewById(R.id.btnChangeColor);
    linearLayout = view.findViewById(R.id.linearLayout);

    btnChangeColor.setOnClickListener(new View.OnClickListener()
    {
      @Override
      public void onClick(View view)
      {
        Random random = new Random();
        int color = Color.argb(random.nextInt(255), random.nextInt(255), random.nextInt(255), random.nextInt(255));
        linearLayout.setBackgroundColor(color);
      }
    });

    return view;
  }

}