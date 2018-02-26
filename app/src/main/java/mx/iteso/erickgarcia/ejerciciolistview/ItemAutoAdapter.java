package mx.iteso.erickgarcia.ejerciciolistview;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by erickgarcia on 21/02/18.
 */

// TODO: para que quiero el activity? y donde usare getDropDownViewTheme
public class ItemAutoAdapter extends ArrayAdapter<ItemAutoModel> {
    private List<ItemAutoModel> itemAutoModels;
    private Activity activity;

    public ItemAutoAdapter(Activity activity, int r, ArrayList<ItemAutoModel> itemAutoModels){
        super(activity, r, itemAutoModels);
        this.activity = activity;
        this.itemAutoModels = itemAutoModels;
    }

    public View getDropDownViewTheme(int p, View view, ViewGroup viewGroup) {
        return getView(p, view, viewGroup);
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View view, @NonNull ViewGroup viewGroup) {
        LayoutInflater inflater = activity.getLayoutInflater();
        final View item = inflater.inflate(R.layout.item_auto, viewGroup, false);
        TextView lbl_marca = (TextView) item.findViewById(R.id.lbl_marca);
        TextView lbl_modelo = (TextView) item.findViewById(R.id.lbl_modelo);
        TextView lbl_año = (TextView) item.findViewById(R.id.lbl_año);
        ImageView imageView_logo = (ImageView) item.findViewById(R.id.ic_logo);
        RelativeLayout relativeLayout = (RelativeLayout) item.findViewById(R.id.rl_item_auto);

        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(activity, "posicion: " + String.valueOf(position+1) + " marca: "+ itemAutoModels.get(position).getMarca(),
                        Toast.LENGTH_SHORT).show();
            }
        });

        lbl_marca.setText(itemAutoModels.get(position).getMarca());
        lbl_modelo.setText(itemAutoModels.get(position).getModelo());
        lbl_año.setText(itemAutoModels.get(position).getAño());
        imageView_logo.setImageResource(itemAutoModels.get(position).getLogo());

        return item;
    }
}
