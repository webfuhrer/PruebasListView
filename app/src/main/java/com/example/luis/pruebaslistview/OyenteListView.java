package com.example.luis.pruebaslistview;

import android.app.ListActivity;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

/**
 * Created by luis on 20/11/2017.
 */

public class OyenteListView extends ListActivity{
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {

        Log.v("clicado",String.valueOf(position));
    }
}
