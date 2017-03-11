# ListViewHeaderFooter
![图1](https://github.com/18Gray/ListViewHeaderFooter/blob/master/img/1.jpg =100x20) 

所有方案分为两类，第一类是ScrollView里面嵌套ListView，包括自定义ListView、手动设置ListView高度、自定义LinearLayout模拟ListView三种实现方法；第二类是只用ListView，包括自定义Adapter、用addHeaderView和addFooterView。一共五种方案，最佳方案是用addHeaderView和addFooterView。

## 1.自定义ListView
主要就是重载了onMeasure方法，改变了heightMeasureSpec。这里widthMeasureSpec和heightMeasureSpec用了32位的int作为参数，高2位代表模式，有三种UNSPECIFIED、EXACTLY、AT_MOST，这是自定义View的基础知识。低30位代表数值。MeasureSpec.makeMeasureSpec函数中第一个参数是高度的值，第二个参数是模式，makeMeasureSpec则是把模式和值合成为一个int值，这里赋给了高度。Integer.MAX_VALUE >> 2是int类型取30位时的最大整数，即Integer.MAX_VALUE是int的最大32位值，再右移2位，就是30位，同样是最大值，只不过是30位的最大值，所以在模式上也只能选择MeasureSpec.AT_MOST。最终这个ListView的显示高度会是其能显示出来的最大值，所有的条目都会显示出来。
优点：写法简单，不影响ListView使用。
缺点：由于高度设置成最大值，所有条目都会进行绘制，只是有些条目会在屏幕之外。举个例子，我传递的数据有20条，但是屏幕只够显示10条，此时用自定义的ListView会调用20次getView把所有条目都绘制出来，完全放弃了ListView的复用机制，跟直接写布局没有什么区别了，会造成页面加载速度缓慢的问题。另外，ListView高度必须设置成match_parent。
![图2](https://github.com/18Gray/ListViewHeaderFooter/blob/master/img/2.png =100x20)

## 2.手动设置ListView高度
去获取每个条目的View高度，然后所有子View高度相加得到总高度，并设置给ListView的LayoutParams。
优点：能够实现功能需求。
缺点：
i.每个条目的布局只能用LinearLayout，而不能用RelativeLayout，因为LinearLayout重写了onMeasure方法，才能调用listItem.measure(0, 0)这句，而其他布局没有。
ii.ListView高度必须设置成match_parent。
iii.在ListView设置Adaper和调用notifyDataSetChanged时候都要调用该方法。
iv.由于高度设置成最大值，所有条目都会进行绘制，跟第一个方法“自定义ListView”存在同样的问题。

## 3.自定义LinearLayout模拟ListView
生硬的实现了ListView的基础功能，但是ListView的复用机制完全没有，跟直接写布局有何区别。
优点：能够实现功能需求。
缺点：
i.ListView高度要设置成match_parent
ii.由于高度设置成最大值，所有条目都会进行绘制，跟“自定义ListView”存在同样的问题。

## 4.自定义Adapter
就是在Adapter中根据position分类加载。
优点：只有ListView的情况下，RecycleIn的复用机制再次发挥作用，只会绘制显示出来的条目，在页面加载速度上好很多。
缺点：写法稍微复杂。

## 5.用addHeaderView
listview.addHeaderView(banner1);
listview.addFooterView(banner2);
listview.setAdapter(adapter);
通过给ListView添加HeaderView和FooterView来实现。要注意的是，addHeaderView要在setAdapter前调用，多个addHeaderView会依次从上向下添加。通过ListView源码可以看出，调用addHeaderView之后，再调用setAdapter，在ListView中会生成一个新的HeaderViewListAdapter设置给ListView。
优点：
i.只有ListView的情况下，RecycleIn的复用机制再次发挥作用，只会绘制显示出来的条目，在页面加载速度上好很多。
ii.用addHeaderView和自定义Adapter在底层实现上是一样的，但是用addHeaderView在adapter的position处理上更加方便，因为其postion是跟传进来的数据的position对应的，而用自定义adapter显示position是比数据position多一条或几条的，所以用addHeaderView比用自定义Adapter更加易用。
缺点：目前还没有发现。
