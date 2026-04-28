package banktask;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Bank {
  double balance;
  List<String> transaction = new ArrayList<>();
  List<String> failedTransaction = new ArrayList<>();

  public Bank(double balance) {
    this.balance = balance;
  }

  public void withDraw(Double amount) {
    if (amount > 0 && amount <= balance) {
      balance -= amount;
      addTransaction(String.format("success: balansdan  %s qeder mebleg cixildi balans: %s tarix: %s", amount,balance,dateFormatter(LocalDateTime.now())));
    } else {
      addFailedTransaction(String.format("fail: balans kifayet etmir ve ya mebleg duzgun daxil " +
              "edilmeyib balans %s tarix: %s", balance, dateFormatter(LocalDateTime.now())));
    }
  }

  public void addTransaction(String text) {
    transaction.add(text);
  }

  public void addFailedTransaction(String text) {
    failedTransaction.add(text);
  }
  public void deposit(Double amount) {
    if(amount > 0){
      balance+=amount;
      addTransaction(String.format("balansa %s qeder mebleg elave edildi guncel balans: %s tarix: %s",amount,balance, dateFormatter(LocalDateTime.now())));
    }else {
      addFailedTransaction(String.format("illegal emeliyyat daxil edile bilmez %s  tarix: %s",amount,dateFormatter(LocalDateTime.now())));
    }

  }

  public List<String> getTransaction() {
    return transaction;
  }

  public List<String> getFailedTransaction() {
    return failedTransaction;
  }

  public String dateFormatter(LocalDateTime time){
    return time.format(DateTimeFormatter.ofPattern("dd.MM.yyyy H:mm:ss"));
  }



}


























/*
Student class -> name,surname,List<String> programLanguage;
academy class -> name List<Student> students;
student obyekt yaradiriq
academy obyekt yaradiriq
academye studentler elave edirik
butun academy ve studentleri chapa veririk
 */