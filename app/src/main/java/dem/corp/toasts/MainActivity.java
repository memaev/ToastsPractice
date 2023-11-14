package dem.corp.toasts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.shashank.sony.fancytoastlib.FancyToast;

import dem.corp.toasts.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate( getLayoutInflater() );
        setContentView(binding.getRoot());

        binding.showToastBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                showLongToast("Hello from toast!");
                showFancyToast("ERROR", 4);
            }
        });
    }

    private void showShortToast(String message){
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    private void showLongToast(String message){
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }

    private void showFancyToast(String message, int type){
        switch (type){
            case 1:
                FancyToast.makeText(getApplicationContext(), message,FancyToast.LENGTH_SHORT, FancyToast.SUCCESS, false).show();
                break;

            case 2:
                FancyToast.makeText(getApplicationContext(), message,FancyToast.LENGTH_SHORT, FancyToast.WARNING, false).show();
                break;

            case 3:
                FancyToast.makeText(getApplicationContext(), message,FancyToast.LENGTH_SHORT, FancyToast.DEFAULT, false).show();
                break;

            case 4:
                FancyToast.makeText(getApplicationContext(), message,FancyToast.LENGTH_LONG, FancyToast.ERROR, false).show();
                break;
        }

    }

}