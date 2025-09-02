package com.example.listview2025.repository;

import com.example.listview2025.R;
import com.example.listview2025.model.Inmueble;

import java.util.ArrayList;
import java.util.List;

public class InmuebleRepository {
    private static InmuebleRepository instance;
    private List<Inmueble> inmuebles;

    private InmuebleRepository() { initializeInmuebles();}

    public static InmuebleRepository getInstance() {
        if (instance == null) {
            instance = new InmuebleRepository();
        }
        return instance;
    }
    private void initializeInmuebles() {
            inmuebles = new ArrayList<>();

            inmuebles.add(new Inmueble(
                    "Colón 945, San Luis, SL , Argentina",
                    75,
                    100000,
                    R.drawable.casa01
            ));
        inmuebles.add(new Inmueble(
                "Av. España 180, San Luis, SL , Argentina",
                90,
                150000,
                R.drawable.casa02
        ));
        inmuebles.add(new Inmueble(
                "San Martín 200, V. Mercedes, SL , Argentina",
                100,
                200000,
                R.drawable.casa03
        ));
        inmuebles.add(new Inmueble(
                "Av. Agüada 150, Juana Koslay, SL, Argentina",
                150,
                250000,
                R.drawable.casa04
        ));
    }
    public List<Inmueble> getInmuebles() {
        return inmuebles;
    }
}
