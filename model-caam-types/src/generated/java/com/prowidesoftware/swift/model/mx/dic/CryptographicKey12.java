
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
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
 * Cryptographic key.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CryptographicKey12", propOrder = {
    "nm",
    "id",
    "sctyDomnId",
    "addtlId",
    "vrsn",
    "seqCntr",
    "tp",
    "fctn",
    "actvtnDt",
    "deactvtnDt",
    "keyChckVal",
    "pblcKeyVal",
    "keyChcVal"
})
public class CryptographicKey12 {

    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "SctyDomnId")
    protected String sctyDomnId;
    @XmlElement(name = "AddtlId")
    protected byte[] addtlId;
    @XmlElement(name = "Vrsn")
    protected String vrsn;
    @XmlElement(name = "SeqCntr")
    protected BigDecimal seqCntr;
    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected CryptographicKeyType3Code tp;
    @XmlElement(name = "Fctn")
    @XmlSchemaType(name = "string")
    protected List<KeyUsage1Code> fctn;
    @XmlElement(name = "ActvtnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actvtnDt;
    @XmlElement(name = "DeactvtnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deactvtnDt;
    @XmlElement(name = "KeyChckVal")
    protected byte[] keyChckVal;
    @XmlElement(name = "PblcKeyVal")
    protected PublicRSAKey1 pblcKeyVal;
    @XmlElement(name = "KeyChcVal")
    protected KeyChoiceValue2 keyChcVal;

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CryptographicKey12 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CryptographicKey12 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the sctyDomnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctyDomnId() {
        return sctyDomnId;
    }

    /**
     * Sets the value of the sctyDomnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CryptographicKey12 setSctyDomnId(String value) {
        this.sctyDomnId = value;
        return this;
    }

    /**
     * Gets the value of the addtlId property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAddtlId() {
        return addtlId;
    }

    /**
     * Sets the value of the addtlId property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public CryptographicKey12 setAddtlId(byte[] value) {
        this.addtlId = value;
        return this;
    }

    /**
     * Gets the value of the vrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrsn() {
        return vrsn;
    }

    /**
     * Sets the value of the vrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CryptographicKey12 setVrsn(String value) {
        this.vrsn = value;
        return this;
    }

    /**
     * Gets the value of the seqCntr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeqCntr() {
        return seqCntr;
    }

    /**
     * Sets the value of the seqCntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CryptographicKey12 setSeqCntr(BigDecimal value) {
        this.seqCntr = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link CryptographicKeyType3Code }
     *     
     */
    public CryptographicKeyType3Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptographicKeyType3Code }
     *     
     */
    public CryptographicKey12 setTp(CryptographicKeyType3Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the fctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyUsage1Code }
     * 
     * 
     */
    public List<KeyUsage1Code> getFctn() {
        if (fctn == null) {
            fctn = new ArrayList<KeyUsage1Code>();
        }
        return this.fctn;
    }

    /**
     * Gets the value of the actvtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getActvtnDt() {
        return actvtnDt;
    }

    /**
     * Sets the value of the actvtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CryptographicKey12 setActvtnDt(XMLGregorianCalendar value) {
        this.actvtnDt = value;
        return this;
    }

    /**
     * Gets the value of the deactvtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getDeactvtnDt() {
        return deactvtnDt;
    }

    /**
     * Sets the value of the deactvtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CryptographicKey12 setDeactvtnDt(XMLGregorianCalendar value) {
        this.deactvtnDt = value;
        return this;
    }

    /**
     * Gets the value of the keyChckVal property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getKeyChckVal() {
        return keyChckVal;
    }

    /**
     * Sets the value of the keyChckVal property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public CryptographicKey12 setKeyChckVal(byte[] value) {
        this.keyChckVal = value;
        return this;
    }

    /**
     * Gets the value of the pblcKeyVal property.
     * 
     * @return
     *     possible object is
     *     {@link PublicRSAKey1 }
     *     
     */
    public PublicRSAKey1 getPblcKeyVal() {
        return pblcKeyVal;
    }

    /**
     * Sets the value of the pblcKeyVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicRSAKey1 }
     *     
     */
    public CryptographicKey12 setPblcKeyVal(PublicRSAKey1 value) {
        this.pblcKeyVal = value;
        return this;
    }

    /**
     * Gets the value of the keyChcVal property.
     * 
     * @return
     *     possible object is
     *     {@link KeyChoiceValue2 }
     *     
     */
    public KeyChoiceValue2 getKeyChcVal() {
        return keyChcVal;
    }

    /**
     * Sets the value of the keyChcVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyChoiceValue2 }
     *     
     */
    public CryptographicKey12 setKeyChcVal(KeyChoiceValue2 value) {
        this.keyChcVal = value;
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
     * Adds a new item to the fctn list.
     * @see #getFctn()
     * 
     */
    public CryptographicKey12 addFctn(KeyUsage1Code fctn) {
        getFctn().add(fctn);
        return this;
    }

}
