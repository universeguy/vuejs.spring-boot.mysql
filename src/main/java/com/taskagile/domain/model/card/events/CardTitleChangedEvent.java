package com.taskagile.domain.model.card.events;

import com.taskagile.domain.common.event.DomainEvent;
import com.taskagile.domain.model.card.Card;

public class CardTitleChangedEvent extends DomainEvent {

  private static final long serialVersionUID = 26551114425630902L;

  private Card card;

  public CardTitleChangedEvent(Object source, Card card) {
    super(source);
    this.card = card;
  }

  public Card getCard() {
    return card;
  }
}