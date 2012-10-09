package jp.classmethod.android.sample.checkablelistview;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.FrameLayout;
import android.widget.RadioButton;

public class CustomItemView extends FrameLayout implements Checkable {

	private RadioButton mRadioButton;
	
	public CustomItemView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		initialize();
	}

	public CustomItemView(Context context, AttributeSet attrs) {
		super(context, attrs);
		initialize();
	}

	public CustomItemView(Context context) {
		super(context);
		initialize();
	}
	
	private void initialize() {
		addView(inflate(getContext(), R.layout.custom_item_view, null));
		mRadioButton = (RadioButton) findViewById(R.id.radio_button);
	}

	@Override
	public boolean isChecked() {
		return mRadioButton.isChecked();
	}

	@Override
	public void setChecked(boolean checked) {
		mRadioButton.setChecked(checked);
		setBackgroundColor(checked ? Color.LTGRAY : Color.TRANSPARENT);
	}

	@Override
	public void toggle() {
	}

}
