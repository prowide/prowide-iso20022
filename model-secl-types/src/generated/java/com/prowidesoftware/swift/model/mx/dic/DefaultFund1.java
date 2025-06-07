
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
 * Provides information such as the default fund account identification or the default fund amount.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DefaultFund1", propOrder = {
    "dfltFndAcct",
    "ttlDfltFndAmt",
    "cntrbtn",
    "incrCvrgAmt"
})
public class DefaultFund1 {

    @XmlElement(name = "DfltFndAcct", required = true)
    protected AccountIdentification4Choice dfltFndAcct;
    @XmlElement(name = "TtlDfltFndAmt", required = true)
    protected ActiveCurrencyAndAmount ttlDfltFndAmt;
    @XmlElement(name = "Cntrbtn")
    protected List<Contribution1> cntrbtn;
    @XmlElement(name = "IncrCvrgAmt")
    protected ActiveCurrencyAndAmount incrCvrgAmt;

    /**
     * Gets the value of the dfltFndAcct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public AccountIdentification4Choice getDfltFndAcct() {
        return dfltFndAcct;
    }

    /**
     * Sets the value of the dfltFndAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public DefaultFund1 setDfltFndAcct(AccountIdentification4Choice value) {
        this.dfltFndAcct = value;
        return this;
    }

    /**
     * Gets the value of the ttlDfltFndAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlDfltFndAmt() {
        return ttlDfltFndAmt;
    }

    /**
     * Sets the value of the ttlDfltFndAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public DefaultFund1 setTtlDfltFndAmt(ActiveCurrencyAndAmount value) {
        this.ttlDfltFndAmt = value;
        return this;
    }

    /**
     * Gets the value of the cntrbtn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cntrbtn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCntrbtn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contribution1 }
     * 
     * 
     */
    public List<Contribution1> getCntrbtn() {
        if (cntrbtn == null) {
            cntrbtn = new ArrayList<Contribution1>();
        }
        return this.cntrbtn;
    }

    /**
     * Gets the value of the incrCvrgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getIncrCvrgAmt() {
        return incrCvrgAmt;
    }

    /**
     * Sets the value of the incrCvrgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public DefaultFund1 setIncrCvrgAmt(ActiveCurrencyAndAmount value) {
        this.incrCvrgAmt = value;
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
     * Adds a new item to the cntrbtn list.
     * @see #getCntrbtn()
     * 
     */
    public DefaultFund1 addCntrbtn(Contribution1 cntrbtn) {
        getCntrbtn().add(cntrbtn);
        return this;
    }

}
