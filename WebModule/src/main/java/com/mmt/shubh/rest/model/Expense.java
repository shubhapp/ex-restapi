package com.mmt.shubh.rest.model;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Subham Tyagi
 * On 6/10/2015.
 * <p>
 * TODO: Add class comments
 */
@XmlRootElement
@Getter
@Setter
public class Expense {

    private long id;

    private String amount;

    private long date;

    private String name;

    private String description;

    private long expenseBookId;

    private long categoryId;

    private long memberId;
}
