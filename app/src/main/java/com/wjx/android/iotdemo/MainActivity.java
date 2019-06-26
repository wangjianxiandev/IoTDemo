
package com.wjx.android.iotdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.wjx.android.iotdemo.Impl.MvpModel;
import com.wjx.android.iotdemo.Impl.MvpPresent;
import com.wjx.android.iotdemo.Utils.MvpView;

public class MainActivity extends AppCompatActivity implements MvpView {

    private Button success;
    private Button fail;
    private Button complete;
    private MvpPresent mvpPresent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        success = (Button)findViewById(R.id.success)
        ;
        fail = (Button)findViewById(R.id.fail);
        complete = (Button)findViewById(R.id.complete);
        mvpPresent = new MvpPresent();
        mvpPresent.setMvpView(this);
        success.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mvpPresent.getData("normal");
            }
        });
        fail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mvpPresent.getData("error");
            }
        });

        complete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mvpPresent.getData("complete");
            }
        });
    }

    @Override
    public void showData(String data) {
        Toast.makeText(this, data, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showErrorMessage(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showComplete() {
        Toast.makeText(this, "complete", Toast.LENGTH_SHORT).show();
    }
}
