
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
 * Body of the Abort Request message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbortData4", propOrder = {
    "xchgId",
    "abrtRsn",
    "dispOutpt",
    "txSucss"
})
public class AbortData4 {

    @XmlElement(name = "XchgId", required = true)
    protected String xchgId;
    @XmlElement(name = "AbrtRsn", required = true)
    protected String abrtRsn;
    @XmlElement(name = "DispOutpt")
    protected ActionMessage9 dispOutpt;
    @XmlElement(name = "TxSucss")
    protected Boolean txSucss;

    /**
     * Gets the value of the xchgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXchgId() {
        return xchgId;
    }

    /**
     * Sets the value of the xchgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AbortData4 setXchgId(String value) {
        this.xchgId = value;
        return this;
    }

    /**
     * Gets the value of the abrtRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbrtRsn() {
        return abrtRsn;
    }

    /**
     * Sets the value of the abrtRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AbortData4 setAbrtRsn(String value) {
        this.abrtRsn = value;
        return this;
    }

    /**
     * Gets the value of the dispOutpt property.
     * 
     * @return
     *     possible object is
     *     {@link ActionMessage9 }
     *     
     */
    public ActionMessage9 getDispOutpt() {
        return dispOutpt;
    }

    /**
     * Sets the value of the dispOutpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionMessage9 }
     *     
     */
    public AbortData4 setDispOutpt(ActionMessage9 value) {
        this.dispOutpt = value;
        return this;
    }

    /**
     * Gets the value of the txSucss property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTxSucss() {
        return txSucss;
    }

    /**
     * Sets the value of the txSucss property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public AbortData4 setTxSucss(Boolean value) {
        this.txSucss = value;
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
