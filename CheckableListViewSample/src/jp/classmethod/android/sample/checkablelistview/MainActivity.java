package jp.classmethod.android.sample.checkablelistview;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.os.Bundle;
import android.widget.AbsListView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;

public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		SimpleAdapter adapter = new SimpleAdapter(getApplicationContext(),
				getItemList(), R.layout.list_view_item,
				new String[] { "title" }, new int[] { R.id.text_view1 });
		
		// ListView の場合
		ListView listView = new ListView(getApplicationContext());
		setContentView(listView);
		listView.setAdapter(adapter);
		// 単一選択モードにする
		listView.setChoiceMode(AbsListView.CHOICE_MODE_MULTIPLE);
		// デフォルト値をセットする
		listView.setItemChecked(0, true);
		
		// Spinner の場合
//		setContentView(R.layout.layout_main);
//		Spinner spinner = (Spinner) findViewById(R.id.spinner);
//		spinner.setAdapter(adapter);
	}
	
	private ArrayList<HashMap<String, String>> getItemList() {
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
		return list;
	}
}
