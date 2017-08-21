package com.example.coco.cardfoldview;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.loopeer.cardstack.CardStackView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    public static Integer[] TEST_DATAS = new Integer[]{
            R.color.a1,
            R.color.a2,
            R.color.a3,
            R.color.a4,
            R.color.a5,
            R.color.a6,
            R.color.a7,
            R.color.a8,
            R.color.a9,
            R.color.a10,
            R.color.a11,
            R.color.a12,
            R.color.a13,
            R.color.a14,
            R.color.a15,
            R.color.a1,
            R.color.a2,
            R.color.a3,
            R.color.a4,
            R.color.a5,
            R.color.a6,
            R.color.a7,
            R.color.a8,
            R.color.a9,
            R.color.a10,
            R.color.a11,
            R.color.a12,
            R.color.a13,
            R.color.a14,
            R.color.a15

    };
    private CardStackView cardStackView;
    private TestStackAdapter testStackAdapter;
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cardStackView = (CardStackView) findViewById(R.id.stackview);
        testStackAdapter = new TestStackAdapter(this);
        cardStackView.setAdapter(testStackAdapter);
        testStackAdapter.updateData(Arrays.asList(TEST_DATAS));

    }


}