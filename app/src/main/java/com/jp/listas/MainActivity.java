package com.jp.listas;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.Volley;
import com.jp.listas.models.Car;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    public static ArrayList<Car> car = new ArrayList();
    private ListView listCars;
    private EditText img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // Car c =new Car("Ford ranger","2000cc","2021","300000",null);
        listCars=findViewById(R.id.listCarros);

       /* listCar.add(new Car("Ford ranger","2000cc","2021","300000",null));
        listCar.add(new Car("Furia","2000cc","2021","300000",null));
        listCar.add(new Car("Corvete","2000cc","2021","300000",null));*/
        Formulario_Car main=new Formulario_Car();
        car=Formulario_Car.listas;



        AdapterCar adapterCar=new AdapterCar(this,car);
        listCars.setAdapter(adapterCar);
        listCars.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this,"Ha pulsado el elemento numero"+position,Toast.LENGTH_SHORT).show();
    }

}