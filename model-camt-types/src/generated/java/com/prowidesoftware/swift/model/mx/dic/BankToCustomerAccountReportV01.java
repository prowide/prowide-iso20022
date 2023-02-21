
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Scope
 * The Bank-to-Customer Account Report message is sent by the account servicer to an account owner or to a party authorised by the account owner to receive the message. It can be used to inform the account owner, or authorised party, of the entries reported to the account, and/or to provide the owner with balance information on the account at a given point in time.
 * Usage
 * The Bank-to-Customer Account Report message can contain reports for more than 1 account. It provides information for cash management and/or reconciliation. It can be used to:
 * - report pending and booked items;
 * - provide balance information
 * It can include underlying details of transactions that have been included in the entry.
 * It is possible that the receiver of the message is not the account owner, but a party entitled by the account owner to receive the account information (also known as recipient).
 * For a statement that is required due to local legal stipulations, the Bank-to-Customer Account Statement message should be used.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankToCustomerAccountReportV01", propOrder = {
    "grpHdr",
    "rpt"
})
public class BankToCustomerAccountReportV01 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader23 grpHdr;
    @XmlElement(name = "Rpt", required = true)
    protected List<AccountReport9> rpt;

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
    public BankToCustomerAccountReportV01 setGrpHdr(GroupHeader23 value) {
        this.grpHdr = value;
        return this;
    }

    /**
     * Gets the value of the rpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountReport9 }
     * 
     * 
     */
    public List<AccountReport9> getRpt() {
        if (rpt == null) {
            rpt = new ArrayList<AccountReport9>();
        }
        return this.rpt;
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
     * Adds a new item to the rpt list.
     * @see #getRpt()
     * 
     */
    public BankToCustomerAccountReportV01 addRpt(AccountReport9 rpt) {
        getRpt().add(rpt);
        return this;
    }

}
