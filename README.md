# Knowledge_RecyclerView
这个项目主要记录一些RecyclerView在使用过程中常常会遇到的一些问题，做一个系统性的总结。

## 1.clipToPadding属性来实现顶部分割线效果
![](http://a3.qpic.cn/psb?/V140L2yT0frtRf/74wf9QphsEZsVBLeDvqYpZWG1ywxIELsi4Um0uOw8Iw!/b/dPIAAAAAAAAA&bo=iAJiBIgCYgQDByI!&rf=viewer_4)

* 如上图中红色标记的区域，如果使用marginTop或者paddingTop来实现的话，会有个问题：margin或者padding的区域是RecyclerView的item无法滚动到的位置。
* 如果添加个透明的item作为分割线的话，又会感觉大材小用。 
解决办法：
```
 <android.support.v7.widget.RecyclerView
        android:id="@+id/recyclerview"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:clipToPadding="false"
        android:paddingTop="20dp" />
```
android:clipToPadding属性置为false（默认为true），再配合上padding值，就可以实现顶部分割线，并且该区域可以滚动的效果。
>    Sets whether this ViewGroup will clip its children to its padding and resize (but not clip) any EdgeEffect to the padded region, if padding is present.  
>    By default, children are clipped to the padding of their parent ViewGroup. This clipping behavior is only enabled if padding is non-zero.  

上面是该方法的注释，意思如果是否允许子View在父ViewGroup所指定的padding区域内绘制，默认情况下是true，不允许的。










