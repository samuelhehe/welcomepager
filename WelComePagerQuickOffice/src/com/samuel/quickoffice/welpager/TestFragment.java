package com.samuel.quickoffice.welpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public final class TestFragment extends Fragment {
	private static final String KEY_CONTENT = "TestFragment:Content";

	public static TestFragment newInstance(String content) {
		TestFragment fragment = new TestFragment();
		fragment.mContent = content;
		return fragment;
	}

	private int content;

	public static TestFragment newInstance(int content) {
		TestFragment fragment = new TestFragment();
		fragment.content = content;
		return fragment;
	}

	private String mContent = "";

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		RelativeLayout layout = (RelativeLayout) inflater.inflate(
				R.layout.welcome_content,null);

		TextView welcome_content_subject_tv , welcome_content_subject_detail_tv; 
		
		welcome_content_subject_tv = (TextView) layout.findViewById(R.id.welcome_content_subject_tv);
		
		welcome_content_subject_detail_tv = (TextView) layout.findViewById(R.id.welcome_content_subject_detail_tv);
		
		ImageView  welcome_content_iconlay = (ImageView) layout.findViewById(R.id.welcome_content_iconlay).findViewById(R.id.welcome_content_iconlay_iv);
		
		switch (content) {
		case 0:
			layout.setBackgroundResource(R.drawable.qo_startup_screen1);
			welcome_content_iconlay.setImageResource(R.drawable.icon);
			break;
		case 1:
			layout.setBackgroundResource(R.drawable.qo_startup_screen2);
			
			welcome_content_subject_tv.setText(getResources().getString(R.string._quickoffice_welcomepager_title2));
			welcome_content_subject_detail_tv.setText(getResources().getString(R.string.google_quickoffice_30_10_4000_welcomepager_content2));
			break;
		case 2:
			layout.setBackgroundResource(R.drawable.qo_startup_screen3);
			welcome_content_iconlay.setImageResource(R.drawable.icon);
			welcome_content_subject_tv.setText(getResources().getString(R.string._quickoffice_welcomepager_title3));
			welcome_content_subject_detail_tv.setText(getResources().getString(R.string.google_quickoffice_30_10_4000_welcomepager_content3));
			break;
		default:
			break;
		}

		return layout;
	}


	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		outState.putString(KEY_CONTENT, mContent);
	}
}
