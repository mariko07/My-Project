package mariko.remidiandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PlayerPertama extends AppCompatActivity {

    EditText edtPlayer1, edtPlayer2;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtPlayer1 = (EditText) findViewById(R.id.edtPlayer1);
        edtPlayer2 = (EditText) findViewById(R.id.edtPlayer2);
        next = (Button) findViewById(R.id.next);



        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String tampung = edtPlayer1.getText().toString();
                String tampung1 = edtPlayer2.getText().toString();

                if (TextUtils.isEmpty(tampung) && TextUtils.isEmpty(tampung1)){
                    Toast.makeText(getApplicationContext(), "HAYO, DI ISI DULU FORMNYA GAN", Toast.LENGTH_LONG).show();
                }else {

                    Intent shrd = new Intent(PlayerPertama.this, PlayerKedua.class);
                    shrd.putExtra("tampung", tampung);
                    shrd.putExtra("tampung1", tampung1);
                    startActivity(shrd);
                }
            }
        });
    }
}
