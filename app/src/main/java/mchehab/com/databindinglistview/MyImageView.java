package mchehab.com.databindinglistview;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

import com.squareup.picasso.Picasso;

import static java.security.AccessController.getContext;

/**
 * Created by muhammadchehab on 12/31/17.
 */

public class MyImageView extends AppCompatImageView {

    public MyImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public void setImageURL(String url){
        Picasso.with(getContext()).load(url).into(this);
    }
}
