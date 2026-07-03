
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Scope
 * The Bank-to-Customer Statement message is sent by the account servicer to an account owner or to a party authorised by the account owner to receive the message. It is used to inform the account owner, or authorised party, of the entries booked to the account, and to provide the owner with balance information on the account at a given point in time.
 * Usage
 * The Bank-to-Customer Statement message can contain reports for more than 1 account. It provides information for cash management and/or reconciliation.
 * It contains information on booked entries only.
 * It can include underlying details of transactions that have been included in the entry.
 * The message is exchanged as defined between the account servicer and the account owner. It provides information on items that have been booked to the account (and therefore are "binding" and also balance information. Depending on services agreed between banks and their customers, "binding" statements can be generated and exchanged intraday. Depending on legal requirements in local jurisdictions, "end-of-day" statements may need to be mandatorily generated and exchanged.
 * It is possible that the receiver of the message is not the account owner, but a party entitled through arrangement with the account owner to receive the account information (also known as recipient).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankToCustomerStatementV01", propOrder = {
    "grpHdr",
    "stmt"
})
public class BankToCustomerStatementV01 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader23 grpHdr;
    @XmlElement(name = "Stmt", required = true)
    protected List<AccountStatement1> stmt;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader23 }
     *     
     */
    public GroupHeader23 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader23 }
     *     
     */
    public BankToCustomerStatementV01 setGrpHdr(GroupHeader23 value) {
        this.grpHdr = value;
        return this;
    }

    /**
     * Gets the value of the stmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountStatement1 }
     * 
     * 
     */
    public List<AccountStatement1> getStmt() {
        if (stmt == null) {
            stmt = new ArrayList<AccountStatement1>();
        }
        return this.stmt;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * Adds a new item to the stmt list.
     * @see #getStmt()
     * 
     */
    public BankToCustomerStatementV01 addStmt(AccountStatement1 stmt) {
        getStmt().add(stmt);
        return this;
    }

}
