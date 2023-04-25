
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * Specifies the classification of a financial institution.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialPartyClassification2", propOrder = {
    "clssfctn",
    "invstmtFndClssfctn"
})
public class FinancialPartyClassification2 {

    @XmlElement(name = "Clssfctn", required = true)
    protected List<String> clssfctn;
    @XmlElement(name = "InvstmtFndClssfctn")
    @XmlSchemaType(name = "string")
    protected FundType2Code invstmtFndClssfctn;

    /**
     * Gets the value of the clssfctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the clssfctn property.
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
     * {@link String }
     * 
     * 
     * @return
     *     The value of the clssfctn property.
     */
    public List<String> getClssfctn() {
        if (clssfctn == null) {
            clssfctn = new ArrayList<>();
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
    public FinancialPartyClassification2 setInvstmtFndClssfctn(FundType2Code value) {
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
    public FinancialPartyClassification2 addClssfctn(String clssfctn) {
        getClssfctn().add(clssfctn);
        return this;
    }

}
