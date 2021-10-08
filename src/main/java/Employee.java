/**
 * Project name(项目名称)：类的封装 class-encapsulation
 * Package(包名): PACKAGE_NAME
 * Class(类名): Employee
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/8
 * Time(创建时间)： 9:59
 * Version(版本): 1.0
 * Description(描述)：
 * 封装将类的某些信息隐藏在类内部，不允许外部程序直接访问，只能通过该类提供的方法来实现对隐藏信息的操作和访问。
 * 例如：一台计算机内部极其复杂，有主板、CPU、硬盘和内存， 而一般用户不需要了解它的内部细节，不需要知道主板的型号、CPU 主频、硬盘和内存的大小，
 * 于是计算机制造商将用机箱把计算机封装起来，对外提供了一些接口，如鼠标、键盘和显示器等，这样当用户使用计算机就非常方便。
 * 封装的特点：
 * 只能通过规定的方法访问数据。
 * 隐藏类的实例细节，方便修改和实现。
 * 实现封装的具体步骤如下：
 * 修改属性的可见性来限制对属性的访问，一般设为 private。
 * 为每个属性创建一对赋值（setter）方法和取值（getter）方法，一般设为 public，用于属性的读写。
 * 在赋值和取值方法中，加入属性控制语句（对属性值的合法性进行判断）。
 */

public class Employee
{
    private String name;
    private int age;
    private String sex;
    private String number;
    private String address;

    public Employee(String name, int age, String sex, String number, String address)
    {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.number = number;
        this.address = address;
    }

    public Employee()
    {

    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getSex()
    {
        return sex;
    }

    public void setSex(String sex)
    {
        this.sex = sex;
    }

    public String getNumber()
    {
        return number;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }
}
