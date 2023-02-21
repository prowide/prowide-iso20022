
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides additional information regarding corporate action date details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionDateSD4", propOrder = {
    "plcAndNm",
    "intrmAcctgStartDt",
    "dlistgDt",
    "exrcPrdBegnDt",
    "objctnDt",
    "exclsnDt",
    "proofOfClmFilgDt"
})
public class CorporateActionDateSD4 {

    @XmlElement(name = "PlcAndNm", required = true)
    protected String plcAndNm;
    @XmlElement(name = "IntrmAcctgStartDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar intrmAcctgStartDt;
    @XmlElement(name = "DlistgDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dlistgDt;
    @XmlElement(name = "ExrcPrdBegnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exrcPrdBegnDt;
    @XmlElement(name = "ObjctnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar objctnDt;
    @XmlElement(name = "ExclsnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exclsnDt;
    @XmlElement(name = "ProofOfClmFilgDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar proofOfClmFilgDt;

    /**
     * Gets the value of the plcAndNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcAndNm() {
        return plcAndNm;
    }

    /**
     * Sets the value of the plcAndNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionDateSD4 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the intrmAcctgStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getIntrmAcctgStartDt() {
        return intrmAcctgStartDt;
    }

    /**
     * Sets the value of the intrmAcctgStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionDateSD4 setIntrmAcctgStartDt(XMLGregorianCalendar value) {
        this.intrmAcctgStartDt = value;
        return this;
    }

    /**
     * Gets the value of the dlistgDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getDlistgDt() {
        return dlistgDt;
    }

    /**
     * Sets the value of the dlistgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionDateSD4 setDlistgDt(XMLGregorianCalendar value) {
        this.dlistgDt = value;
        return this;
    }

    /**
     * Gets the value of the exrcPrdBegnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getExrcPrdBegnDt() {
        return exrcPrdBegnDt;
    }

    /**
     * Sets the value of the exrcPrdBegnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionDateSD4 setExrcPrdBegnDt(XMLGregorianCalendar value) {
        this.exrcPrdBegnDt = value;
        return this;
    }

    /**
     * Gets the value of the objctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getObjctnDt() {
        return objctnDt;
    }

    /**
     * Sets the value of the objctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionDateSD4 setObjctnDt(XMLGregorianCalendar value) {
        this.objctnDt = value;
        return this;
    }

    /**
     * Gets the value of the exclsnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getExclsnDt() {
        return exclsnDt;
    }

    /**
     * Sets the value of the exclsnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionDateSD4 setExclsnDt(XMLGregorianCalendar value) {
        this.exclsnDt = value;
        return this;
    }

    /**
     * Gets the value of the proofOfClmFilgDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getProofOfClmFilgDt() {
        return proofOfClmFilgDt;
    }

    /**
     * Sets the value of the proofOfClmFilgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionDateSD4 setProofOfClmFilgDt(XMLGregorianCalendar value) {
        this.proofOfClmFilgDt = value;
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
