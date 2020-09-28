
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
 * Provides details on the securities index request operations for national competent authorities.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesIndexReport1", propOrder = {
    "techRcrdId",
    "rqstngNtty",
    "indx",
    "vldtyPrd"
})
public class SecuritiesIndexReport1 {

    @XmlElement(name = "TechRcrdId")
    protected String techRcrdId;
    @XmlElement(name = "RqstngNtty")
    protected String rqstngNtty;
    @XmlElement(name = "Indx", required = true)
    protected FinancialInstrument46Choice indx;
    @XmlElement(name = "VldtyPrd")
    protected Period4Choice vldtyPrd;

    /**
     * Gets the value of the techRcrdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechRcrdId() {
        return techRcrdId;
    }

    /**
     * Sets the value of the techRcrdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesIndexReport1 setTechRcrdId(String value) {
        this.techRcrdId = value;
        return this;
    }

    /**
     * Gets the value of the rqstngNtty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRqstngNtty() {
        return rqstngNtty;
    }

    /**
     * Sets the value of the rqstngNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesIndexReport1 setRqstngNtty(String value) {
        this.rqstngNtty = value;
        return this;
    }

    /**
     * Gets the value of the indx property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument46Choice }
     *     
     */
    public FinancialInstrument46Choice getIndx() {
        return indx;
    }

    /**
     * Sets the value of the indx property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument46Choice }
     *     
     */
    public SecuritiesIndexReport1 setIndx(FinancialInstrument46Choice value) {
        this.indx = value;
        return this;
    }

    /**
     * Gets the value of the vldtyPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period4Choice }
     *     
     */
    public Period4Choice getVldtyPrd() {
        return vldtyPrd;
    }

    /**
     * Sets the value of the vldtyPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period4Choice }
     *     
     */
    public SecuritiesIndexReport1 setVldtyPrd(Period4Choice value) {
        this.vldtyPrd = value;
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
