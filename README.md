# Android_QuizApp_V2

## 安卓开发基础 练习

![APP示意图](https://github.com/zouyang1230/Android_QuizApp_V2/raw/master/images/Quiz.jpg)

### Tips：

1、drawable目录说明：四个目录各自的后缀名代表设备的像素密度
* mdpi：中等像素密度屏幕（约160dpi）
* hdpi：高像素密度屏幕（约240dpi）
* xhdpi：超高像素密度屏幕（约320dpi）
* xxhdpi：超超高像素密度屏幕（约480dpi）

2、构建Question模型类：
![APP示意图](https://github.com/zouyang1230/Android_QuizApp_V2/raw/master/images/question.jpg)


3、资源id
* 任何添加到res/drawable目录中，后缀名为.png、 .jpg或者.gif的文件都会自动获得资源ID。（注意，文件名必须是小写字母且不能有任何空格符号。）
* 这些资源ID并不按照屏幕密度匹配。因此不需要在运行的时候确定设备的屏幕像素密度，只需在代码中引用这些资源ID就可以了。应用运行时，操作系统知道如何在特定的设备上显示匹配的图片。
