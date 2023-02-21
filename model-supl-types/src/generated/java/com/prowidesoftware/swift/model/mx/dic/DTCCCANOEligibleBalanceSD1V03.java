
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
 * The DTCCCANOEligibleBalanceSD1 message extends ISO corporate action notification (Eligible Balance market practice) message with DTCC corporate action eligible balance elements not covered in the standard message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTCCCANOEligibleBalanceSD1V03", propOrder = {
    "corpActnGnlInf",
    "undrlygScty",
    "dstrbtnsAcctBal",
    "redsAcctBal"
})
public class DTCCCANOEligibleBalanceSD1V03 {

    @XmlElement(name = "CorpActnGnlInf")
    protected CorporateActionGeneralInformationSD14 corpActnGnlInf;
    @XmlElement(name = "UndrlygScty")
    protected FinancialInstrumentAttributesSD9 undrlygScty;
    @XmlElement(name = "DstrbtnsAcctBal")
    protected List<AccountBalanceSD5> dstrbtnsAcctBal;
    @XmlElement(name = "RedsAcctBal")
    protected AccountBalanceSD6 redsAcctBal;

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionGeneralInformationSD14 }
     *     
     */
    public CorporateActionGeneralInformationSD14 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionGeneralInformationSD14 }
     *     
     */
    public DTCCCANOEligibleBalanceSD1V03 setCorpActnGnlInf(CorporateActionGeneralInformationSD14 value) {
        this.corpActnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the undrlygScty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributesSD9 }
     *     
     */
    public FinancialInstrumentAttributesSD9 getUndrlygScty() {
        return undrlygScty;
    }

    /**
     * Sets the value of the undrlygScty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributesSD9 }
     *     
     */
    public DTCCCANOEligibleBalanceSD1V03 setUndrlygScty(FinancialInstrumentAttributesSD9 value) {
        this.undrlygScty = value;
        return this;
    }

    /**
     * Gets the value of the dstrbtnsAcctBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dstrbtnsAcctBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDstrbtnsAcctBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountBalanceSD5 }
     * 
     * 
     */
    public List<AccountBalanceSD5> getDstrbtnsAcctBal() {
        if (dstrbtnsAcctBal == null) {
            dstrbtnsAcctBal = new ArrayList<AccountBalanceSD5>();
        }
        return this.dstrbtnsAcctBal;
    }

    /**
     * Gets the value of the redsAcctBal property.
     * 
     * @return
     *     possible object is
     *     {@link AccountBalanceSD6 }
     *     
     */
    public AccountBalanceSD6 getRedsAcctBal() {
        return redsAcctBal;
    }

    /**
     * Sets the value of the redsAcctBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountBalanceSD6 }
     *     
     */
    public DTCCCANOEligibleBalanceSD1V03 setRedsAcctBal(AccountBalanceSD6 value) {
        this.redsAcctBal = value;
        return this;
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
     * Adds a new item to the dstrbtnsAcctBal list.
     * @see #getDstrbtnsAcctBal()
     * 
     */
    public DTCCCANOEligibleBalanceSD1V03 addDstrbtnsAcctBal(AccountBalanceSD5 dstrbtnsAcctBal) {
        getDstrbtnsAcctBal().add(dstrbtnsAcctBal);
        return this;
    }

}
