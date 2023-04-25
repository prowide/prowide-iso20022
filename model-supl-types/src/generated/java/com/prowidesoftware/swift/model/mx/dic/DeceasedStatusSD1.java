
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
 * Deceased beneficial owner information details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeceasedStatusSD1", propOrder = {
    "bnfclOwnrNm",
    "dthDt",
    "dthCertSrlNb",
    "issgJursdctn"
})
public class DeceasedStatusSD1 {

    @XmlElement(name = "BnfclOwnrNm", required = true)
    protected String bnfclOwnrNm;
    @XmlElement(name = "DthDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar dthDt;
    @XmlElement(name = "DthCertSrlNb")
    protected String dthCertSrlNb;
    @XmlElement(name = "IssgJursdctn")
    protected String issgJursdctn;

    /**
     * Gets the value of the bnfclOwnrNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBnfclOwnrNm() {
        return bnfclOwnrNm;
    }

    /**
     * Sets the value of the bnfclOwnrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DeceasedStatusSD1 setBnfclOwnrNm(String value) {
        this.bnfclOwnrNm = value;
        return this;
    }

    /**
     * Gets the value of the dthDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDthDt() {
        return dthDt;
    }

    /**
     * Sets the value of the dthDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DeceasedStatusSD1 setDthDt(Calendar value) {
        this.dthDt = value;
        return this;
    }

    /**
     * Gets the value of the dthCertSrlNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDthCertSrlNb() {
        return dthCertSrlNb;
    }

    /**
     * Sets the value of the dthCertSrlNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DeceasedStatusSD1 setDthCertSrlNb(String value) {
        this.dthCertSrlNb = value;
        return this;
    }

    /**
     * Gets the value of the issgJursdctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssgJursdctn() {
        return issgJursdctn;
    }

    /**
     * Sets the value of the issgJursdctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DeceasedStatusSD1 setIssgJursdctn(String value) {
        this.issgJursdctn = value;
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
