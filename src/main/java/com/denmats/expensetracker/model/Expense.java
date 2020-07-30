package com.denmats.expensetracker.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.validation.beanvalidation.SpringValidatorAdapter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="tbl_expenses")
@Setter
@Getter
@ToString
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

    @Column(name="description")
    private String expensename;

    private BigDecimal amount;

    private String note;

    @Column(name="created_at")
    private Long createdAt;

    public void setCreatedAt(long currentTimeMillis) {
        this.createdAt = System.currentTimeMillis();
    }
}
