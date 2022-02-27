package com.example.pdfreader;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.github.barteksc.pdfviewer.PDFView;

public class MainActivity2 extends AppCompatActivity {

    PDFView pdfView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        pdfView=findViewById(R.id.pdfView);
         int storyposition =getIntent().getIntExtra("key",0);

         if (storyposition==0){
             pdfView.fromAsset("story1.pdf").load();
         }

    }
}