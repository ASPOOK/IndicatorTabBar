
# IndicatorTabBar for Android

## How to use

If you want use this view, the operation is as follows:

Because the IndicatorTabBar has custom attributes, if you want use them, you must add your own namespace in your xml file in the first component:

```xml
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    xmlns:widgets="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical" >

</LinearLayout>
```

Then, add it into your layout file, to use the IndicatorTabBar:
```xml
 <com.andy.widgets.IndicatorTabBar
        android:id="@+id/tab_indicator"
        android:layout_width="match_parent"
        android:layout_height="50dp"
        android:background="@color/bg_color"
        widgets:tab_text_color="@color/tab_text_color"
        widgets:tab_text_selected_color="@color/tab_text_selected_color"
        widgets:tab_text_size="18sp" />
```

##Demo
 ![image](https://github.com/aspook/IndicatorTabBar/raw/master/images/demo.jpg)
 






