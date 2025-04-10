
package com.prowidesoftware.swift.model.mx.dic;

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
 * Additional action to perform.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalAction1", propOrder = {
    "tp",
    "dstn",
    "othrDstn",
    "dstnTp",
    "othrDstnTp",
    "dstnAdr",
    "frmt",
    "othrFrmt",
    "cntt"
})
public class AdditionalAction1 {

    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected ActionType10Code tp;
    @XmlElement(name = "Dstn")
    @XmlSchemaType(name = "string")
    protected PartyType21Code dstn;
    @XmlElement(name = "OthrDstn")
    protected String othrDstn;
    @XmlElement(name = "DstnTp")
    @XmlSchemaType(name = "string")
    protected ActionDestination1Code dstnTp;
    @XmlElement(name = "OthrDstnTp")
    protected String othrDstnTp;
    @XmlElement(name = "DstnAdr")
    protected String dstnAdr;
    @XmlElement(name = "Frmt")
    @XmlSchemaType(name = "string")
    protected OutputFormat4Code frmt;
    @XmlElement(name = "OthrFrmt")
    protected String othrFrmt;
    @XmlElement(name = "Cntt")
    protected Content1 cntt;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ActionType10Code }
     *     
     */
    public ActionType10Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionType10Code }
     *     
     */
    public AdditionalAction1 setTp(ActionType10Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the dstn property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType21Code }
     *     
     */
    public PartyType21Code getDstn() {
        return dstn;
    }

    /**
     * Sets the value of the dstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType21Code }
     *     
     */
    public AdditionalAction1 setDstn(PartyType21Code value) {
        this.dstn = value;
        return this;
    }

    /**
     * Gets the value of the othrDstn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrDstn() {
        return othrDstn;
    }

    /**
     * Sets the value of the othrDstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalAction1 setOthrDstn(String value) {
        this.othrDstn = value;
        return this;
    }

    /**
     * Gets the value of the dstnTp property.
     * 
     * @return
     *     possible object is
     *     {@link ActionDestination1Code }
     *     
     */
    public ActionDestination1Code getDstnTp() {
        return dstnTp;
    }

    /**
     * Sets the value of the dstnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionDestination1Code }
     *     
     */
    public AdditionalAction1 setDstnTp(ActionDestination1Code value) {
        this.dstnTp = value;
        return this;
    }

    /**
     * Gets the value of the othrDstnTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrDstnTp() {
        return othrDstnTp;
    }

    /**
     * Sets the value of the othrDstnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalAction1 setOthrDstnTp(String value) {
        this.othrDstnTp = value;
        return this;
    }

    /**
     * Gets the value of the dstnAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDstnAdr() {
        return dstnAdr;
    }

    /**
     * Sets the value of the dstnAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalAction1 setDstnAdr(String value) {
        this.dstnAdr = value;
        return this;
    }

    /**
     * Gets the value of the frmt property.
     * 
     * @return
     *     possible object is
     *     {@link OutputFormat4Code }
     *     
     */
    public OutputFormat4Code getFrmt() {
        return frmt;
    }

    /**
     * Sets the value of the frmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputFormat4Code }
     *     
     */
    public AdditionalAction1 setFrmt(OutputFormat4Code value) {
        this.frmt = value;
        return this;
    }

    /**
     * Gets the value of the othrFrmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrFrmt() {
        return othrFrmt;
    }

    /**
     * Sets the value of the othrFrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalAction1 setOthrFrmt(String value) {
        this.othrFrmt = value;
        return this;
    }

    /**
     * Gets the value of the cntt property.
     * 
     * @return
     *     possible object is
     *     {@link Content1 }
     *     
     */
    public Content1 getCntt() {
        return cntt;
    }

    /**
     * Sets the value of the cntt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Content1 }
     *     
     */
    public AdditionalAction1 setCntt(Content1 value) {
        this.cntt = value;
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
