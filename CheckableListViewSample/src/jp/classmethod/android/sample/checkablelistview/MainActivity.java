package jp.classmethod.android.sample.checkablelistview;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.os.Bundle;
import android.widget.AbsListView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class MainActivity extends Activity {

	private ListView mListView;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		mListView = new ListView(getApplicationContext());
		setContentView(mListView);
		ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
		HashMap<String, String> item1 = new HashMap<String, String>();
		item1.put("title", "リュウレンジャー");
		list.add(item1);
		HashMap<String, String> item2 = new HashMap<String, String>();
		item2.put("title", "シシレンジャー");
		list.add(item2);
		HashMap<String, String> item3 = new HashMap<String, String>();
		item3.put("title", "テンマレンジャー");
		list.add(item3);
		HashMap<String, String> item4 = new HashMap<String, String>();
		item4.put("title", "キリンレンジャー");
		list.add(item4);
		HashMap<String, String> item5 = new HashMap<String, String>();
		item5.put("title", "ホウオウレンジャー");
		list.add(item5);
		HashMap<String, String> item6 = new HashMap<String, String>();
		item6.put("title", "キバレンジャー");
		list.add(item6);

		SimpleAdapter adapter = new SimpleAdapter(getApplicationContext(),
				list, R.layout.custom_item, new String[] { "title" },
				new int[] { R.id.text_view1 });
		mListView.setChoiceMode(AbsListView.CHOICE_MODE_SINGLE);
		mListView.setAdapter(adapter);
		mListView.setItemChecked(0, true);
	}
}
