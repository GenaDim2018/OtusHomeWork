import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HashMap accountBase = createAccountBase();
        System.out.println(accountBase);
        System.out.println("Ищем клиента Димитриев");
        Client dimitriev = new Client("Димитриев Геннадий Александрович", "28.03.1995");
        System.out.println(accountBase.containsKey(dimitriev));
        System.out.println(accountBase.get(dimitriev));
    }

    public static HashMap createAccountBase() {
        AccountBase <Client, List<Account>> accountBase = new AccountBase<>();
        Client dimitriev = new Client("Димитриев Геннадий Александрович", "28.03.1995");
        Client petrov = new Client("Петров Петр Петрович", "16.02.1950");
        Client ivanov = new Client("Иванов Иван Иванович", "31.02.1999");
        Client sidorov = new Client("Сидоров Мистер Сидр", "20.05.2023");
        Client popov = new Client("Попов Попов Попов", "01.09.1991");
        Client yudina = new Client("Юдина Карина Алексеевна", "12.10.1990");
        Client dimitrieva = new Client("Димитриева Анастасия Дмитриевна", "01.01.1999");
        Client gladyshev = new Client("Гладышев Николай Юрьевич", "15.08.1998");
        Client pechenkin = new Client("Печенкин Павел Николаевич", "12.01.1970");
        Client skyrimov = new Client("Скайримов Драгонборн ХусРоДасович", "11.11.2011");
        Client terentev = new Client("Терентьев Михал Палыч", "28.03.2021"); //Кот
        Client zubenko = new Client("Зубенко Михаил Петрович", "20.09.1991");
        Account A00000001 = new Account("1", "999999999999999");
        Account A00000002 = new Account("2222", "321232321253");
        Account A00000003 = new Account("333333", "3333333");
        Account A00000004 = new Account("44444444", "0");
        Account A00000005 = new Account("55555555", "-1250");
        Account A00000006 = new Account("666666", "123");
        Account A00000007 = new Account("7777", "333");
        Account A00000008 = new Account("88888888", "1");
        Account A00000009 = new Account("99999999", "7");
        Account A00000010 = new Account("1010101010", "101010101010");
        Account A00000011 = new Account("1111111111", "11111111111");
        Account A00000012 = new Account("1212121212", "12121212");
        Account A00000013 = new Account("1212121212", "12121212");
        Account A00000014 = new Account("1212121212", "12121212");
        Account A00000015 = new Account("1212121212", "12121212");
        Account A00000016 = new Account("1212121212", "12121212");
        accountBase.put(dimitriev, (List<Account>) A00000001);
        accountBase.put(petrov, Arrays.asList(A00000002));
        accountBase.put(ivanov, Arrays.asList(A00000003));
        accountBase.put(sidorov, Arrays.asList(A00000004));
        accountBase.put(popov, Arrays.asList(A00000005));
        accountBase.put(yudina, Arrays.asList(A00000006));
        accountBase.put(dimitrieva, Arrays.asList(A00000007));
        accountBase.put(gladyshev, Arrays.asList(A00000008));
        accountBase.put(pechenkin, Arrays.asList(A00000009));
        accountBase.put(skyrimov, Arrays.asList(A00000010));
        accountBase.put(terentev, Arrays.asList(A00000011));
        accountBase.put(zubenko, Arrays.asList(A00000012));
        accountBase.put(dimitriev, Arrays.asList(A00000013));
        accountBase.put(dimitriev, Arrays.asList(A00000014));
        accountBase.put(terentev, Arrays.asList(A00000015));
        accountBase.put(dimitriev, Arrays.asList(A00000016));
        return accountBase;
    }
}