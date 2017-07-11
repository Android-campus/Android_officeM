# Android_QuizApp_V2

## 安卓开发基础 练习

![APP示意图](https://github.com/zouyang1230/Android_QuizApp_V2/raw/master/images/Quiz.jpg)

### Tips：

g:\zygit\Android_officeM

1、Google使用basename-vX模式作为支持库的命名约定。 
* -vX指所支持的最低API级别。因此，以appcompat-v7为例，这里的-v7就是说Google兼容库可以应用到Android API 7及以上级别的设备上。

2、Fragment.onCreateView(...)方法中的组件引用几乎等同于Activity.onCreate(...)方法的处理。唯一的区别是我们调用了fragment视图的View.findViewById(int)方法。
以前使用的Activity.findViewById(int)方法十分便利，能够在后台自动调用View.findViewById(int)方法；而Fragment类没有对应的便利方法，因此我们必须自己完成调用。


3、FragmentManager类具体管理的是：
* fragment队列
* fragment事务回退栈
