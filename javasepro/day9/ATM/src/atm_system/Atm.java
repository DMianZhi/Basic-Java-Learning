package atm_system;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Atm {
    ArrayList<Account> account = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    private Account loginAcc;

    public void start() {
        while (true) {
            System.out.println("=====欢迎进入ATM系统=====");
            System.out.println("1、用户登录");
            System.out.println("2、用户开户");
            System.out.print("请选择：");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    //
                    login();
                    break;
                case 2:
                    createAccount();
                    // 用户开户
                    break;
                default:
                    System.out.println("没有该命令，请重新选择");
            }
        }
    }

    // 用户登录
    private void login() {
        System.out.println("=====系统登录界面=====");
        if (account.size() == 0) {
            System.out.println("还没有用户，请先开通。");
            return;
        }

        //存在用户
        while (true) {
            System.out.println("请输入你的账户卡号：");
            String cardId = sc.next();
            Account acc = getAccountByCardId(cardId);
            if (acc == null) {
                System.out.println("该用户不存在，请确认！");
            } else {
                while (true) {
                    // 用户名正确
                    System.out.println("请输入账户密码：");
                    String passWord = sc.next();
                    if (passWord.equals(acc.getPassWord())) {
                        // 登陆成功
                        System.out.println(acc.getUserName() + "成功登录系统，你的卡号是" + acc.getCardId());
                        loginAcc = acc;
                        // 成功登录进入操作页面；
                        showUserCommand();
                        return;
                    } else {
                        System.out.println("密码错误，请确认。");
                    }
                }

            }
        }

    }

    // 操作页面
    private void showUserCommand() {
        while (true) {
            System.out.println(loginAcc.getUserName() + "你可以进行以下操作：");
            System.out.println("1、查询账户");
            System.out.println("2、存款");
            System.out.println("3、取款");
            System.out.println("4、转账");
            System.out.println("5、密码修改");
            System.out.println("6、退出");
            System.out.println("7、注销");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    // 查询账户信息
                    showLoginAccount();
                    break;
                case 2:
                    // 存款
                    depositMoney();
                    break;
                case 3:
                    // 取款
                    drawMoney();
                    break;
                case 4:
                    // 转账
                    transferMoney();
                    break;
                case 5:
                    // 密码修改
                    updatePassWord();
                    return;
                case 6:
                    System.out.println(loginAcc.getUserName() + "欢迎下次光临，你已经成功退出系统");
                    return;
                case 7:
                    // 注销账户
                    if (deleteAccount()) {
                        return;
                    }
                    break;
                default:
                    System.out.println("命令错误，请重新输入。");
            }
        }

    }

    private void updatePassWord() {
        System.out.println("===账户密码修改===");
        while (true) {
            System.out.println("请输入当前账户密码：");
            String password = sc.next();

            // 认证密码是否正确
            while (true) {
                if (password.equals(loginAcc.getPassWord())) {
                    System.out.println("请你输入新密码：");
                    String newPassword = sc.next();

                    System.out.println("请再次确认新密码：");
                    String okNewPassword = sc.next();

                    // 判断是否一致
                    if (newPassword.equals(okNewPassword)) {
                        loginAcc.setPassWord(okNewPassword);
                        System.out.println("成功修改");
                        return;
                    } else {
                        System.out.println("两次密码不一致，请重新输入！");
                    }
                } else {
                    System.out.println("你输入的密码与当前的密码不一致");
                    break;
                }
            }
        }
    }

    // 销户操作
    private boolean deleteAccount() {
        System.out.println("===销户操作===");
        while (true) {
            System.out.println("你确认能销户吗？y/n");
            String command = sc.next();
            switch (command) {
                case "y":
                    if (loginAcc.getMoney() == 0) {
                        account.remove(loginAcc);
                        System.out.println("销户成功");
                        return true;
                    } else {
                        System.out.println("你的账户还有余额，暂不能销户。");
                        return false;
                    }
                case "n":
                    System.out.println("账户保留");
                    return false;
                default:
                    System.out.println("命令有误，请重新输入！");
            }
        }
    }

    // 转账
    private void transferMoney() {
        System.out.println("===用户转账===");

        // 判断是否有其他用户
        if (account.size() == 1) {
            System.out.println("当前系统中只有你一个用户，无法转账");
            return;
        }

        // 有其他账户；
        // 判断自己是否有余额
        if (loginAcc.getMoney() == 0) {
            System.out.println("你的余额为0，无法转账");
            return;
        }

        while (true) {
            // 开始转账
            System.out.println("请输入对方的卡号：");
            String cardId = sc.next();
            // 判断是否存在
            Account acc = getAccountByCardId(cardId);
            if (acc == null) {
                System.out.println("对方的卡号不存在");
            } else {
                String name = "*" + acc.getUserName().substring(1);
                System.out.println("请输入【" + name + "】的姓氏：");
                String tempName = sc.next();

                // 判断姓氏
                if (acc.getUserName().startsWith(tempName)) {
                    // 认证通过
                    while (true) {
                        System.out.println("请输入要转账的金额：");
                        double money = sc.nextDouble();
                        if (loginAcc.getMoney() >= money) {
                            // 成功转账，更新账户金额
                            acc.setMoney(acc.getMoney() + money);
                            loginAcc.setMoney(loginAcc.getMoney() - money);
                            System.out.println("转账成功，你的余额为" + loginAcc.getMoney());
                            return;
                        } else {
                            System.out.println("你的余额不足，你最多转账：" + loginAcc.getMoney());
                        }
                    }
                } else {
                    System.out.println("认证的姓氏不正确，请确认!");
                }
            }
        }
    }

    // 取钱
    private void drawMoney() {
        System.out.println("===取钱操作===");

        if (loginAcc.getMoney() < 100) {
            System.out.println("余额不足100，暂不允许取款。");
            return;
        }
        while (true) {
            System.out.println("请输入取款金额：");
            double money = sc.nextDouble();
            // 判断余额是否大于取款金额
            if (loginAcc.getMoney() >= money) {
                // 判断取款金额是否大于限制金额
                if (money > loginAcc.getLimit()) {
                    System.out.println("你当前取款金额超过了取款限制，你每次最多取款" + loginAcc.getLimit());
                } else {
                    // 可以去取款了
                    loginAcc.setMoney(loginAcc.getMoney() - money);
                    System.out.println("你取款：" + money + ",余额剩余：" + loginAcc.getMoney());
                    return;
                }
            } else {
                System.out.println("余额不足，你的账户中的余额为：" + loginAcc.getMoney());
            }
        }
    }

    // 存钱
    private void depositMoney() {
        System.out.println("===存钱操作===");
        System.out.println("请你输入存钱金额：");
        double money = sc.nextDouble();
        loginAcc.setMoney(loginAcc.getMoney() + money);
        System.out.println(loginAcc.getUserName() + "成功存钱" + money + ",存钱后余额是：" + loginAcc.getMoney());
    }

    // 展示当前用户的信息
    private void showLoginAccount() {
        System.out.println("===当前您的帐户信息如下===");
        System.out.println("卡号：" + loginAcc.getCardId());
        System.out.println("户主：" + loginAcc.getUserName());
        System.out.println("余额：" + loginAcc.getMoney());
        System.out.println("每次取款限额：" + loginAcc.getLimit());

    }

    // 用户开户
    private void createAccount() {
        System.out.println("=====用户开户界面=====");
        Account acc = new Account();
        System.out.println("请输入你的账户名称：");
        String name = sc.next();
        acc.setUserName(name);

        while (true) {
            System.out.println("请输入你的性别:");
            char sex = sc.next().charAt(0);
            if (sex == '男' || sex == '女') {
                acc.setSex(sex);
                break;
            } else {
                System.out.println("你输入的性别有误，请重新输入。");
            }
        }

        while (true) {
            System.out.println("请输入账户密码");
            String passWord = sc.next();
            System.out.println("请再次输入密码确认！");
            String okPassWord = sc.next();

            // 判断两次密码是否一致；
            if (okPassWord.equals(passWord)) {
                acc.setPassWord(okPassWord);
                break;
            } else {
                System.out.println("密码不一致，请你确认！");
            }
        }

        System.out.println("请你输入你的取钱额度：");
        double limit = sc.nextDouble();
        acc.setLimit(limit);


//       产生8位随机数字作为卡号；
        String cardId = createCardId();
        acc.setCardId(cardId);

        // 存入集合中
        account.add(acc);
        System.out.println("恭喜你" + acc.getUserName() + "开户成功，你的卡号是" + acc.getCardId());

    }

    // 产生密码
    private String createCardId() {
        while (true) {
            Random rd = new Random();
            String cardId = "";
            for (int i = 0; i < 8; i++) {
                int random = rd.nextInt(10);
                cardId += random;
            }

            // 判断是否有重复
            Account acc = getAccountByCardId(cardId);
            if (acc == null) {
                return cardId;
            }
        }
    }

    // 判断是否有重复的账户
    private Account getAccountByCardId(String cardId) {
        for (int i = 0; i < account.size(); i++) {
            if (account.get(i).getCardId().equals(cardId)) {
                return account.get(i);
            }
        }
        return null;
    }
}
