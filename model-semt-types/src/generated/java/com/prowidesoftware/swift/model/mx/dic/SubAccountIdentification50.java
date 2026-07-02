
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
 * Provides all sub-account details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubAccountIdentification50", propOrder = {
    "acctOwnr",
    "sfkpgAcct",
    "actvtyInd",
    "finInstrmDtls"
})
public class SubAccountIdentification50 {

    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification119 acctOwnr;
    @XmlElement(name = "SfkpgAcct", required = true)
    protected SecuritiesAccount34 sfkpgAcct;
    @XmlElement(name = "ActvtyInd")
    protected boolean actvtyInd;
    @XmlElement(name = "FinInstrmDtls")
    protected List<FinancialInstrumentDetails27> finInstrmDtls;

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification119 }
     *     
     */
    public PartyIdentification119 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification119 }
     *     
     */
    public SubAccountIdentification50 setAcctOwnr(PartyIdentification119 value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount34 }
     *     
     */
    public SecuritiesAccount34 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount34 }
     *     
     */
    public SubAccountIdentification50 setSfkpgAcct(SecuritiesAccount34 value) {
        this.sfkpgAcct = value;
        return this;
    }

    /**
     * Gets the value of the actvtyInd property.
     * 
     */
    public boolean isActvtyInd() {
        return actvtyInd;
    }

    /**
     * Sets the value of the actvtyInd property.
     * 
     */
    public SubAccountIdentification50 setActvtyInd(boolean value) {
        this.actvtyInd = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the finInstrmDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinInstrmDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialInstrumentDetails27 }
     * 
     * 
     */
    public List<FinancialInstrumentDetails27> getFinInstrmDtls() {
        if (finInstrmDtls == null) {
            finInstrmDtls = new ArrayList<FinancialInstrumentDetails27>();
        }
        return this.finInstrmDtls;
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
     * Adds a new item to the finInstrmDtls list.
     * @see #getFinInstrmDtls()
     * 
     */
    public SubAccountIdentification50 addFinInstrmDtls(FinancialInstrumentDetails27 finInstrmDtls) {
        getFinInstrmDtls().add(finInstrmDtls);
        return this;
    }

}
