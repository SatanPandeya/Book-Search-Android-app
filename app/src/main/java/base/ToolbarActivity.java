package base;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.book.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by wolfmatrix on 4/17/17.
 */

public abstract class ToolbarActivity extends BaseActivity {
    @BindView(R.id.toolbarId)
    Toolbar toolbar;
    @BindView(R.id.titleId)
    TextView title;
    private Typeface typeface;

    @Override
    protected int getResourceLayout() {
        return R.layout.activity_toolbar;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View container = findViewById(R.id.flContainer);
        if (container instanceof ViewGroup) {
            ((ViewGroup) container)
                    .addView(LayoutInflater.from(this)
                            .inflate(getToolbarResourceLayout(), (ViewGroup) container, false));
        }
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        typeface = Typeface.createFromAsset(getAssets(), "fonts/Ubuntu-Bold.ttf");
    }

    public void setToolbarTitle(int toolbarTitle) {
        title.setText(toolbarTitle);
        title.setTypeface(typeface);
    }

    protected abstract int getToolbarResourceLayout();
}
