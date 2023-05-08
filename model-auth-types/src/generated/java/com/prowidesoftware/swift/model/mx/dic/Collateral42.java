
package com.prowidesoftware.swift.model.mx.dic;

import java.util.Calendar;
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
 * Provides the details of the security pledged as collateral.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Collateral42", propOrder = {
    "collValDt",
    "asstTp",
    "netXpsrCollstnInd",
    "bsktIdr"
})
public class Collateral42 {

    @XmlElement(name = "CollValDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar collValDt;
    @XmlElement(name = "AsstTp")
    protected CollateralType16 asstTp;
    @XmlElement(name = "NetXpsrCollstnInd")
    protected Boolean netXpsrCollstnInd;
    @XmlElement(name = "BsktIdr")
    protected SecurityIdentification26Choice bsktIdr;

    /**
     * Gets the value of the collValDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getCollValDt() {
        return collValDt;
    }

    /**
     * Sets the value of the collValDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Collateral42 setCollValDt(Calendar value) {
        this.collValDt = value;
        return this;
    }

    /**
     * Gets the value of the asstTp property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralType16 }
     *     
     */
    public CollateralType16 getAsstTp() {
        return asstTp;
    }

    /**
     * Sets the value of the asstTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralType16 }
     *     
     */
    public Collateral42 setAsstTp(CollateralType16 value) {
        this.asstTp = value;
        return this;
    }

    /**
     * Gets the value of the netXpsrCollstnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNetXpsrCollstnInd() {
        return netXpsrCollstnInd;
    }

    /**
     * Sets the value of the netXpsrCollstnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Collateral42 setNetXpsrCollstnInd(Boolean value) {
        this.netXpsrCollstnInd = value;
        return this;
    }

    /**
     * Gets the value of the bsktIdr property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification26Choice }
     *     
     */
    public SecurityIdentification26Choice getBsktIdr() {
        return bsktIdr;
    }

    /**
     * Sets the value of the bsktIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification26Choice }
     *     
     */
    public Collateral42 setBsktIdr(SecurityIdentification26Choice value) {
        this.bsktIdr = value;
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
