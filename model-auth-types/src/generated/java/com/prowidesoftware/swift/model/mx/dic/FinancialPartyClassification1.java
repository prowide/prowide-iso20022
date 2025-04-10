
package com.prowidesoftware.swift.model.mx.dic;

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
 * Specifies the classification of a financial institution.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialPartyClassification1", propOrder = {
    "clssfctn",
    "invstmtFndClssfctn"
})
public class FinancialPartyClassification1 {

    @XmlElement(name = "Clssfctn", required = true)
    @XmlSchemaType(name = "string")
    protected List<FinancialPartySectorType2Code> clssfctn;
    @XmlElement(name = "InvstmtFndClssfctn")
    @XmlSchemaType(name = "string")
    protected FundType2Code invstmtFndClssfctn;

    /**
     * Gets the value of the clssfctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clssfctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClssfctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialPartySectorType2Code }
     * 
     * 
     */
    public List<FinancialPartySectorType2Code> getClssfctn() {
        if (clssfctn == null) {
            clssfctn = new ArrayList<FinancialPartySectorType2Code>();
        }
        return this.clssfctn;
    }

    /**
     * Gets the value of the invstmtFndClssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link FundType2Code }
     *     
     */
    public FundType2Code getInvstmtFndClssfctn() {
        return invstmtFndClssfctn;
    }

    /**
     * Sets the value of the invstmtFndClssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundType2Code }
     *     
     */
    public FinancialPartyClassification1 setInvstmtFndClssfctn(FundType2Code value) {
        this.invstmtFndClssfctn = value;
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
     * Adds a new item to the clssfctn list.
     * @see #getClssfctn()
     * 
     */
    public FinancialPartyClassification1 addClssfctn(FinancialPartySectorType2Code clssfctn) {
        getClssfctn().add(clssfctn);
        return this;
    }

}
