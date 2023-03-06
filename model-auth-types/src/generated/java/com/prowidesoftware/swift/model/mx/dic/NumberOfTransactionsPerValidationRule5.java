
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
 * Number of individual reports or transactions received / sent, detailed per validation rule.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberOfTransactionsPerValidationRule5", propOrder = {
    "dtldNb",
    "rptSts"
})
public class NumberOfTransactionsPerValidationRule5 {

    @XmlElement(name = "DtldNb", required = true)
    protected String dtldNb;
    @XmlElement(name = "RptSts", required = true)
    protected List<RejectionReason45> rptSts;

    /**
     * Gets the value of the dtldNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtldNb() {
        return dtldNb;
    }

    /**
     * Sets the value of the dtldNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NumberOfTransactionsPerValidationRule5 setDtldNb(String value) {
        this.dtldNb = value;
        return this;
    }

    /**
     * Gets the value of the rptSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rptSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRptSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RejectionReason45 }
     * 
     * 
     */
    public List<RejectionReason45> getRptSts() {
        if (rptSts == null) {
            rptSts = new ArrayList<RejectionReason45>();
        }
        return this.rptSts;
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
     * Adds a new item to the rptSts list.
     * @see #getRptSts()
     * 
     */
    public NumberOfTransactionsPerValidationRule5 addRptSts(RejectionReason45 rptSts) {
        getRptSts().add(rptSts);
        return this;
    }

}
