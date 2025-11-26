
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
 * Additional action to perform.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Action16", propOrder = {
    "tp",
    "othrTp",
    "dstn",
    "othrDstn",
    "dstnTp",
    "othrDstnTp",
    "dstnAdr",
    "ctct",
    "frmt",
    "othrFrmt",
    "cntt",
    "lang",
    "sgntr",
    "certId"
})
public class Action16 {

    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected ActionType14Code tp;
    @XmlElement(name = "OthrTp")
    protected String othrTp;
    @XmlElement(name = "Dstn")
    @XmlSchemaType(name = "string")
    protected PartyType34Code dstn;
    @XmlElement(name = "OthrDstn")
    protected String othrDstn;
    @XmlElement(name = "DstnTp")
    @XmlSchemaType(name = "string")
    protected ActionDestination1Code dstnTp;
    @XmlElement(name = "OthrDstnTp")
    protected String othrDstnTp;
    @XmlElement(name = "DstnAdr")
    protected String dstnAdr;
    @XmlElement(name = "Ctct")
    protected ContactPersonal1 ctct;
    @XmlElement(name = "Frmt")
    @XmlSchemaType(name = "string")
    protected OutputFormat4Code frmt;
    @XmlElement(name = "OthrFrmt")
    protected String othrFrmt;
    @XmlElement(name = "Cntt")
    protected List<AdditionalData1> cntt;
    @XmlElement(name = "Lang")
    protected String lang;
    @XmlElement(name = "Sgntr")
    protected byte[] sgntr;
    @XmlElement(name = "CertId")
    protected String certId;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ActionType14Code }
     *     
     */
    public ActionType14Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionType14Code }
     *     
     */
    public Action16 setTp(ActionType14Code value) {
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
    public Action16 setOthrTp(String value) {
        this.othrTp = value;
        return this;
    }

    /**
     * Gets the value of the dstn property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType34Code }
     *     
     */
    public PartyType34Code getDstn() {
        return dstn;
    }

    /**
     * Sets the value of the dstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType34Code }
     *     
     */
    public Action16 setDstn(PartyType34Code value) {
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
    public Action16 setOthrDstn(String value) {
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
    public Action16 setDstnTp(ActionDestination1Code value) {
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
    public Action16 setOthrDstnTp(String value) {
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
    public Action16 setDstnAdr(String value) {
        this.dstnAdr = value;
        return this;
    }

    /**
     * Gets the value of the ctct property.
     * 
     * @return
     *     possible object is
     *     {@link ContactPersonal1 }
     *     
     */
    public ContactPersonal1 getCtct() {
        return ctct;
    }

    /**
     * Sets the value of the ctct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPersonal1 }
     *     
     */
    public Action16 setCtct(ContactPersonal1 value) {
        this.ctct = value;
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
    public Action16 setFrmt(OutputFormat4Code value) {
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
    public Action16 setOthrFrmt(String value) {
        this.othrFrmt = value;
        return this;
    }

    /**
     * Gets the value of the cntt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cntt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCntt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     * @return
     *     The value of the cntt property.
     */
    public List<AdditionalData1> getCntt() {
        if (cntt == null) {
            cntt = new ArrayList<>();
        }
        return this.cntt;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Action16 setLang(String value) {
        this.lang = value;
        return this;
    }

    /**
     * Gets the value of the sgntr property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSgntr() {
        return sgntr;
    }

    /**
     * Sets the value of the sgntr property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public Action16 setSgntr(byte[] value) {
        this.sgntr = value;
        return this;
    }

    /**
     * Gets the value of the certId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertId() {
        return certId;
    }

    /**
     * Sets the value of the certId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Action16 setCertId(String value) {
        this.certId = value;
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

    /**
     * Adds a new item to the cntt list.
     * @see #getCntt()
     * 
     */
    public Action16 addCntt(AdditionalData1 cntt) {
        getCntt().add(cntt);
        return this;
    }

}
