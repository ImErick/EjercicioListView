package mx.iteso.erickgarcia.ejerciciolistview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by erickgarcia on 21/02/18.
 */

public class MainActivity extends Activity {
    Button btn_list_pred, btn_list_per, btn_list_recycler;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_list_pred = (Button) findViewById(R.id.btn_list_pred);
        btn_list_per = (Button) findViewById(R.id.btn_list_per);
        btn_list_recycler = (Button) findViewById(R.id.btn_list_recycler);

        btn_list_pred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListViewPredeterminado.class);
                startActivity(intent);
            }
        });

        btn_list_per.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListViewPersonalizado.class);
                startActivity(intent);
            }
        });
    }
}
