package bankaccounts;

 class Account {						//line 1 and line 6.
	double balance;
}
 class SavingAccount{					//line 2
}

 class CurrentAccount{					//line 3 and line 5
	int ExtraCharge;
	
}
 public class Entry extends CurrentAccount {			//required in question line 4
	public void WithdrawAmount(String AcType,int amount) { //required in question line 5
	
	if(AcType == "Current Account") {		//checking condition for current account	
		ExtraCharge = (amount*10)/100;		//question line 6  
		System.out.println("Amount withdraw = "+amount);
		System.out.println("Current account so Extra charge "+ExtraCharge+" applied"); //
		
		int TotalAmt = amount + ExtraCharge;		//Total amount deducted with extra charge.
		System.out.println("Total amount deducted = "+TotalAmt);  //printing total as required by last line of question.
	}
		else {
			System.out.println("Amount withdraw = "+amount);	
	System.out.println("No Extra charge");
		}
}
	public  void MakePayment(int amt) {					//required in question line 5
		System.out.println("Also make a payment of "+amt);
	}
	public static void main(String[] args) {
		Entry entry = new Entry();			//creating object of class Entry
		
		 entry.WithdrawAmount("Current Account",5000);
		 entry.MakePayment(11000);
		 System.out.println();
		 
		 entry.WithdrawAmount("Saving Account",2000);
		 entry.MakePayment(5000);
	}
}