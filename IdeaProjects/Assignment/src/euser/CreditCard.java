package euser;

public class CreditCard {
    int cvv;
    int cardExpiration;
    Long CreditCardNumber;
    String nameOnCard;
    CardType cardType;

    public CreditCard(int cvv, int cardExpiration, Long CreditCardNumber, String nameOnCard, CardType cardType) {
        this.cvv = cvv;
        this.cardExpiration = cardExpiration;
        this.CreditCardNumber = CreditCardNumber;
        this.nameOnCard = nameOnCard;
        this.cardType = cardType;
    }

}
