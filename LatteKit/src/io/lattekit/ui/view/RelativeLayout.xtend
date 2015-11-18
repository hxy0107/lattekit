package io.lattekit.ui.view

import android.R.id
import android.content.Context
import android.util.Log
import android.view.View
import io.lattekit.ui.view.LatteView
import java.util.HashMap

public class RelativeLayout extends LatteView<android.widget.RelativeLayout> {
	
	
	def void init() {
	}
		
	override View createAndroidView(Context a) {
		return new android.widget.RelativeLayout(a);
	}

	override android.widget.RelativeLayout.LayoutParams createLayoutParams(int width, int height) {
		var lp = new android.widget.RelativeLayout.LayoutParams(width, height);
		return lp
	}
	
	override onChildrenAdded() {
		super.onChildrenAdded()
		val viewMap = newHashMap()
		subviews.forEach[
			if (rootAndroidView.id == -1 && id != null) {
				rootAndroidView.id = id.hashCode;
			}
			if (id != null) {
				viewMap.put(id, rootAndroidView.id);
			}
			Log.d("Latte", '''My Id = «rootAndroidView.id»''')
		]
		
		subviews.forEach[
			addLayoutRules(viewMap)			
		]		
	}
	
	def addLayoutRules(LatteView virtualView, HashMap<String,Integer> viewIds) {
		var rootAndroidView = virtualView.rootAndroidView
		var oldParams = rootAndroidView.layoutParams as android.widget.RelativeLayout.LayoutParams;
		val newParams = new android.widget.RelativeLayout.LayoutParams(oldParams); 
				
		virtualView.attributes.forEach[key, value|
			if (key == "below") {
				newParams.addRule(android.widget.RelativeLayout.BELOW, viewIds.get(value));
			} else if (key == "above") {
				newParams.addRule(android.widget.RelativeLayout.ABOVE, viewIds.get(value));
			} else if (key == "toStartOf") {
				newParams.addRule(android.widget.RelativeLayout.START_OF, viewIds.get(value));
			} else if (key == "toEndOf") {
				newParams.addRule(android.widget.RelativeLayout.END_OF, viewIds.get(value));
			} else if (key == "alignStart") {
				newParams.addRule(android.widget.RelativeLayout.ALIGN_START, viewIds.get(value));
			} else if (key == "alignEnd") {
				 newParams.addRule(android.widget.RelativeLayout.ALIGN_END, viewIds.get(value));
			} else if (key == "alignTop") {
				newParams.addRule(android.widget.RelativeLayout.ALIGN_TOP, viewIds.get(value));
			} else if (key == "alignBottom") {
				newParams.addRule(android.widget.RelativeLayout.ALIGN_BOTTOM, viewIds.get(value));
			} else if (key == "alignParentStart" ) {
				if (value == true)   { newParams.addRule(android.widget.RelativeLayout.ALIGN_PARENT_START);}
				else newParams.removeRule(android.widget.RelativeLayout.ALIGN_PARENT_START);
			} else if (key == "alignParentEnd") {
				if (value == true)   { newParams.addRule(android.widget.RelativeLayout.ALIGN_PARENT_END); }
				else newParams.removeRule(android.widget.RelativeLayout.ALIGN_PARENT_END);
			} else if (key == "alignParentTop") {
				if (value == true)   { newParams.addRule(android.widget.RelativeLayout.ALIGN_PARENT_TOP);}
				else newParams.removeRule(android.widget.RelativeLayout.ALIGN_PARENT_TOP);
			} else if (key == "alignParentBottom") {
				if (value == true)   { newParams.addRule(android.widget.RelativeLayout.ALIGN_PARENT_BOTTOM); }
				else newParams.removeRule(android.widget.RelativeLayout.ALIGN_PARENT_BOTTOM);
			}

		]
		rootAndroidView.layoutParams =  newParams;		
	}
	
}