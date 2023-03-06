
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the tax income common data details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxIncomeCommonData1", propOrder = {
    "finInstrmId",
    "sfkpgAcct",
    "tradDt",
    "sttlmDt",
    "incmStmtSts"
})
public class TaxIncomeCommonData1 {

    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "SfkpgAcct", required = true)
    protected SecuritiesAccount19 sfkpgAcct;
    @XmlElement(name = "TradDt")
    protected DateAndDateTime2Choice tradDt;
    @XmlElement(name = "SttlmDt")
    protected DateAndDateTime2Choice sttlmDt;
    @XmlElement(name = "IncmStmtSts", required = true)
    @XmlSchemaType(name = "string")
    protected TaxIncomeStatus1Code incmStmtSts;

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public TaxIncomeCommonData1 setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public TaxIncomeCommonData1 setSfkpgAcct(SecuritiesAccount19 value) {
        this.sfkpgAcct = value;
        return this;
    }

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public TaxIncomeCommonData1 setTradDt(DateAndDateTime2Choice value) {
        this.tradDt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Sets the value of the sttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public TaxIncomeCommonData1 setSttlmDt(DateAndDateTime2Choice value) {
        this.sttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the incmStmtSts property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIncomeStatus1Code }
     *     
     */
    public TaxIncomeStatus1Code getIncmStmtSts() {
        return incmStmtSts;
    }

    /**
     * Sets the value of the incmStmtSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIncomeStatus1Code }
     *     
     */
    public TaxIncomeCommonData1 setIncmStmtSts(TaxIncomeStatus1Code value) {
        this.incmStmtSts = value;
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

}
