
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the loan data details in case of a margin lending transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanData32", propOrder = {
    "collDlvryMtd",
    "outsdngMrgnLnAmt",
    "shrtMktValAmt",
    "ccy",
    "mrgnLnAttr"
})
public class LoanData32 {

    @XmlElement(name = "CollDlvryMtd")
    @XmlSchemaType(name = "string")
    protected CollateralDeliveryMethod1Code collDlvryMtd;
    @XmlElement(name = "OutsdngMrgnLnAmt")
    protected BigDecimal outsdngMrgnLnAmt;
    @XmlElement(name = "ShrtMktValAmt")
    protected BigDecimal shrtMktValAmt;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "MrgnLnAttr")
    protected List<InterestRate15Choice> mrgnLnAttr;

    /**
     * Gets the value of the collDlvryMtd property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralDeliveryMethod1Code }
     *     
     */
    public CollateralDeliveryMethod1Code getCollDlvryMtd() {
        return collDlvryMtd;
    }

    /**
     * Sets the value of the collDlvryMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralDeliveryMethod1Code }
     *     
     */
    public LoanData32 setCollDlvryMtd(CollateralDeliveryMethod1Code value) {
        this.collDlvryMtd = value;
        return this;
    }

    /**
     * Gets the value of the outsdngMrgnLnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutsdngMrgnLnAmt() {
        return outsdngMrgnLnAmt;
    }

    /**
     * Sets the value of the outsdngMrgnLnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public LoanData32 setOutsdngMrgnLnAmt(BigDecimal value) {
        this.outsdngMrgnLnAmt = value;
        return this;
    }

    /**
     * Gets the value of the shrtMktValAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getShrtMktValAmt() {
        return shrtMktValAmt;
    }

    /**
     * Sets the value of the shrtMktValAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public LoanData32 setShrtMktValAmt(BigDecimal value) {
        this.shrtMktValAmt = value;
        return this;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoanData32 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the mrgnLnAttr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mrgnLnAttr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMrgnLnAttr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterestRate15Choice }
     * 
     * 
     */
    public List<InterestRate15Choice> getMrgnLnAttr() {
        if (mrgnLnAttr == null) {
            mrgnLnAttr = new ArrayList<InterestRate15Choice>();
        }
        return this.mrgnLnAttr;
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
     * Adds a new item to the mrgnLnAttr list.
     * @see #getMrgnLnAttr()
     * 
     */
    public LoanData32 addMrgnLnAttr(InterestRate15Choice mrgnLnAttr) {
        getMrgnLnAttr().add(mrgnLnAttr);
        return this;
    }

}
