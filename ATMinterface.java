import java.util.*;
class Account{
    
    String accHolder_name;
    String username;
    String password;
    String acc_number;
    float balance=10000f;
    int transactions=0;
    String TransactionHistory="";
    public void register(){              
        Scanner sc=new Scanner(System.in);
        System.out.println("\nenter your name: ");
        this.accHolder_name=sc.nextLine();

        System.out.println("\nenter username: ");
        this.username=sc.nextLine();

        System.out.println("\nenter password: ");
        this.password=sc.nextLine();

        System.out.println("\nenter account number: ");
        this.acc_number=sc.nextLine();

        System.out.println("REGISTRATION SUCCESSFUL.Login to your bank account");
    }

public boolean login(){
    boolean islogin=false;
    Scanner sc=new Scanner(System.in);
    while(!islogin){
        System.out.println("\nenter your username: ");
        
    if(username.equals(username)){
       while(!islogin){
    System.out.println("\nenter your password: ");
    String password=sc.nextLine();
    if(password.equals(password)){
        System.out.println("\nLogin Successful");
        islogin=true;
    }
    else{
        System.out.println("Incorrect password");
    }
}
}
    else{
            System.out.println("\nUsername not found");
        }
    }
    return islogin;
}

public void withdraw(){
    System.out.println("\nenter the amount to withdraw: ");
    Scanner sc=new Scanner(System.in);
    float amount=sc.nextFloat();
    try{
        if(balance>=amount){
            transactions++;
            balance-=amount;
            System.out.println("\nWithdrawal Successful");
            String str=amount+"Rs Withdrawn\n";
            TransactionHistory=TransactionHistory.concat(str);

        }
        else{
            System.out.println("\nInsufficient balance");
        }
    }
    catch(Exception e){
    }
}

public void deposit(){
    System.out.println("\nenter the amount to deposit: ");
    Scanner sc=new Scanner(System.in);
    float amount=sc.nextFloat();
    try{
        if(amount<=10000f){
            transactions++;
            balance+=amount;
            System.out.println("\nDeposit Successful");
            String str=amount+"Rs deposited\n";
            TransactionHistory=TransactionHistory.concat(str);

        }
        else{
            System.out.println("\nThe limit is 10000");
        }
    }
    catch(Exception e){
    }
}

public void transfer(){
    Scanner sc=new Scanner(System.in);
    System.out.println("\nenter the recipient's name: ");
    String recipient=sc.nextLine();
    System.out.println("\nenter amount to transfer: ");
    float amount=sc.nextFloat();
    try{
        if(balance>=amount){
        if(amount<=50000f){
            transactions++;
            balance-=amount;
            System.out.println("\nSuccessfully transferred to "+ recipient);
            String str=amount+"Rs transferred\n";
            TransactionHistory=TransactionHistory.concat(str);

        }
        else{
            System.out.println("\nThe limit is 50000");
        }
    }
    else{
        System.out.println("Insufficient balance");
    }}
    catch(Exception e){
    }}

    public void checkbalance(){
        System.out.println( "Balance is:-"+ balance +"Rs");
    }

public void TransHistory(){
    if(transactions==0){
        System.out.println("\nNo transactions made");
    }
    else{
        System.out.println("\n"+TransactionHistory);
    }
}}

public class ATMinterface{
    public static int takeintegerinput(int limit)
{int input=0;
    boolean flag=false;
    while(!flag){
        try{
            Scanner sc=new Scanner(System.in);
        input=sc.nextInt();
        flag=true;
        if(flag && input>limit || input<1) {
            System.out.println("choose a number between 1 to "+limit);

}       }
catch(Exception e){
    System.out.println("enter only integer value.");
    flag=false;
}
}
    return input;
}
public static void main(String[] args) {
    System.out.println("\n----Welcome to the Ebank ATM Interface----");
    System.out.println("1.Register \n2.Exit");
    System.out.println("choose one option");
    int choose=takeintegerinput(2);

    if(choose == 1) {
        Account b= new Account();
        b.register();
        while(true) {
            System.out.println("\n1.Login \n2.Exit");
            System.out.println("Enter your choice: ");
            int ch = takeintegerinput(2);

            if(ch==1) {
                if(b.login()) {
                    System.out.println("\n*****WELCOME BACK "+ b.accHolder_name + "****");
                    boolean isFinished = false;
                    while(!isFinished) {
                        System.out.println("\n1.withdraw \n2.Deposit \n3.Transfer \n4.check balance \n5.Transaction History \n6.Exit");
                        System.out.println("Enter your choice: ");
                        int c = takeintegerinput(6);
                        switch(c){
                            case 1:
								 b.withdraw();
								 break;
							  case 2:
								 b.deposit();
								 break;
							  case 3:
								b.transfer();
								break;
							  case 4:
								b.checkbalance();
								break;
							  case 5:
								b.TransHistory();
								break;
							  case 6:
								isFinished = true;
								break;
                            }
                         }
}
else{
     System.exit(0);
}
}}}
else{
    System.exit(0);
}}}
     