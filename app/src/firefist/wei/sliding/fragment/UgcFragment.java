package firefist.wei.sliding.fragment;


import firefist.wei.main.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class UgcFragment extends Fragment {
	
	private View showLeft;
	private TextView mTopTitleView;
	private ImageView mTopBackView;
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View view = inflater.inflate(R.layout.local, null);
		showLeft = (View) view.findViewById(R.id.head_layout_showLeft);
		
		mTopTitleView = (TextView) showLeft.findViewById(R.id.head_layout_text);
		mTopTitleView.setText(getString(R.string.tab_local_news));
		mTopBackView = (ImageView) showLeft.findViewById(R.id.head_layout_back);
		mTopBackView.setBackgroundResource(R.drawable.biz_ugc_main_back_normal);
		return view;
	}

}
