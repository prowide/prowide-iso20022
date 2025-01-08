
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the account within a system to or from which a securities entry is made. It holds information generic or market specific attributes such as opening or closing date, and defines the default setting for the  holding of settlement instructions involving positions related to the account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemSecuritiesAccount5", propOrder = {
    "clsgDt",
    "hldInd",
    "negPos",
    "endInvstrFlg",
    "pricgSchme"
})
public class SystemSecuritiesAccount5 {

    @XmlElement(name = "ClsgDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate clsgDt;
    @XmlElement(name = "HldInd")
    protected Boolean hldInd;
    @XmlElement(name = "NegPos")
    protected Boolean negPos;
    @XmlElement(name = "EndInvstrFlg")
    protected String endInvstrFlg;
    @XmlElement(name = "PricgSchme")
    protected String pricgSchme;

    /**
     * Gets the value of the clsgDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getClsgDt() {
        return clsgDt;
    }

    /**
     * Sets the value of the clsgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SystemSecuritiesAccount5 setClsgDt(LocalDate value) {
        this.clsgDt = value;
        return this;
    }

    /**
     * Gets the value of the hldInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHldInd() {
        return hldInd;
    }

    /**
     * Sets the value of the hldInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SystemSecuritiesAccount5 setHldInd(Boolean value) {
        this.hldInd = value;
        return this;
    }

    /**
     * Gets the value of the negPos property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNegPos() {
        return negPos;
    }

    /**
     * Sets the value of the negPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SystemSecuritiesAccount5 setNegPos(Boolean value) {
        this.negPos = value;
        return this;
    }

    /**
     * Gets the value of the endInvstrFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndInvstrFlg() {
        return endInvstrFlg;
    }

    /**
     * Sets the value of the endInvstrFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SystemSecuritiesAccount5 setEndInvstrFlg(String value) {
        this.endInvstrFlg = value;
        return this;
    }

    /**
     * Gets the value of the pricgSchme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricgSchme() {
        return pricgSchme;
    }

    /**
     * Sets the value of the pricgSchme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SystemSecuritiesAccount5 setPricgSchme(String value) {
        this.pricgSchme = value;
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
