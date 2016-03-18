package com.example.paton.number4;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import static android.support.v4.app.ActivityCompat.startActivityForResult;

public class MainActivity extends AppCompatActivity {


    ImageView imvImagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         imvImagem = (ImageView) findViewById(R.id.imageView);


    }

    public void carregarImage(View v) {
        Intent intent = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(Intent.createChooser(intent, "Selecione uma imagem"), 0);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            Uri arquivoUri = data.getData();
            Log.d("aulas", "URI da imagem" + arquivoUri);

            imvImagem.setImageURI(arquivoUri);
        }


    }
}
