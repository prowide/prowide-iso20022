
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Identification of partners involved in exchange from the merchant to the issuer, with the relative timestamp of their exchanges.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Traceability8", propOrder = {
    "rlayId",
    "prtcolNm",
    "prtcolVrsn",
    "tracDtTmIn",
    "tracDtTmOut"
})
public class Traceability8 {

    @XmlElement(name = "RlayId", required = true)
    protected GenericIdentification177 rlayId;
    @XmlElement(name = "PrtcolNm")
    protected String prtcolNm;
    @XmlElement(name = "PrtcolVrsn")
    protected String prtcolVrsn;
    @XmlElement(name = "TracDtTmIn", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tracDtTmIn;
    @XmlElement(name = "TracDtTmOut", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tracDtTmOut;

    /**
     * Gets the value of the rlayId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification177 }
     *     
     */
    public GenericIdentification177 getRlayId() {
        return rlayId;
    }

    /**
     * Sets the value of the rlayId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification177 }
     *     
     */
    public Traceability8 setRlayId(GenericIdentification177 value) {
        this.rlayId = value;
        return this;
    }

    /**
     * Gets the value of the prtcolNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtcolNm() {
        return prtcolNm;
    }

    /**
     * Sets the value of the prtcolNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Traceability8 setPrtcolNm(String value) {
        this.prtcolNm = value;
        return this;
    }

    /**
     * Gets the value of the prtcolVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtcolVrsn() {
        return prtcolVrsn;
    }

    /**
     * Sets the value of the prtcolVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Traceability8 setPrtcolVrsn(String value) {
        this.prtcolVrsn = value;
        return this;
    }

    /**
     * Gets the value of the tracDtTmIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getTracDtTmIn() {
        return tracDtTmIn;
    }

    /**
     * Sets the value of the tracDtTmIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Traceability8 setTracDtTmIn(XMLGregorianCalendar value) {
        this.tracDtTmIn = value;
        return this;
    }

    /**
     * Gets the value of the tracDtTmOut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getTracDtTmOut() {
        return tracDtTmOut;
    }

    /**
     * Sets the value of the tracDtTmOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Traceability8 setTracDtTmOut(XMLGregorianCalendar value) {
        this.tracDtTmOut = value;
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
