//1

val TrueOrFalse = true

//2

if(TrueOrFalse){
  print("True")
}

else(TrueOrFalse) 
  print ("False")
}

//3.1

val LongNum= 2243432423423l

//3.2

val boolval = false

//3.3

val byteval = 6

//4.1

val defined = OUTPUTS(0).R2[Coll[(Coll[Byte], Long)]]

//4.2

val exPairs: (Int, Long) = (32, 43432435l)

//4.3

val byteval = 3

//5.1 

val withdrawTransactionSigned = senderParty.wallet.sign(withdrawTransaction)

//5.2

def DefEx(subNums: Long): Long = {
  INPUTS(4).value - subNums
}

//7

val LambdaEx = {
  (InputBox: Box) =>
  InputBox.value = 4342
}

//8

{
  val WalletBox = true
  val ContractBox = INPUTS(6)
  val ValuesEqual = WalletBox.value == ContractBox.value
  sigmaProp(ValuesEqual)
}
