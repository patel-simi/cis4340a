class BankAccount extends Account {
  // ...
  @Override boolean overdraft() { // Override
    throw new IllegalAccessException();
  }
}
