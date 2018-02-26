package mx.iteso.erickgarcia.ejerciciolistview;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by erickgarcia on 21/02/18.
 */

// una clase por cada list view
public class ListViewPredeterminado extends Activity {
    ListView listView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_pred);
        listView = (ListView) findViewById(R.id.list_view_pred);

        // proveedor de datos para la vista
        ArrayAdapter<String> adapter;

        // definicion de origen de datos para el adapter
        String[] marcas = new String[] {"ford", "nissan", "BMW", "KIA"};

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, marcas);

        listView.setAdapter(adapter);
    }
}
