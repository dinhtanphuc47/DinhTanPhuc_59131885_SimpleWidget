    package vn.ntu.edu.phucboo.dinhtanphuc_59131885_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.support.v4.app.INotificationSideChannel;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


    public class MainActivity extends AppCompatActivity {
    EditText edtTen, edtNgaysinh , edtkhac;
    RadioGroup rdg;
    RadioButton rdbnam, rdbnu;
    CheckBox film, music, cafe, alone, cooking;
    Button dangky;
    String Notification;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addView();
        addEvent();

    }
    private void addView(){
        edtTen = findViewById(R.id.Ten);
        edtNgaysinh = findViewById(R.id.ngaysinh);
        edtkhac = findViewById(R.id.khac);
        rdg = findViewById(R.id.rdg);
        rdbnam = findViewById(R.id.nam);
        rdbnu = findViewById(R.id.nu);
        film = findViewById(R.id.film);
        music = findViewById(R.id.music);
        cafe = findViewById(R.id.cafe);
        alone = findViewById(R.id.alone);
        cooking = findViewById(R.id.cooking);
        dangky = findViewById(R.id.dangky);
    }
    private void addEvent(){
        dangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                danhsach();
            }
        });

    }
    private void danhsach(){
        Notification = edtTen.getText().toString() + "\n" +
                "Ngày sinh : " + edtNgaysinh.getText().toString()+ "\n" +
                "Giới tính : " ;
        if ( rdg.getCheckedRadioButtonId() == R.id.nam)
            Notification += "Nam" + "\n"  + "Sở thích : ";
        else
            Notification += "Nữ" + "\n"  + "Sở thích : ";
        if (film.isChecked())
            Notification += "Xem phim; ";
        if (music.isChecked())
            Notification += "Nghe nhạc; ";
        if (cafe.isChecked())
            Notification += "Đi cafe với bạn bè; ";
        if (alone.isChecked())
            Notification += "Ở nhà một mình; ";
        if (cooking.isChecked())
            Notification += "Vào bếp nấu ăn; ";
        Notification += edtkhac.getText().toString();
        Toast.makeText(getApplicationContext(),Notification, Toast.LENGTH_SHORT).show();
    }


}
