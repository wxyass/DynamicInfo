package com.dynamicinfo.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.dynamicinfo.MainActivity;
import com.dynamicinfo.R;

public class LoginFragment extends Fragment implements OnClickListener {
	private EditText et_password;
	private EditText et_username;
	private Button bt_login;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.login_fragment, null);
		et_password = (EditText) view.findViewById(R.id.et_password);
		et_username = (EditText) view.findViewById(R.id.et_username);
		bt_login = (Button) view.findViewById(R.id.bt_login);
		bt_login.setOnClickListener(this);
		return view;
	}
	@Override
	public void onClick(View view) {
		// 获取文本框内容
		String name = et_username.getText().toString().trim();
		// 将内容带到MyFragment
		Fragment fragment = MyFragment.getInstance(name);
		// 替换
		MainActivity mainActivity = (MainActivity) getActivity();
		// 替换
		mainActivity.changeFragment(fragment, "myFragment");
	}

}
