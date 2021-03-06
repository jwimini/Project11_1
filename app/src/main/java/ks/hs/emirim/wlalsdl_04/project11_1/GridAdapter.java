package ks.hs.emirim.wlalsdl_04.project11_1;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class GridAdapter extends BaseAdapter {
    Context context;
    int[] posterIds = {R.drawable.i1,R.drawable.i2,R.drawable.i3,R.drawable.i4,R.drawable.i5,R.drawable.i6,R.drawable.i7,R.drawable.i8,R.drawable.i9,R.drawable.i10,R.drawable.i1,R.drawable.i2,R.drawable.i3,R.drawable.i4,R.drawable.i5,R.drawable.i6,R.drawable.i7,R.drawable.i8,R.drawable.i9,R.drawable.i10};
    int[] titleIds = {R.string.poster_title1,R.string.poster_title2,R.string.poster_title3,R.string.poster_title4,R.string.poster_title5,R.string.poster_title6,R.string.poster_title7,R.string.poster_title8,R.string.poster_title9,R.string.poster_title10,R.string.poster_title1,R.string.poster_title2,R.string.poster_title3,R.string.poster_title4,R.string.poster_title5,R.string.poster_title6,R.string.poster_title7,R.string.poster_title8,R.string.poster_title9,R.string.poster_title10};

    public  GridAdapter(Context context){
        this.context = context;
    }

    @Override
    public int getCount() {
        return posterIds.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        ImageView imgv = new ImageView(context);
        imgv.setLayoutParams(new ViewGroup.LayoutParams(200,300));
        imgv.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imgv.setPadding(5,5,5,5);
        imgv.setImageResource(posterIds[i]);

        final int pos = i;
        imgv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(context);
                View dialogView = View.inflate(context,R.layout.dialog1, null);
                ImageView imgvLarge = dialogView.findViewById(R.id.imgv_Large);
                imgvLarge.setImageResource(posterIds[pos]);
                dialog.setTitle("Large Poster");
                dialog.setTitle(titleIds[pos]);
                dialog.setIcon(R.drawable.fi);
                dialog.setView(dialogView);
                dialog.setNegativeButton("close",null);
                dialog.show();
            }
        });
        return imgv;
    };
}
