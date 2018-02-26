package mx.iteso.erickgarcia.ejerciciolistview;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by erickgarcia on 21/02/18.
 */

public class ListViewPersonalizado extends Activity {
    ListView listView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_pers);

        listView = (ListView) findViewById(R.id.list_view_pers);
        ItemAutoModel itemAutoModel;
        ArrayList<ItemAutoModel> autoModelArrayList = new ArrayList<>();
        ItemAutoAdapter itemAutoAdapter;

        String[] marca = new String[]{"BMW", "Ford", "Nissan", "KIA"};
        String[] modelo = new String[]{"carisimo de paris", "Ford Fiesta", "Tsuru", "NPI"};
        String[] año = new String[] {"2018", "2015", "2010", "1990"};
        int[] logo = new  int[]{R.drawable.logo_bmw, R.drawable.ford_logo, R.drawable.logo_nissan, R.drawable.logo_kia};
        // TODO: esta wea si esta del pinches diablo
        for (int index = 0; index < marca.length; index++) {
            itemAutoModel = new ItemAutoModel(marca[index], modelo[index], año[index], logo[index]);
            autoModelArrayList.add(itemAutoModel);
        }

        itemAutoAdapter = new ItemAutoAdapter(this, 0, autoModelArrayList);
        listView.setAdapter(itemAutoAdapter);
    }
}
