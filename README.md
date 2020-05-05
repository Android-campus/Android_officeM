# Android_officeM

### Tips：


1、Google使用basename-vX模式作为支持库的命名约定。 
* -vX指所支持的最低API级别。因此，以appcompat-v7为例，这里的-v7就是说Google兼容库可以应用到Android API 7及以上级别的设备上。

2、Fragment.onCreateView(...)方法中的组件引用几乎等同于Activity.onCreate(...)方法的处理。唯一的区别是我们调用了fragment视图的View.findViewById(int)方法。
以前使用的Activity.findViewById(int)方法十分便利，能够在后台自动调用View.findViewById(int)方法；而Fragment类没有对应的便利方法，因此我们必须自己完成调用。


3、FragmentManager类具体管理的是：
* fragment队列
* fragment事务回退栈

4、单例：
单例是特殊的java类，在创建实例时，一个单例类仅允许创建一个实例。
应用能在内存里存多久，单例就能存多久。因此将对象列表保存在单例里的话，就能随时获取到crime数据，不管activity和fragment的生命周期怎么变化。
使用单例还要注意一点： Android从内存里移除应用时，单例对象也就不复存在了。虽然CrimeLab单例不是数据持久保存的好方案，但它确实能保证仅拥有一份crime数据，并且方便了控制层类间的数据传递
要创建单例，需创建一个带有私有构造方法及get()方法的类。如实例已存在， get()方法
就直接返回它；如实例还不存在， get()方法就会调用构造方法创建它。
示例：
```java
package com.zy.android_officem;

import android.content.Context;

public class CrimeLab {

    private static CrimeLab sCrimeLab;

    public static CrimeLab get(Context context) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }
    private CrimeLab(Context context) {
    }

}
```
5、没有LayoutManager的支持，不仅RecyclerView无法工作，还会导致应用崩溃。所以， RecyclerView视图创建完成后，得立即转交给了LayoutManager对象。
* RecyclerView类的任务就是回收再利用以及定位屏幕上的TextView视图。实际上，定位的任务被委托给了LayoutManager。
* 除了在屏幕上定位列表项， LayoutManager还负责定义屏幕滚动行为。因此，没有LayoutManager， RecyclerView也就没法正常工作了。 Android将来可能会改变这种工作模式，但现在就是如此。

6、采用fragment而不是activity来管理应用UI，可绕开Android系统activity使用规则的限制。

7、在Bundle中存储和恢复的数据类型只能是基本数据类型（primitive type）以及可以实现Serializable或Parcelable接口的对象。在Bundle中保存定制类对象不是个好主意，因为你取回的对象可能已经过时了。
* 比较好的做法是，通过其他方式保存定制类对象，而在Bundle中保存对象对应的基本数据类型的标示符。

……
### 省略一大坨，有需要完整笔记的童鞋可以私信我邮箱









