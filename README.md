# Android_officeM

## ��׿����



### Tips��

g:\zygit\Android_officeM

1��Googleʹ��basename-vXģʽ��Ϊ֧�ֿ������Լ���� 
* -vXָ��֧�ֵ����API������ˣ���appcompat-v7Ϊ���������-v7����˵Google���ݿ����Ӧ�õ�Android API 7�����ϼ�����豸�ϡ�

2��Fragment.onCreateView(...)�����е�������ü�����ͬ��Activity.onCreate(...)�����Ĵ���Ψһ�����������ǵ�����fragment��ͼ��View.findViewById(int)������
��ǰʹ�õ�Activity.findViewById(int)����ʮ�ֱ������ܹ��ں�̨�Զ�����View.findViewById(int)��������Fragment��û�ж�Ӧ�ı���������������Ǳ����Լ���ɵ��á�


3��FragmentManager����������ǣ�
* fragment����
* fragment�������ջ

4��������
�����������java�࣬�ڴ���ʵ��ʱ��һ���������������һ��ʵ����
Ӧ�������ڴ�����ã��������ܴ��á���˽������б����ڵ�����Ļ���������ʱ��ȡ��crime���ݣ�����activity��fragment������������ô�仯��
ʹ�õ�����Ҫע��һ�㣺 Android���ڴ����Ƴ�Ӧ��ʱ����������Ҳ�Ͳ��������ˡ���ȻCrimeLab�����������ݳ־ñ���ĺ÷���������ȷʵ�ܱ�֤��ӵ��һ��crime���ݣ����ҷ����˿��Ʋ��������ݴ���
Ҫ�����������贴��һ������˽�й��췽����get()�������ࡣ��ʵ���Ѵ��ڣ� get()����
��ֱ�ӷ���������ʵ���������ڣ� get()�����ͻ���ù��췽����������
ʾ����
```java
package com.zy.android_officem;

import android.content.Context;

/**
 * Created by zouyang on 2017/7/16.
 */

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
5��û��LayoutManager��֧�֣�����RecyclerView�޷����������ᵼ��Ӧ�ñ��������ԣ� RecyclerView��ͼ������ɺ󣬵�����ת������LayoutManager����
* RecyclerView���������ǻ����������Լ���λ��Ļ�ϵ�TextView��ͼ��ʵ���ϣ���λ������ί�и���LayoutManager��
* ��������Ļ�϶�λ�б�� LayoutManager����������Ļ������Ϊ����ˣ�û��LayoutManager�� RecyclerViewҲ��û�����������ˡ� Android�������ܻ�ı����ֹ���ģʽ�������ھ�����ˡ�










