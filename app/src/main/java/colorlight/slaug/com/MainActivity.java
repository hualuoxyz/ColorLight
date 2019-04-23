package colorlight.slaug.com;

import android.graphics.drawable.AnimationDrawable;
import android.os.Message;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity{

    private ImageView ligtht;
    private Button open;
    private Button close;
    private Button play;
    private Button quit;
    private Button red;
    private Button orange;
    private Button yellow;
    private Button green;
    private Button indigo;
    private Button blue;
    private Button purpule;
    private Button useful;
    private AnimationDrawable animationDrawable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        //初始化各个组件
        initView();

        //为各个组件绑定单击监听器
        registerButton();

    }

    //初始化各个组件
    private void initView(){
        ligtht = (ImageView)findViewById(R.id.light);
        open = (Button) findViewById(R.id.open);
        close = (Button)findViewById(R.id.close);
        play = (Button)findViewById(R.id.play);
        quit = (Button)findViewById(R.id.quit);
        red = (Button)findViewById(R.id.red);
        orange = (Button)findViewById(R.id.orange);
        yellow = (Button)findViewById(R.id.yellow);
        green = (Button)findViewById(R.id.green);
        indigo = (Button)findViewById(R.id.indigo);
        blue = (Button)findViewById(R.id.blue);
        purpule = (Button)findViewById(R.id.purpule);
        useful = (Button)findViewById(R.id.useful);

        ligtht.setImageLevel(1);
    }

    //为各个组件绑定单击监听器
    private void registerButton(){
        View.OnClickListener click = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.open:
                        if (animationDrawable!=null) animationDrawable.stop();
                        ligtht.setImageResource(R.drawable.colorchanges);
                        ligtht.setImageLevel(1);
                        break;
                    case R.id.close:
                        if (animationDrawable!=null) animationDrawable.stop();
                        ligtht.setImageResource(R.drawable.colorchanges);
                        ligtht.setImageLevel(4);
                        break;
                    case R.id.play:
                        ligtht.setImageResource(R.drawable.colorchanges);
                        if (animationDrawable!=null) animationDrawable.stop();
                        break;
                    case R.id.quit:
                        if (animationDrawable!=null) animationDrawable.stop();
                        MainActivity.this.finish();
                        break;
                    case R.id.red:
                        if (animationDrawable!=null) animationDrawable.stop();
                        ligtht.setImageResource(R.drawable.colorchanges);
                        ligtht.setImageLevel(7);
                        break;
                    case R.id.orange:
                        if (animationDrawable!=null) animationDrawable.stop();
                        ligtht.setImageResource(R.drawable.colorchanges);
                        ligtht.setImageLevel(12);
                        break;
                    case R.id.yellow:
                        if (animationDrawable!=null) animationDrawable.stop();
                        ligtht.setImageResource(R.drawable.colorchanges);
                        ligtht.setImageLevel(17);
                        break;
                    case R.id.green:
                        if (animationDrawable!=null) animationDrawable.stop();
                        ligtht.setImageResource(R.drawable.colorchanges);
                        ligtht.setImageLevel(22);
                        break;
                    case R.id.indigo:
                        if (animationDrawable!=null) animationDrawable.stop();
                        ligtht.setImageResource(R.drawable.colorchanges);
                        ligtht.setImageLevel(27);
                        break;
                    case R.id.blue:
                        if (animationDrawable!=null) animationDrawable.stop();
                        ligtht.setImageResource(R.drawable.colorchanges);
                        ligtht.setImageLevel(32);
                        break;
                    case R.id.purpule:
                        if (animationDrawable!=null) animationDrawable.stop();
                        ligtht.setImageResource(R.drawable.colorchanges);
                        ligtht.setImageLevel(37);
                        break;
                    case R.id.useful:
                        alert();
                        break;
                    default:
                        break;
                }
            }
        };
        open.setOnClickListener(click);
        close.setOnClickListener(click);
        play.setOnClickListener(click);
        quit.setOnClickListener(click);
        red.setOnClickListener(click);
        orange.setOnClickListener(click);
        yellow.setOnClickListener(click);
        green.setOnClickListener(click);
        indigo.setOnClickListener(click);
        blue.setOnClickListener(click);
        purpule.setOnClickListener(click);
        useful.setOnClickListener(click);
    }

    private void alert(){
        ligtht.setImageResource(R.drawable.alert);
        animationDrawable = (AnimationDrawable)ligtht.getDrawable();
        animationDrawable.start();
    }

}

