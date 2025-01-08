
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
 * Additional functions or services that have been or are to be performed in conjunction with the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalService2", propOrder = {
    "tp",
    "othrTp",
    "rslt",
    "othrRslt",
    "svcDtl"
})
public class AdditionalService2 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected AdditionalServiceType2Code tp;
    @XmlElement(name = "OthrTp")
    protected String othrTp;
    @XmlElement(name = "Rslt")
    @XmlSchemaType(name = "string")
    protected AdditionalServiceResult1Code rslt;
    @XmlElement(name = "OthrRslt")
    protected String othrRslt;
    @XmlElement(name = "SvcDtl")
    protected List<AdditionalData1> svcDtl;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalServiceType2Code }
     *     
     */
    public AdditionalServiceType2Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalServiceType2Code }
     *     
     */
    public AdditionalService2 setTp(AdditionalServiceType2Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the othrTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrTp() {
        return othrTp;
    }

    /**
     * Sets the value of the othrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalService2 setOthrTp(String value) {
        this.othrTp = value;
        return this;
    }

    /**
     * Gets the value of the rslt property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalServiceResult1Code }
     *     
     */
    public AdditionalServiceResult1Code getRslt() {
        return rslt;
    }

    /**
     * Sets the value of the rslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalServiceResult1Code }
     *     
     */
    public AdditionalService2 setRslt(AdditionalServiceResult1Code value) {
        this.rslt = value;
        return this;
    }

    /**
     * Gets the value of the othrRslt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrRslt() {
        return othrRslt;
    }

    /**
     * Sets the value of the othrRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalService2 setOthrRslt(String value) {
        this.othrRslt = value;
        return this;
    }

    /**
     * Gets the value of the svcDtl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the svcDtl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvcDtl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     * @return
     *     The value of the svcDtl property.
     */
    public List<AdditionalData1> getSvcDtl() {
        if (svcDtl == null) {
            svcDtl = new ArrayList<>();
        }
        return this.svcDtl;
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
     * Adds a new item to the svcDtl list.
     * @see #getSvcDtl()
     * 
     */
    public AdditionalService2 addSvcDtl(AdditionalData1 svcDtl) {
        getSvcDtl().add(svcDtl);
        return this;
    }

}
