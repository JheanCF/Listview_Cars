package com.jp.listas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.ib.custom.toast.CustomToastView;
import com.jp.listas.models.Car;

import java.util.ArrayList;

public class Formulario_Car extends AppCompatActivity implements View.OnClickListener {
    Car car=new Car();
    private EditText txtName;
    private EditText txtCC;
    private EditText txtModel;
    private EditText txtValue;
    private EditText txtUrl;
    private Button btnAgregar;
    public static ArrayList<Car> listas=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario__car);
        txtName=findViewById(R.id.txtName);
        txtCC= findViewById(R.id.txtCC);
        txtModel=findViewById(R.id.txtModel);
        txtValue=findViewById(R.id.txtValue);
        txtUrl=findViewById(R.id.txtUrlCar);
        btnAgregar=findViewById(R.id.btnAgregar);
        btnAgregar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnAgregar) {
            String name = txtName.getText().toString();
            String cc = (txtCC.getText().toString());
            String model = (txtModel.getText().toString());
            String value = txtValue.getText().toString();
            String url = txtUrl.getText().toString();


            if (name.isEmpty()) {
                CustomToastView.makeInfoToast(this, "Error al validar Nombre", R.layout.custom_toast).show();
                return;
            }
            if (cc.isEmpty()) {
                CustomToastView.makeInfoToast(this, "Error al validar Cylinder Capacity", R.layout.custom_toast).show();
                return;
            }
            if (model.isEmpty()) {
                CustomToastView.makeInfoToast(this, "Error al validar Model", R.layout.custom_toast).show();
                return;
            }
            if (value.isEmpty()) {
                CustomToastView.makeInfoToast(this, "Error al validar Value", R.layout.custom_toast).show();
                return;
            }
            if (url.isEmpty()) {
                CustomToastView.makeInfoToast(this, "Error al validar Url", R.layout.custom_toast).show();
                return;
            }
            Car ncar;
            ncar=new Car();
            ncar.setName(name);
            ncar.setCilindraje(cc);
            ncar.setModel(model);
            ncar.setValue(value);
            ncar.setImage(url);
            listas.add(ncar);
            Intent intent= new Intent(this, MainActivity.class);
            startActivity(intent);

        }
    }
}