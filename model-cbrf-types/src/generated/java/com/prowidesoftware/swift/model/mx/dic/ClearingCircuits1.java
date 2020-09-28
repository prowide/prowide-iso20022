
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Clearing circuits information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearingCircuits1", propOrder = {
    "clrCrct",
    "clmLmtInd",
    "clrSchmeShrtNm",
    "clrSchmeLngNm",
    "allOrNthgInd",
    "grntFnds",
    "clrAcct",
    "clrAcctOwnr"
})
public class ClearingCircuits1 {

    @XmlElement(name = "ClrCrct", required = true)
    protected ClearingScheme1Choice clrCrct;
    @XmlElement(name = "ClmLmtInd")
    protected boolean clmLmtInd;
    @XmlElement(name = "ClrSchmeShrtNm", required = true)
    protected String clrSchmeShrtNm;
    @XmlElement(name = "ClrSchmeLngNm", required = true)
    protected String clrSchmeLngNm;
    @XmlElement(name = "AllOrNthgInd")
    protected boolean allOrNthgInd;
    @XmlElement(name = "GrntFnds", required = true)
    protected GuaranteeFunds1 grntFnds;
    @XmlElement(name = "ClrAcct", required = true)
    protected CashAccount24 clrAcct;
    @XmlElement(name = "ClrAcctOwnr", required = true)
    protected FinancialInstitutionIdentification9 clrAcctOwnr;

    /**
     * Gets the value of the clrCrct property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingScheme1Choice }
     *     
     */
    public ClearingScheme1Choice getClrCrct() {
        return clrCrct;
    }

    /**
     * Sets the value of the clrCrct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingScheme1Choice }
     *     
     */
    public ClearingCircuits1 setClrCrct(ClearingScheme1Choice value) {
        this.clrCrct = value;
        return this;
    }

    /**
     * Gets the value of the clmLmtInd property.
     * 
     */
    public boolean isClmLmtInd() {
        return clmLmtInd;
    }

    /**
     * Sets the value of the clmLmtInd property.
     * 
     */
    public ClearingCircuits1 setClmLmtInd(boolean value) {
        this.clmLmtInd = value;
        return this;
    }

    /**
     * Gets the value of the clrSchmeShrtNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClrSchmeShrtNm() {
        return clrSchmeShrtNm;
    }

    /**
     * Sets the value of the clrSchmeShrtNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClearingCircuits1 setClrSchmeShrtNm(String value) {
        this.clrSchmeShrtNm = value;
        return this;
    }

    /**
     * Gets the value of the clrSchmeLngNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClrSchmeLngNm() {
        return clrSchmeLngNm;
    }

    /**
     * Sets the value of the clrSchmeLngNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClearingCircuits1 setClrSchmeLngNm(String value) {
        this.clrSchmeLngNm = value;
        return this;
    }

    /**
     * Gets the value of the allOrNthgInd property.
     * 
     */
    public boolean isAllOrNthgInd() {
        return allOrNthgInd;
    }

    /**
     * Sets the value of the allOrNthgInd property.
     * 
     */
    public ClearingCircuits1 setAllOrNthgInd(boolean value) {
        this.allOrNthgInd = value;
        return this;
    }

    /**
     * Gets the value of the grntFnds property.
     * 
     * @return
     *     possible object is
     *     {@link GuaranteeFunds1 }
     *     
     */
    public GuaranteeFunds1 getGrntFnds() {
        return grntFnds;
    }

    /**
     * Sets the value of the grntFnds property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuaranteeFunds1 }
     *     
     */
    public ClearingCircuits1 setGrntFnds(GuaranteeFunds1 value) {
        this.grntFnds = value;
        return this;
    }

    /**
     * Gets the value of the clrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount24 }
     *     
     */
    public CashAccount24 getClrAcct() {
        return clrAcct;
    }

    /**
     * Sets the value of the clrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount24 }
     *     
     */
    public ClearingCircuits1 setClrAcct(CashAccount24 value) {
        this.clrAcct = value;
        return this;
    }

    /**
     * Gets the value of the clrAcctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification9 }
     *     
     */
    public FinancialInstitutionIdentification9 getClrAcctOwnr() {
        return clrAcctOwnr;
    }

    /**
     * Sets the value of the clrAcctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification9 }
     *     
     */
    public ClearingCircuits1 setClrAcctOwnr(FinancialInstitutionIdentification9 value) {
        this.clrAcctOwnr = value;
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
