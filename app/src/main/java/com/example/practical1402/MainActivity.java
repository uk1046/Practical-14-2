// MainActivity.java
package com.example.practical1402;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.practical1402.R;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private Button changeImageButton;
    private int currentImageIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        changeImageButton = findViewById(R.id.changeImageButton);
    }

    public void changeImage(View view) {
        currentImageIndex = (currentImageIndex == 1) ? 2 : 1;
        String imageName = "image" + currentImageIndex;
        int resourceId = getResources().getIdentifier(imageName, "drawable", getPackageName());
        imageView.setImageResource(resourceId);
    }
}
