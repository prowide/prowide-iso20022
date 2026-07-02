
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
 * A safekeeping account is an account on which a securities entry is made.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SafekeepingAccount6", propOrder = {
    "acctId",
    "acctOwnr",
    "subAcctDtls",
    "instdBal",
    "rghtsHldr"
})
public class SafekeepingAccount6 {

    @XmlElement(name = "AcctId", required = true)
    protected String acctId;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification40Choice acctOwnr;
    @XmlElement(name = "SubAcctDtls")
    protected SubAccount2 subAcctDtls;
    @XmlElement(name = "InstdBal", required = true)
    protected List<HoldingBalance8> instdBal;
    @XmlElement(name = "RghtsHldr")
    protected List<PartyIdentification40Choice> rghtsHldr;

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SafekeepingAccount6 setAcctId(String value) {
        this.acctId = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification40Choice }
     *     
     */
    public PartyIdentification40Choice getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification40Choice }
     *     
     */
    public SafekeepingAccount6 setAcctOwnr(PartyIdentification40Choice value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the subAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SubAccount2 }
     *     
     */
    public SubAccount2 getSubAcctDtls() {
        return subAcctDtls;
    }

    /**
     * Sets the value of the subAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubAccount2 }
     *     
     */
    public SafekeepingAccount6 setSubAcctDtls(SubAccount2 value) {
        this.subAcctDtls = value;
        return this;
    }

    /**
     * Gets the value of the instdBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instdBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstdBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HoldingBalance8 }
     * 
     * 
     */
    public List<HoldingBalance8> getInstdBal() {
        if (instdBal == null) {
            instdBal = new ArrayList<HoldingBalance8>();
        }
        return this.instdBal;
    }

    /**
     * Gets the value of the rghtsHldr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rghtsHldr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRghtsHldr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification40Choice }
     * 
     * 
     */
    public List<PartyIdentification40Choice> getRghtsHldr() {
        if (rghtsHldr == null) {
            rghtsHldr = new ArrayList<PartyIdentification40Choice>();
        }
        return this.rghtsHldr;
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
     * Adds a new item to the instdBal list.
     * @see #getInstdBal()
     * 
     */
    public SafekeepingAccount6 addInstdBal(HoldingBalance8 instdBal) {
        getInstdBal().add(instdBal);
        return this;
    }

    /**
     * Adds a new item to the rghtsHldr list.
     * @see #getRghtsHldr()
     * 
     */
    public SafekeepingAccount6 addRghtsHldr(PartyIdentification40Choice rghtsHldr) {
        getRghtsHldr().add(rghtsHldr);
        return this;
    }

}
