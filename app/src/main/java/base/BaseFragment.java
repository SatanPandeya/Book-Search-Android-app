package base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.book.R;

/**
 * Created by wolfmatrix on 4/17/17.
 */

public abstract class BaseFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FrameLayout fragmentContainer = (FrameLayout) inflater.inflate(R.layout.fragment_container, container, false);
        return inflater.inflate(getFragmentResourceLayout(), fragmentContainer, true);
    }

    protected abstract int getFragmentResourceLayout();
}
