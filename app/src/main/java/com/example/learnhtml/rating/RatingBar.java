//package com.example.learnhtml.rating;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.TextView;
//import android.widget.Toast;
//import android.os.Bundle;
//import android.view.Menu;
//import android.view.MenuItem;
//import android.view.View;
//import android.widget.RatingBar;
//import android.widget.Button;
//import android.widget.Toast;
//
//import com.example.learnhtml.R;
//
//public class RatingBar extends AppCompatActivity {
//
//    private RatingBar rBar;
//    private TextView tView;
//    private Button btn;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_rating_bar);
//
//
//        final RatingBar simpleRatingBar = findViewById(R.id.ratingBar1);
//        Button submitButton = findViewById(R.id.btnGet);
//        // perform click event on button
//        submitButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // get values and then displayed in a toast
//                String totalStars = "Total Stars:: " + simpleRatingBar.getNumStars();
//                String rating = "Rating :: " + simpleRatingBar.getRating();
//                Toast.makeText(getApplicationContext(), totalStars + "\n" + rating, Toast.LENGTH_LONG).show();
//            }
//        });
//    }