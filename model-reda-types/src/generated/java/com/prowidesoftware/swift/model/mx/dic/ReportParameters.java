
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
 * Parameters to be used in a report.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportParameters", propOrder = {
    "ctry",
    "ccy",
    "pty",
    "usrDfndParam"
})
public class ReportParameters {

    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "Pty")
    protected BreakdownByParty2 pty;
    @XmlElement(name = "UsrDfndParam")
    protected BreakdownByUserDefinedParameter2 usrDfndParam;

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportParameters setCtry(String value) {
        this.ctry = value;
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
    public ReportParameters setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the pty property.
     * 
     * @return
     *     possible object is
     *     {@link BreakdownByParty2 }
     *     
     */
    public BreakdownByParty2 getPty() {
        return pty;
    }

    /**
     * Sets the value of the pty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BreakdownByParty2 }
     *     
     */
    public ReportParameters setPty(BreakdownByParty2 value) {
        this.pty = value;
        return this;
    }

    /**
     * Gets the value of the usrDfndParam property.
     * 
     * @return
     *     possible object is
     *     {@link BreakdownByUserDefinedParameter2 }
     *     
     */
    public BreakdownByUserDefinedParameter2 getUsrDfndParam() {
        return usrDfndParam;
    }

    /**
     * Sets the value of the usrDfndParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link BreakdownByUserDefinedParameter2 }
     *     
     */
    public ReportParameters setUsrDfndParam(BreakdownByUserDefinedParameter2 value) {
        this.usrDfndParam = value;
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
