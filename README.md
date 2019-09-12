# MyGradleForTest
依赖库测试
- 第二次构建Gradle，第一个测试了一次

## 测试2：引用自建依赖包
### 依赖包情况说明：
  - 类：
  ```
  MyUtils
  People
  Student 继承了People类
  ```
  - 方法：
  ```
  MyUtils:public static void print
  People: public void Eat() ;  public  void Drink();所有属性的get()和set()
  student：public void Learn() ；private void NotLearn()
  ```
  - 属性：
  ```
  MyUtils:无
  People: public String Name;public int Age;public String Sex;
  Student: public String School;public String Grade;
  ```
### 引用了多少依赖包的代码？
  - 测试People的部分属性和部分方法，判断是否能删除People的其他未使用属性以及方法，以及子类Student的方法和属性
```
//测试父类的部分属性和部分方法
       People people = new People();
       people.Name = "wyb";
       people.Eat();
```
### 结果
  - 删除情况：
  ```
  com.example.mylibrary.MyUtils

  com.example.mylibrary.Student

  com.example.mylibrary.People
    public void Drink()
    public java.lang.String getName()
    public void setName(java.lang.String)
    public int getAge()
    public void setAge(int)
    public java.lang.String getSex()
    public void setSex(java.lang.String)
    public int Age
    public java.lang.String Sex

  com.example.mylibrary.BuildConfig

  com.example.mylibrary.People

	Line 348: com.example.mylibrary.R$string
	Line 392: com.example.mylibrary.R$layout
	Line 919: com.example.mylibrary.R$style
	Line 1110: com.example.mylibrary.R$integer
	Line 1311: com.example.mylibrary.R$styleable
	Line 1551: com.example.mylibrary.R$id
	Line 2233: com.example.mylibrary.R$dimen
	Line 2327: com.example.mylibrary.R$interpolator
	Line 2328: com.example.mylibrary.R
	Line 2693: com.example.mylibrary.R$color
	Line 2769: com.example.mylibrary.R$drawable
	Line 3505: com.example.mylibrary.R$bool
	Line 3802: com.example.mylibrary.R$anim
	Line 3912: com.example.mylibrary.R$attr
  ```
  - 疑问：
    - 为什么  com.example.mylibrary.People出现了两次
    - BuildConfig是啥
    - R文件是啥
### 结果分析
  - People文件的未使用的属性以及方法成功删除
  - Student类成功删除
  - MyUtils成功删除
  - 另外还有R文件以及BuildConfig文件也成功删除
